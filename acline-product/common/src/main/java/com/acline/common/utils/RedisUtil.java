/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.acline.common.utils;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ArrayUtil;
import com.acline.common.constants.RedisConstant;
import com.alibaba.fastjson.JSON;
import org.junit.platform.commons.util.StringUtils;
import org.redisson.RedissonMultiLock;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * redis操作工具类
 * @author wanghui
 * @date 2019-12-27 09:54:56
 * @version $ Id: RedisUtil.java, v 0.1  wanghui Exp $
 */
@Component
public class RedisUtil implements ApplicationContextAware {

    private static final Logger logger     = LoggerFactory.getLogger(RedisUtil.class);
    private static final long   expiretime = 30L * 24L * 60L * 60L * 1000L;

    private static RedisTemplate<String, Object> redisTemplate;

    private static       RedissonClient redissonClient;
    private static final String         KEY_SPLIT_CHAR = ":";

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        redisTemplate = applicationContext.getBean("redisTemplate", RedisTemplate.class);
        redissonClient = applicationContext.getBean(RedissonClient.class);
    }

    /**
     * redis设值
     * @param key redis存储的key
     * @param value key对应的值
     * @return 成功返回true, 失败返回false
     * @date 2019/12/27
     */
    public static boolean set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            logger.error("RedisUtil#set key:{} value:{} error:{}", key, value, e);
            return false;
        }
    }

    public static boolean expireKey(String key) {
        if (existsKey(key)) {
            return Optional.ofNullable(redisTemplate.delete(key)).orElse(false);
        }
        return true;
    }

    public static boolean existsKey(String key) {
        return Optional.ofNullable(redisTemplate.persist(key)).orElse(false);
    }

    public static boolean hasKey(String key) {
        return Optional.ofNullable(redisTemplate.hasKey(key)).orElse(false);
    }

    /**
     * 设值，并设定过期时间
     * @param key redis key
     * @param value redis值
     * @param timeSeconds 过期时间，秒为单位
     * @return 当无过期时间或失败，返回false 成功返回true
     * @date 2019/12/27
     */
    public static boolean setExpire(String key, Object value, long timeSeconds) {
        try {
            if (timeSeconds < 0) {
                return false;
            }
            redisTemplate.opsForValue().set(key, value, timeSeconds, TimeUnit.SECONDS);
            return true;
        } catch (Exception ex) {
            logger.error("RedisUtil#setExpire key:{} value:{} timeSeconds:{} error:{}", key, value, timeSeconds, ex);
            return false;
        }
    }

    /**
     * 时间段内尝试获取锁， 获取锁的线程随机
     * 必须在finally中主动释放锁
     * @param lockName 锁名称
     * @param waitTime 线程获取锁等待时间 小于等于零表示立即获取
     * @param leaseTime 锁持有时间，超过将自动解锁
     * @param timeUnit 时间单位
     * @return 获取锁成功或失败
     * @date 2020/1/6
     */
    public static boolean lock(String lockName, long waitTime, long leaseTime, TimeUnit timeUnit) {
        logger.info("RedisUtil#lock lockName:{} waitTime:{} leaseTime:{}", lockName, waitTime, leaseTime);
        if (StringUtils.isBlank(lockName)) {
            return false;
        }
        try {
            lockName = RedisConstant.REDIS_RESOURCE_LOCK_PREFIX + lockName;
            RLock rLock = redissonClient.getLock(lockName);
            return rLock.tryLock(waitTime, leaseTime, timeUnit);
        } catch (Exception ex) {
            logger.error("RedisUtil#lock lockName:{} error:{}", lockName, ex);
            return false;
        }
    }

    /**
     * 立即获取锁， 获取锁的线程随机
     * 必须在finally中主动释放锁
     * @param lockName 锁名称
     * @param leaseTime 锁持有时间，超过将自动解锁
     * @param timeUnit 时间单位
     * @return 获取锁成功或失败
     * @date 2020/1/6
     */
    public static boolean lock(String lockName, long leaseTime, TimeUnit timeUnit) {
        return lock(lockName, 0L, leaseTime, timeUnit);
    }

    /**
     * 立即获取锁， 获取锁的线程随机
     * 三分钟自动释放
     * @param lockName 锁名称
     * @return 获取锁成功或失败
     * @date 2020/1/6
     */
    public static boolean lockAutoLeaseThreeMinute(String lockName) {
        return lock(lockName, 0L, 3, TimeUnit.MINUTES);
    }

    /**
     * 立即获取锁， 获取锁的线程随机
     * 不自动释放锁，必须在finally中主动释放锁
     * @param lockName 锁名称
     * @return 获取锁成功或失败
     * @date 2020/1/6
     */
    public static boolean lock(String lockName) {
        logger.info("RedisUtil#lock lockName:{}", lockName);
        if (StringUtils.isBlank(lockName)) {
            return false;
        }
        try {
            lockName = RedisConstant.REDIS_RESOURCE_LOCK_PREFIX + lockName;
            RLock rLock = redissonClient.getLock(lockName);
            return rLock.tryLock();
        } catch (Exception ex) {
            logger.error("RedisUtil#lock lockName:{} error:{}", lockName, ex);
            return false;
        }
    }

    /**
     * 获取lockName锁对象，并释放
     * @param lockName 锁名称
     * @date 2020/1/6
     */
    public static void unlock(String lockName) {
        logger.info("RedisUtil#unlock lockName:{}", lockName);
        if (StringUtils.isBlank(lockName)) {
            return;
        }
        try {
            lockName = RedisConstant.REDIS_RESOURCE_LOCK_PREFIX + lockName;
            RLock rLock = redissonClient.getLock(lockName);
            if (rLock.isHeldByCurrentThread()) {
                rLock.unlock();
            }
        } catch (Exception ex) {
            logger.error("RedisUtil#unlock lockName:{} error:{}", lockName, ex);
        }
    }

    /**
     * 获取lockName锁对象，并释放
     * @param lockName 锁名称
     * @date 2020/1/6
     */
    public static void unlock(String lockName, boolean heldLock) {
        if (!heldLock) {
            return;
        }
        unlock(lockName);
    }

    /**
     * 联锁，立即获取，所有锁都上锁成功才算成功
     * 未设置自动释放锁，调用者必须调用multiUnlock
     * @param lockNames 锁名称数组
     * @date 2020/1/6
     */
    public static boolean multiLock(long leaseTime, TimeUnit timeUnit, String... lockNames) {
        logger.info("RedisUtil#multiLock lockNames:{}", JSON.toJSONString(lockNames));
        if (ArrayUtil.isEmpty(lockNames)) {
            return false;
        }
        try {
            RedissonMultiLock redissonMultiLock = getMultiLock(lockNames);
            return redissonMultiLock.tryLock(-1, leaseTime, timeUnit);
        } catch (Exception ex) {
            logger.error("RedisUtil#multiLock lockNames:{} error:{}", JSON.toJSONString(lockNames), ex);
            return false;
        }
    }

    /**
     * 联锁，立即获取，所有锁都上锁成功才算成功
     * 未设置自动释放锁，调用者必须调用multiUnlock
     * @param lockNames 锁名称数组
     * @date 2020/1/6
     */
    public static boolean multiLockAutoLeaseThreeMinute(String... lockNames) {
        return multiLock(3, TimeUnit.MINUTES, lockNames);
    }

    /**
     * 联锁释放
     * @param lockNames 待释放的锁
     * @date 2020/1/6
     */
    public static void multiUnlock(String... lockNames) {
        logger.info("RedisUtil#multiUnlock lockNames:{}", JSON.toJSONString(lockNames));
        if (ArrayUtil.isEmpty(lockNames)) {
            return;
        }
        try {
            RedissonMultiLock redissonMultiLock = getMultiLock(lockNames);
            redissonMultiLock.unlock();
        } catch (Exception ex) {
            logger.error("RedisUtil#multiUnlock lockNames:{} error:{}", JSON.toJSONString(lockNames), ex);
        }
    }

    /**
     * 联锁持有释放
     * @param lockNames 待释放的锁
     * @date 2020/1/6
     */
    public static void multiUnlock(boolean heldLock, String... lockNames) {
        if (!heldLock) {
            return;
        }
        multiUnlock(lockNames);
    }

    /**
     * 获取联锁对象
     * @param lockNames 锁名称
     * @return 联锁对象
     * @date 2020/1/6
     */
    public static RedissonMultiLock getMultiLock(String... lockNames) {
        List<RLock> rLocks = new ArrayList<>();
        for (String lockName : lockNames) {
            RLock rLock = redissonClient.getLock(RedisConstant.REDIS_RESOURCE_LOCK_PREFIX + lockName);
            rLocks.add(rLock);
        }
        RedissonMultiLock redissonMultiLock = new RedissonMultiLock(rLocks.toArray(new RLock[rLocks.size()]));
        return redissonMultiLock;
    }

    /**
     * 存储数据
     * @param key
     * @param value
     * @param time
     */
    public void setStr(String key, Object value, Long time) {
        if (value == null) {
            return;
        }
        if (value instanceof String) {
            String obj = (String) value;
            redisTemplate.opsForValue().set(key, obj);
        } else if (value instanceof List) {
            List obj = (List) value;
            if(CollectionUtil.isEmpty(obj)){
                return;
            }
            redisTemplate.opsForList().rightPushAll(key, obj);
        } else if (value instanceof Map) {
            Map obj = (Map) value;
            redisTemplate.opsForHash().putAll(key, obj);
        }
        if (time == null) {
            time = expiretime;
        }
        redisTemplate.expire(key,time,TimeUnit.SECONDS);
    }

    /**
     * 获取数据
     * @param key
     * @return
     */
    public String getListByKey(String key) {
        String string = JSON.toJSONString(redisTemplate.opsForList().range(key, 0, -1));
        return string;
    }

    /**
     * 获取Hash数据
     * @param key
     * @param hashKey
     * @return
     */
    public Object getHashByKey(String key,String hashKey){
        return redisTemplate.opsForHash().get(key,hashKey);
    }

    public Map<Object,Object> getAllHash(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    public void setHashValue(String key,String hashKey,String hashValue){
        redisTemplate.opsForHash().put(key,hashKey,hashValue);
    }
    /**
     * 判断元素是否存在，类似于
     * @param key
     * @param hashKey
     * @return
     */
    public boolean hasKeyByHashKey(String key,String hashKey){
        return redisTemplate.opsForHash().hasKey(key,hashKey);
    }

    /**
     * 获取str数据
     * @param key
     * @return
     */
    public String getValueByKey(String key,String defaultVal){
        return Objects.toString(redisTemplate.opsForValue().get(key),defaultVal);
    }

    /**删除数据
     *
     * @param key
     */
    public void delKey(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 批量删除数据
     * @param keys
     */
    public void delKeys(Set<String> keys){
        redisTemplate.delete(keys);
    }

    public Set<String> getKeysByPattern(String pattern){
        return redisTemplate.keys(pattern);
    }

    /**
     * 简单封装key module ： class ，function：  key ：唯一识别
     * @param module
     * @param function
     * @param key
     * @return
     */
    public String redisKeyBuilder(String module, String function, String key) {
        StringBuilder keyBuilder = new StringBuilder();
        if (StringUtils.isBlank(module) || StringUtils.isBlank(function) || StringUtils.isBlank(key)) {
            return null;
        }
        keyBuilder = keyBuilder.append(module).append(KEY_SPLIT_CHAR).append(function).append(KEY_SPLIT_CHAR).append(key);
        return keyBuilder.toString();
    }
}


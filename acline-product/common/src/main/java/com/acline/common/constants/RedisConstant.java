/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 */
package com.acline.common.constants;

/**
 * @author wanghui
 * @date 2020-01-06 16:24:12
 * @version $ Id: RedisContant.java, v 0.1  wanghui Exp $
 */
public abstract class RedisConstant {

    /**
     * redis分布式锁名称前缀
     * @date 2020/1/6
     */
    public static final String REDIS_RESOURCE_LOCK_PREFIX = "resource:lock:";

    /**
     * redis分布式锁多个分割符
     * @date 2020/1/6
     */
    public static final String REDIS_RESOURCE_LOCK_SEPARATOR = "|";
    public static final String REDIS_RESOURCE_UNION_KEY = "_";

    /**
     * redis:resource_dic表缓存
     * @date 2021/08/26
     * @author fly.xue
     */
    public static final String REDIS_RESOURCE_DIC_CACHE_MODULE = "resource_dic";
    public static final String REDIS_RESOURCE_DIC_CACHE_FUNCTION = "cache";
    public static final String REDIS_RESOURCE_DIC_CACHE_ALL = "ALL";
    public static final String REDIS_RESOURCE_DIC_KEYS_SUFFIX = "*";

    /**
     * redis key的失效时间,秒级别
     * 一天，三天，一周，一个月，一年
     */

    public static final Long REDIS_EXPIRE_TEN_MINUTES = 60L * 10L;
    public static final Long REDIS_EXPIRE_ONE_HOUR = 60L * 60L;
    public static final Long REDIS_EXPIRE_ONE_DAY = 60L * 60L * 24L;
    public static final Long REDIS_EXPIRE_THREE_DAY = REDIS_EXPIRE_ONE_DAY * 3L;
    public static final Long REDIS_EXPIRE_ONE_WEEK = REDIS_EXPIRE_ONE_DAY * 7L;
    public static final Long REDIS_EXPIRE_ONE_MONTH = REDIS_EXPIRE_ONE_DAY * 30L;
    public static final Long REDIS_EXPIRE_ONE_YEAR = REDIS_EXPIRE_ONE_MONTH * 12L;
}

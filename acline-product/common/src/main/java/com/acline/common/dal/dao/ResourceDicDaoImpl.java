/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.acline.common.dal.dao;

import cn.hutool.core.util.StrUtil;
import com.acline.common.constants.RedisConstant;
import com.acline.common.dal.dao.dic.ResourceDicDao;
import com.acline.common.dal.dataobject.ResourceDicDO;
import com.acline.common.dal.mapper.ResourceDicDOMapper;
import com.acline.common.dto.dic.DicConfigDTO;
import com.acline.common.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author wanghui
 * @date 2019-12-26 14:47:31
 * @version $ Id: ResourceDicDaoImpl.java, v 0.1  wanghui Exp $
 */
@Repository
public class ResourceDicDaoImpl implements ResourceDicDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResourceDicDaoImpl.class);


    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private ResourceDicDOMapper resourceDicDOMapper;



    @Override
    public List<ResourceDicDO> getResourceDicByParentCodeAndCode(String parentCode, String code) {

        return resourceDicDOMapper.getResourceDicByParentCodeAndCode(parentCode, code);
    }

    @Override
    public boolean refreshCache(List<String> codeList) {
        Set<String> redisKeys = codeList.stream().map(e->redisUtil.redisKeyBuilder(RedisConstant.REDIS_RESOURCE_DIC_CACHE_MODULE,RedisConstant.REDIS_RESOURCE_DIC_CACHE_FUNCTION,e)).collect(Collectors.toSet());
        redisUtil.delKeys(redisKeys);
        return true;
    }

    @Override
    public boolean refreshAllCache() {
        StringBuilder keyBuilder = new StringBuilder();
        keyBuilder.append(RedisConstant.REDIS_RESOURCE_DIC_CACHE_MODULE).append(StrUtil.COLON).append(RedisConstant.REDIS_RESOURCE_DIC_CACHE_FUNCTION).append(RedisConstant.REDIS_RESOURCE_DIC_KEYS_SUFFIX);
        Set<String> keys = redisUtil.getKeysByPattern(keyBuilder.toString());
        redisUtil.delKeys(keys);
        return true;
    }



    @Override
    public List<String> queryDicValueByParentCode(String parentCode) {

        return  resourceDicDOMapper.queryDicValueByParentCode(parentCode);
    }


    /**
     * 判断是否除了排除的字段都为空
     * @param dicConfigDTO
     * @param excludeFileId
     * @return
     */
    private boolean otherFieldIsNull(DicConfigDTO dicConfigDTO,String excludeFileId){
        boolean flag = true;
        try{
            Field[] fields = dicConfigDTO.getClass().getDeclaredFields();
            for(Field field : fields){
                //允许访问私有属性
                field.setAccessible(true);
                //如果非原生字段，则跳过，主要为了解决jacoco问题
                if(field.isSynthetic()){
                    continue;
                }
                //跳过排除的字段
                if(excludeFileId.equals(field.getName())){
                    continue;
                }
                if("serialVersionUID".equals(field.getName())){
                    continue;
                }
                //只要有一个不为空，则返回false
                if(null != field.get(dicConfigDTO)){
                    flag = false;
                    break;
                }
            }
        }catch (IllegalAccessException e){
            return false;
        }
        return flag;
    }
}

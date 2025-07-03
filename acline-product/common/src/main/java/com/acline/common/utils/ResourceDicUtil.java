package com.acline.common.utils;

import com.acline.common.dal.dao.dic.ResourceDicDao;
import com.acline.common.dal.dataobject.ResourceDicDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * @author fly.xue
 * @title: ResourceDicUtil
 * @projectName ZenProjects
 * @description:
 * @date 2021/11/2011:29
 */
//@Component
public class ResourceDicUtil {
    private static final Logger logger     = LoggerFactory.getLogger(ResourceDicUtil.class);

//    @Autowired
    ResourceDicDao resourceDicDao;


    public List<ResourceDicDO> getByParentCodeAndCode(String parentCode, Object code){
        if(Objects.isNull(code)){
            return null;
        }
        return resourceDicDao.getResourceDicByParentCodeAndCode(parentCode,code.toString());
    }

}

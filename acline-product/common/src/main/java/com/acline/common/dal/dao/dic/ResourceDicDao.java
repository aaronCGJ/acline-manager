/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.acline.common.dal.dao.dic;

import com.acline.common.dal.dataobject.ResourceDicDO;
import com.acline.common.domain.DicConfigBO;
import com.acline.common.dto.dic.DicConfigDTO;

import java.util.List;

/**
 * @author wanghui
 * @date 2019-12-26 14:46:21
 * @version $ Id: DicConfigDao.java, v 0.1  wanghui Exp $
 */
public interface ResourceDicDao {

    /**
     * 获取指定条件的字典配置
     * @date 2019/12/26
     */

    List<ResourceDicDO>  getResourceDicByParentCodeAndCode(String parentCode,String code);

    boolean refreshCache(List<String> codeList);

    boolean refreshAllCache();


    List<String> queryDicValueByParentCode(String parentCode);
}

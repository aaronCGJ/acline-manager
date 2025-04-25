package com.acline.common.dal.mapper;

import com.acline.common.dal.dataobject.ResourceDicDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ResourceDicDOMapper {
    List<String> queryDicValueByParentCode(@Param("parentCode") String parentCode);

   List<ResourceDicDO>  getResourceDicByParentCodeAndCode(String parentCode, String code);
}

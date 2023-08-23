package com.acline.common.dal.mapper;

import com.acline.common.dal.base.basemapper.Mapper;
import com.acline.common.dal.dataobject.ProductUserDO;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ProductUserDOMapper extends Mapper<ProductUserDO> {
    List<ProductUserDO> selectUserList();

}
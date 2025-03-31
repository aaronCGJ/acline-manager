package com.acline.common.dal.mapper;

import com.acline.common.dal.base.basemapper.Mapper;
import com.acline.common.dal.dataobject.ResourceCrossConnectDO;
import com.acline.common.dto.CrossConnectPageDTO;
import com.acline.common.dto.CrossConnectQueryDTO;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
@org.apache.ibatis.annotations.Mapper
public interface ResourceCrossConnectDOMapper
//        extends Mapper<ResourceCrossConnectDO>
{


    List<CrossConnectPageDTO> listCrossConnect(CrossConnectQueryDTO queryDTO);
}

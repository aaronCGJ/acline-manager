package com.acline.common.dal.dao.impl;

import com.acline.common.dal.dao.circuit.CircuitDao;
import com.acline.common.dal.mapper.ResourceCrossConnectDOMapper;
import com.acline.common.dto.CrossConnectPageDTO;
import com.acline.common.dto.CrossConnectQueryDTO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
@Repository
public class CircuitDaoImpl implements CircuitDao {

    @Autowired
    ResourceCrossConnectDOMapper mapper;

    @Override
    public PageInfo<CrossConnectPageDTO> queryListPage(CrossConnectQueryDTO queryDTO) {

        PageHelper.startPage(queryDTO.getPageNum(), queryDTO.getPageSize());
        List<CrossConnectPageDTO> dtos = mapper.listCrossConnect(queryDTO);
        return  new PageInfo<CrossConnectPageDTO>(dtos);
    }
}

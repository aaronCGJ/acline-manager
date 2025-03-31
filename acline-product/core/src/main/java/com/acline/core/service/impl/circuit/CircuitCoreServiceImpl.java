package com.acline.core.service.impl.circuit;

import com.acline.common.dal.dao.circuit.CircuitDao;
import com.acline.common.dto.CrossConnectPageDTO;
import com.acline.common.dto.CrossConnectQueryDTO;
import com.acline.core.service.device.CircuitCoreService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
@Service
public class CircuitCoreServiceImpl implements CircuitCoreService {
    @Autowired
    CircuitDao circuitDao;

    @Override
    public PageInfo<CrossConnectPageDTO> queryListPage(CrossConnectQueryDTO queryDTO) {

        return circuitDao.queryListPage(queryDTO);
    }
}

package com.acline.core.service.device;

import com.acline.common.dto.CrossConnectPageDTO;
import com.acline.common.dto.CrossConnectQueryDTO;
import com.github.pagehelper.PageInfo;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
public interface CircuitCoreService {
    PageInfo<CrossConnectPageDTO> queryListPage(CrossConnectQueryDTO queryDTO);
}

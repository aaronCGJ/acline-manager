package com.acline.common.dal.dao.circuit;/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */

import com.acline.common.dto.CrossConnectPageDTO;
import com.acline.common.dto.CrossConnectQueryDTO;
import com.github.pagehelper.PageInfo;

/**
 * @author Aaron Chen
 */
public interface CircuitDao {
    PageInfo<CrossConnectPageDTO> queryListPage(CrossConnectQueryDTO queryDTO);
}

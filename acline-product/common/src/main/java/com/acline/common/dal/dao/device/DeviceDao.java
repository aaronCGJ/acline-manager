package com.acline.common.dal.dao.device;

import com.acline.common.dto.DeviceTotalAssetsDTO;
import com.acline.common.dto.DevicesQueryQO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2022/11/17 17:09
 * @Description:TODO
 */
public interface DeviceDao {
    List<DeviceTotalAssetsDTO> deviceTotalAssetsPage(DevicesQueryQO query);
}

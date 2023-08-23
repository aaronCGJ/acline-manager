package com.acline.core.service.device;

import com.acline.common.dto.DevicePageDTO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2022/11/17 17:11
 * @Description:TODO
 */

public interface DeviceCoreService {

    List<DevicePageDTO> queryDeviceList();
}

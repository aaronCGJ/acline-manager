package com.acline.core.service.device;

import com.acline.common.dto.DevicePageDTO;
import com.acline.common.dto.DeviceTotalAssetsDTO;
import com.acline.common.dto.DevicesQueryQO;
import com.acline.core.http.response.BssNewInstanceResponse;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2022/11/17 17:11
 * @Description:TODO
 */

public interface DeviceCoreService {

    List<DevicePageDTO> queryDeviceList();

    PageInfo<DeviceTotalAssetsDTO> deviceTotalAssetsPage(DevicesQueryQO query);

    BssNewInstanceResponse queryBssNewInstance(String searchValue);
}

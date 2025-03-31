package com.acline.core.service.impl.device;/**
 * @author Aaron Chen
 * @date：2022/11/17 17:13
 * @Description:TODO
 * @Version 1.0
 */

import com.acline.common.dal.dao.device.DeviceDao;
import com.acline.common.dto.DevicePageDTO;
import com.acline.common.dto.DeviceTotalAssetsDTO;
import com.acline.common.dto.DevicesQueryQO;
import com.acline.core.http.response.BssNewInstanceResponse;
import com.acline.core.service.device.DeviceCoreService;
import com.acline.utils.OssHttpUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2022/11/17 17:13
 * @Description:TODO
 */
@Service
public class DeviceCoreServiceImpl implements DeviceCoreService {
    @Autowired
    private DeviceDao deviceDao;
    @Autowired
    private OssHttpUtil ossHttpUtil;

    @Override
    public List<DevicePageDTO> queryDeviceList() {
        return null;
    }

    @Override
    public PageInfo<DeviceTotalAssetsDTO> deviceTotalAssetsPage(DevicesQueryQO query) {
        PageHelper.startPage(1, 500);
        List<DeviceTotalAssetsDTO> totalAssetsDTOS = deviceDao.deviceTotalAssetsPage(query);
        return new PageInfo<>(totalAssetsDTOS);

    }

    @Override
    public BssNewInstanceResponse queryBssNewInstance(String searchValue) {

        BssNewInstanceResponse response = ossHttpUtil.queryBssNewInstance(searchValue);
        return response;
    }
}

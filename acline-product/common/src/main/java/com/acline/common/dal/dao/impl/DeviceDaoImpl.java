package com.acline.common.dal.dao.impl;

import com.acline.common.dal.dao.device.DeviceDao;
import com.acline.common.dto.DeviceTotalAssetsDTO;
import com.acline.common.dto.DevicesQueryQO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/3/8 14:39
 * @Description:TODO
 */

@Repository
public class DeviceDaoImpl implements DeviceDao {


    @Override
    public List<DeviceTotalAssetsDTO> deviceTotalAssetsPage(DevicesQueryQO query) {
        return null;
    }
}

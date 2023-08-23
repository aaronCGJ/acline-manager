<<<<<<<< HEAD:acline-product/core/src/main/java/com/acline/core/core/service/impl/device/DeviceCoreServiceImpl.java
package com.acline.core.core.service.impl.device;/**
========
package com.acline.core.impl.device;/**
>>>>>>>> 439c194 (增加项目的docker构建):acline-product/core/src/main/java/com/acline/core/impl/device/DeviceCoreServiceImpl.java
 * @author Aaron Chen
 * @date：2022/11/17 17:13
 * @Description:TODO
 * @Version 1.0
 */

import com.acline.common.dto.DevicePageDTO;
import com.acline.core.core.service.device.DeviceCoreService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2022/11/17 17:13
 * @Description:TODO
 */
@Service
public class DeviceCoreServiceImpl implements DeviceCoreService {
    @Override
    public List<DevicePageDTO> queryDeviceList() {
        return null;
    }
}

package com.acline.app.web.device;

import acline.base.util.model.ResultInfo;
import com.acline.common.dto.DevicePageDTO;
import com.acline.core.core.service.device.DeviceCoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2022/11/16 14:26
 * @Description:TODO
 */
@RestController
@RequestMapping(value = "device")
public class DeviceController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeviceController.class);

    @Autowired
    private DeviceCoreService deviceCoreService;

    @RequestMapping("/deviceTest")
    public String deviceTest() {
        LOGGER.info("his is device controller|  enjoy,{}!", "aaron");
        return "this is device controller|  enjoy!";
    }


    @RequestMapping("/queryDeviceList")
    public ResultInfo<List<DevicePageDTO>> queryDeviceList() {

        List<DevicePageDTO> devicePageDTOS = deviceCoreService.queryDeviceList();
        LOGGER.info("/queryDeviceList,devicePageDTOS:{}", devicePageDTOS);
        return new ResultInfo<List<DevicePageDTO>>().succeed(devicePageDTOS);
    }


}

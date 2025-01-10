package com.acline.web.device;

import acline.base.util.model.ResultInfo;
import com.acline.common.dto.DevicePageDTO;
import com.acline.common.dto.DeviceTotalAssetsDTO;
import com.acline.common.dto.DevicesQueryQO;
import com.acline.core.service.device.DeviceCoreService;
import com.acline.web.device.annotion.ResourceUpdateParam;
import com.acline.web.request.DevicesQueryRO;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping("/queryTest")
    public ResultInfo<Boolean> queryTest(@Valid @RequestBody ResourceUpdateParam param) {

            Integer id = param.getId();
            Integer status = param.getStatus();
            Integer resourceType = param.getResourceType();
            LOGGER.info("queryTest,id:{},status:{},resourceType:{}",id,status,resourceType );

        return new ResultInfo<Boolean>().succeed();
    }

    @GetMapping("/deviceTotalAssetsPage")
    @ApiOperation(value = "设备总量和总值统计列表")
    public ResultInfo<PageInfo<DeviceTotalAssetsDTO>> deviceTotalAssetsPage(DevicesQueryRO ro){

        DevicesQueryQO query = new DevicesQueryQO();
        query.setOwner(ro.getOwner());
        query.setStatusList(ro.getStatusList());
        query.setTypeId(ro.getTypeId());

        PageInfo<DeviceTotalAssetsDTO> result = deviceCoreService.deviceTotalAssetsPage(query);
        return  new ResultInfo<PageInfo<DeviceTotalAssetsDTO>>().succeed(result);
    }


}

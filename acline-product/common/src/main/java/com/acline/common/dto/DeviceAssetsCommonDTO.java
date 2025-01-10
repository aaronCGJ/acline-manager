package com.acline.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Aaron Chen
 * @date：2025/1/7
 * @Description:设备数量和价格公共类
 * @Version 1.0
 */
@Data
public class DeviceAssetsCommonDTO {
    @ApiModelProperty(value = "设备数量")
    private Integer deviceCount;
    @ApiModelProperty(value = "设备价格")
    private Integer price;
}

package com.acline.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuwei
 * @description
 * @version $ Id: DeviceTypeResultDTO.java, v 0.1 2020-03-04 15:13:06 liuwei Exp $
 */
@Data
@ApiModel(value = "DeviceTypeResultDTO", description = "设备型号数据")
public class DeviceTypeResultDTO extends DeviceAssetsCommonDTO{

    @ApiModelProperty("主键id")
    private Integer id;

    @ApiModelProperty("型号名称")
    private String name;

    @ApiModelProperty("型号类型")
    private String type;

}

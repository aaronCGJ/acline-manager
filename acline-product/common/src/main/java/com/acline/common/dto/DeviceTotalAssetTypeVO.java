package com.zenlayer.oss.common.dto.oss.device;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Aaron Chen
 * @date：2025/1/8
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class DeviceTotalAssetTypeVO extends DeviceAssetsCommonDTO{
    @ApiModelProperty("设备类目ID")
    private Integer categoryId;
    @ApiModelProperty("设备类目名称")
    private String categoryName;
    @ApiModelProperty("设备类型ID")
    private Integer typeId;
    @ApiModelProperty("设备类型名称")
    private String typeName;
    @ApiModelProperty("国家ID")
    private Integer countryId;
    @ApiModelProperty("国家名称")
    private String countryName;

}

package com.zenlayer.oss.common.dto.oss.device;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/1/8
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class DeviceTotalAssetCategoryVO  extends DeviceAssetsCommonDTO{
    @ApiModelProperty("设备类目ID")
    private Integer categoryId;
    @ApiModelProperty("设备类目名称")
    private String categoryName;
    private Integer countryId;
    private String countryName;
    private List<DeviceTotalAssetTypeVO> typeList;

}




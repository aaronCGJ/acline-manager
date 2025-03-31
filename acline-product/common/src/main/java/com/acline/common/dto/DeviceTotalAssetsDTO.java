package com.acline.common.dto;

import com.acline.common.dto.DeviceAssetsCommonDTO;
import com.acline.common.dto.DeviceCategoryResultDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/1/7
 * @Description:
 * @Version 1.0
 */
@ApiModel(description = "设备资产信息汇总")
@Data
public class DeviceTotalAssetsDTO extends DeviceAssetsCommonDTO {
    private Integer countryId;
    private String countryName;
    private List<DeviceCategoryResultDTO> categoryList;

}

package com.acline.common.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/1/7
 * @Description:设备大类层面统计
 * @Version 1.0
 */
@Data
public class DeviceCategoryResultDTO extends DeviceAssetsCommonDTO{
    private Integer categoryId;
    private String categoryName;
    private List<DeviceTypeResultDTO> typeList;
}

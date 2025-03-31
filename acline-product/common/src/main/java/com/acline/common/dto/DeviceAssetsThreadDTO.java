package com.acline.common.dto;

import com.acline.common.dto.DeviceTotalAssetsDTO;
import lombok.Data;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/1/8
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class DeviceAssetsThreadDTO {
   private List<DeviceTotalAssetsDTO> assetsDTOList;
   private List<DeviceTotalAssetCategoryVO> categoryVOS;
   private List<DeviceTotalAssetTypeVO> typeVOS;

}

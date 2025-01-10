package com.acline.web.device.annotion;

import lombok.Data;

/**
 * @author Aaron Chen
 * @date：2024/8/6
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class ResourceUpdateParam {
    private Integer id;
    @CheckValueInArrayLimit(values = {1, 2, 4})
    private Integer status;
    private Integer resourceType;
}

/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.acline.common.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wanghui
 * @date 2019-12-26 14:13:45
 * @version $ Id: DicConfigBO.java, v 0.1  wanghui Exp $
 */
@Data
@ApiModel(value = "字典配置")
public class DicConfigBO {

    @ApiModelProperty(value = "父代码")
    private String parentCode;

    @ApiModelProperty(value = "字典代码")
    private String code;

    @ApiModelProperty(value = "字典英文名称, 模糊查询")
    private String nameEn;

    @ApiModelProperty(value = "字典中文名称, 模糊查询")
    private String nameZh;
}

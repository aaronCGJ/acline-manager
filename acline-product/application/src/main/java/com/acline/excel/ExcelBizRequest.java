/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 */
package com.acline.excel;

import com.acline.enums.ReturnTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author wanghui
 * @date 2020-03-09 14:37:15
 * @version $ Id: ExcelExportRequest.java, v 0.1  wanghui Exp $
 */
@Data
@ApiModel("Excel业务请求")
public class ExcelBizRequest {

	@ApiModelProperty(value = "约定的excel业务标识代码, 设备导出为:deviceExcelExport", required = true)
	@NotBlank(message = "bizCode.can.not.be.blank")
	private String bizCode;

	@ApiModelProperty(value = "约定的请求参数json")
	private String requestParamJson;

	@ApiModelProperty(value = "返回类型 0:AUTO 1:Excel 2:JSON, 不指定则AUTO")
	private ReturnTypeEnum returnType;
}

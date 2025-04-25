package com.acline.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExcelImportBizExceptionEnum  {

	ERROR_CELL_CONTENT(2, "Error cell content"),

	NO_CONTENT_FAIL(3, "No excel content"),

	MISSING_ROW_FAIL(4, "Missing row"),

	DATA_FORMAT_ERROR(5, "Data format error"),

	UNKNOWN_DATA_FAIL(6, "Unknown {}"),

	TOTAL_ROW_INCONSISTENT(7, "Total row inconsistent"),

	DATA_NOT_FOUND(8, "{} not found"),

	UNKNOWN_ERROR_FAIL(9, "Unknown error:{}, please contact oss!"),

	DEAL_FAIL(10, "Deal fail!"),

	ILLEGAL_UPLOAD(11, "Illegal upload"),

	ILLEGAL_DATA(12, "Illegal data"),

	ILLEGAL_PARAM(13, "Illegal param"),

	ERROR_TEMPLATE(14, "Please use a template to import");

	private final int ret;

	private final String msg;

}

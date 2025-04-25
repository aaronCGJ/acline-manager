package com.acline.core.excel;

import acline.base.util.model.ResultInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface ImportExcelBizManager extends ExcelBizManager {

	String DEFAULT_FIRST_SHEET_NAME = "Sheet1";

	/**
	 * excel导入
	 * @date 2020/8/28
	 */
	ResultInfo<Map<String, List<Object>>> importExcel(String paramJson, MultipartFile file);

	default String fileName() {
		return null;
	}
}

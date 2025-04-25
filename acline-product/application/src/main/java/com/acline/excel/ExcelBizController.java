/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 */
package com.acline.excel;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.acline.config.excel.TemplateInitializer;
import com.acline.config.excel.TemplateStructure;
import com.acline.core.excel.ExportExcelBizManager;
import com.acline.core.excel.ExportExcelDTO;
import com.acline.core.excel.InvoiceOrderFontStyleHandler;
import com.acline.factory.ExcelBizStrategyFactory;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static com.alibaba.excel.util.DateUtils.parseDate;

/**
 * excel导入导出
 * @author wanghui
 * @date 2020-03-09 11:19:24
 * @version $ Id: ExcelExportController.java, v 0.1  wanghui Exp $
 */

@RestController
@RequestMapping(value = "excel")
@Api(tags = "Excel.Manager", description = "excel导入导出")
@Slf4j
public class ExcelBizController {

	@GetMapping("/excelExport")
	@ApiOperation(value = "导出EXCEL", nickname = "excelExport")
	public void excelExport(@Valid ExcelBizRequest excelBizRequest, HttpServletResponse response) throws IOException {
		ExportExcelBizManager exportExcelBizManager =
				(ExportExcelBizManager) ExcelBizStrategyFactory.getExcelBizManager(excelBizRequest.getBizCode());
		ExportExcelDTO exportExcelDTO = exportExcelBizManager.excelExportContent(excelBizRequest.getRequestParamJson());
		response.setContentType("application/vnd.ms-excel");
		response.setCharacterEncoding("utf-8");
		// 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
		String fileName = URLEncoder.encode(exportExcelDTO.getFileName(), "UTF-8")
				.replaceAll("\\+", "%20");
		response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
		ExcelWriterBuilder writerBuilder = EasyExcel.write(response.getOutputStream(), exportExcelDTO.getDataClazz());
		if (CollUtil.isNotEmpty(exportExcelDTO.getWriteHandlers())) {
			exportExcelDTO.getWriteHandlers().forEach(writerBuilder::registerWriteHandler);
		}else{

				writerBuilder.registerWriteHandler(new InvoiceOrderFontStyleHandler()); // 手动注册

		}
		writerBuilder.sheet("Sheet1").doWrite(exportExcelDTO.getData());
	}

	@GetMapping("/queryParamDic")
	@ApiOperation(value = "查询excel导出模版", nickname = "queryParamDic")
	public TemplateStructure queryParamDic() {
		return TemplateInitializer.getTemplateStructure("EQ_TEMPID");

	}
	@GetMapping("/queryParamDicList")
	@ApiOperation(value = "查询所有excel导出模版", nickname = "queryParamDicList")
	public List<TemplateStructure> queryParamDicList() {
		return TemplateInitializer.getTemplateStructure();
	}




	public static void main(String[] args) throws ParseException {
		String datestr="2025-05-02";
		Date date = parseDate(datestr);
		Date date1 = calContractEndDate(date, 15);
		System.err.println(date1);

		DateTime tomorrow = DateUtil.tomorrow();
		String format = DateUtil.format(tomorrow, "yyyy-MM-dd");
		Date parsedDate = DateUtil.parse(format, "yyyy-MM-dd");

	}
	public static Date calContractEndDate(Date startDate, Integer term) {
		if (Objects.isNull(startDate) || Objects.isNull(term)) {
			return null;
		}
		int stDay = DateUtil.dayOfMonth(startDate);
		Date endDate = DateUtil.offsetDay(DateUtil.offsetMonth(startDate, term), -1);
		Date endDateEndOfMonth = DateUtil.endOfMonth(endDate);
		int lstDayOfEndMonth = DateUtil.dayOfMonth(endDateEndOfMonth);
		if (stDay > lstDayOfEndMonth) {
			endDate = endDateEndOfMonth;
		}
		return DateUtil.beginOfDay(endDate);
	}

}

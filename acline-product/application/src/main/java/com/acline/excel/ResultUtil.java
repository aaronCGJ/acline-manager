package com.acline.excel;

import acline.base.util.model.ResultInfo;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.acline.enums.ReturnTypeEnum;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static org.apache.commons.csv.CSVFormat.EXCEL;

public class ResultUtil {


	public static void jsonResponse1(ResultInfo<Map<String, List<Object>>> resultInfo, HttpServletResponse response) throws Exception {
		jsonResponse(resultInfo, response);
	}

	/**
	 * 注意:fileName 不包括拓展名
	 * @date 2024/10/31
	 */
	public static void autoResponse(String fileName, ResultInfo<Map<String, List<Object>>> resultInfo, HttpServletResponse response) throws Exception {
		boolean empty = resultInfo.getData().values().stream().flatMap(Collection::stream).collect(Collectors.toList()).isEmpty();
		if (empty) {
			jsonResponse1(resultInfo, response);
		}
		else {
			excelResponse(fileName, resultInfo, response);
		}
	}

	public static void jsonResponse(Object resultInfo, HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		response.getWriter().println(JSON.toJSONString(resultInfo));
	}


	/**
	 * 注意:fileName 不包括拓展名
	 * @date 2024/10/31
	 */
	public static void excelResponse(String fileName, ResultInfo<Map<String, List<Object>>> resultInfo,
			HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		String encodeFileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
		response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + encodeFileName + ".xlsx");
		response.setHeader("Access-Control-Expose-Headers", "Content-disposition");
		ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
		for (Entry<String, List<Object>> entry : resultInfo.getData().entrySet()) {
			String sheetName = entry.getKey();
			List<Object> data = entry.getValue();
			Class<?> dataClass = CollUtil.getElementType(data);
			WriteSheet writeSheet = EasyExcel.writerSheet(sheetName).head(dataClass).build();
			excelWriter.write(data, writeSheet);
		}
		excelWriter.finish();
	}

	/**
	 * 注意:fileName 不包括拓展名
	 * @date 2024/10/31
	 */
	public static void response(String fileName, ReturnTypeEnum returnType, ResultInfo<Map<String, List<Object>>> resultInfo,
								HttpServletResponse response) throws Exception {

		ReturnTypeEnum returnTypeEnum = ObjectUtil.defaultIfNull(returnType, ReturnTypeEnum.AUTO);
		fileName = StrUtil.blankToDefault(fileName, "result_" + DateUtil.format(DateUtil.date(), DatePattern.PURE_DATETIME_PATTERN));

		switch (returnTypeEnum) {
			case AUTO: {
				autoResponse(fileName, resultInfo, response);
				break;
			}
			case JSON: {
				jsonResponse1(resultInfo, response);
				break;
			}
			case EXCEL: {
				excelResponse(fileName, resultInfo, response);
				break;
			}
		}
	}

}



/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 */
package com.acline.core.excel;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.excel.write.handler.WriteHandler;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghui
 * @date 2020-03-09 15:15:34
 * @version $ Id: ExcelDTO.java, v 0.1  wanghui Exp $
 */
@Data
public class ExportExcelDTO {

	/**
	 * excel文件名,不带后缀
	 * @date 2020/3/9
	 */
	private String fileName;

	/**
	 * 数据类型
	 * @date 2020/3/9
	 */
	private Class dataClazz;

	/**
	 * excel数据
	 * @date 2020/3/9
	 */
	private List data;

	/**
	 * excel写处理
	 * @date 2021/7/5
	 */
	private List<WriteHandler> writeHandlers = new ArrayList<>();


	public void addWriteHandler(WriteHandler writeHandler) {
		this.writeHandlers.add(writeHandler);
	}

	public void addWriteHandlers(WriteHandler... writeHandlers) {
		CollUtil.addAll(this.writeHandlers, writeHandlers);
	}
}

/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 */
package com.acline.factory;

import com.acline.core.excel.ExcelBizManager;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * excel业务处理策略工厂
 * @author wanghui
 * @date 2020-03-09 14:33:32
 * @version $ Id: ExcelBizStrategyFactory.java, v 0.1  wanghui Exp $
 */
public class ExcelBizStrategyFactory {

	private static final Map<String, ExcelBizManager> bizManagerMap = new ConcurrentHashMap<>();

	public static void register(String bizCode, ExcelBizManager excelBizManager) {
		Assert.notNull(bizCode, "bizCode can't be null");
		bizManagerMap.put(bizCode, excelBizManager);
	}

	public static ExcelBizManager getExcelBizManager(String bizCode) {
		Assert.notNull(bizCode, "bizCode can't be null");
		ExcelBizManager excelBizManager = bizManagerMap.get(bizCode);
		return excelBizManager;
	}
}

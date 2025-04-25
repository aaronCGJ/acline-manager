package com.acline.core.excel;

import com.acline.factory.ExcelBizStrategyFactory;
import org.springframework.beans.factory.InitializingBean;

public interface ExportExcelBizManager extends ExcelBizManager, InitializingBean {

    /**
     * 获取导出数据
     *
     * @return
     * @date 2020/3/9
     */
    com.acline.core.excel.ExportExcelDTO excelExportContent(String paramJson);

    @Override
    default void afterPropertiesSet() {
        ExcelBizStrategyFactory.register(getBizCode(), this);
    }

}

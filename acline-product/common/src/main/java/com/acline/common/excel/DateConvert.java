
package com.acline.common.excel;
import com.acline.common.dto.ApInvoiceOrderDetailReportExcelDTO;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateConvert implements Converter<Date> {

    private static final Logger logger = LoggerFactory.getLogger(DateConvert.class);

    @Override
    public Class<Date> supportJavaTypeKey() {
        return Date.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return null;
    }

    @Override
    public CellData<String> convertToExcelData(Date value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {

        if (value == null) {
            return new CellData<String>();
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        logger.info("convertToExcelData value:{},contentProperty:{},result:{}",value,contentProperty,sdf.format(value));
        return new CellData<>(sdf.format(value));
    }

    @Override
    public Date convertToJavaData(CellData cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
        if (cellData == null || cellData.getStringValue() == null) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse(cellData.getStringValue());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format", e);
        }
    }

    public static void main(String[] args) {
        String fileName = "ap_invoice_order_detail_report.xlsx";
        List<ApInvoiceOrderDetailReportExcelDTO> dataList = new ArrayList<>();

        // 添加一些示例数据
        ApInvoiceOrderDetailReportExcelDTO data = new ApInvoiceOrderDetailReportExcelDTO();
        data.setStartDate(new Date());
        data.setEndDate(new Date());
        dataList.add(data);

        // 使用 EasyExcel 写入数据
        EasyExcel.write(fileName, ApInvoiceOrderDetailReportExcelDTO.class)
                .sheet("Sheet1")
                .doWrite(dataList);
    }
}

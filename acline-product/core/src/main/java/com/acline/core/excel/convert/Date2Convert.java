package com.acline.core.excel.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Aaron Chen
 * @date：2025/3/20
 * @Description:
 * @Version 1.0
 */
public class Date2Convert implements Converter<Date> {


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

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return new CellData<>(sdf.format(value));
    }

    @Override
    public Date convertToJavaData(CellData cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
        if (cellData == null || cellData.getStringValue() == null) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            return sdf.parse(cellData.getStringValue());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format", e);
        }
    }
}

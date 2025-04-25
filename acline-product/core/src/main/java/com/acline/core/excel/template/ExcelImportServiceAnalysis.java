package com.acline.core.excel.template;

import acline.base.util.model.ResultInfo;
import com.acline.config.excel.ImportResult;
import com.acline.config.excel.TemplateColumn;
import com.acline.config.excel.TemplateInitializer;
import com.acline.config.excel.TemplateStructure;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author Aaron Chen
 * @date：2025/4/23
 * @Description:TODO
 * @Version 1.0
 */
@Service
public class ExcelImportServiceAnalysis {

@Autowired
    TemplateInitializer templateInitializer;

    /**
     * 处理Excel导入
     * @param templateId 模板ID
     * @param file 用户上传的Excel文件
     * @return 导入结果
     */
    public ResultInfo<Boolean> importExcel(String templateId, MultipartFile file) {
        ResultInfo<Boolean> objectResultInfo = new ResultInfo<>();
        try (InputStream inputStream = file.getInputStream()) {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            // 获取模板结构
            TemplateStructure template = TemplateInitializer.getTemplateStructure(templateId);
            if (template == null) {
                throw new IllegalArgumentException("未找到对应模板: " + templateId);
            }

            // 验证模板匹配
            if (!validateTemplateMatch(sheet, template)) {
                 ImportResult.fail("上传文件与模板不匹配");
            }

            // 提取数据
            List<Map<String, Object>> data = extractDataFromSheet(sheet, template);

             ImportResult.success(data);
        } catch (IOException e) {
            throw new RuntimeException("处理Excel文件失败", e);
        }
        return objectResultInfo;
    }

    /**
     * 验证上传文件是否匹配模板
     */
    private boolean validateTemplateMatch(Sheet sheet, TemplateStructure template) {
        Row headerRow = sheet.getRow(template.getHeaderRowIndex());
        if (headerRow == null) {
            return false;
        }

        // 检查列标题是否匹配
        for (TemplateColumn column : template.getTempColumns()) {
            Cell cell = headerRow.getCell(column.getColumnIndex());
            if (cell == null || !column.getHeaderName().equals(getCellValueAsString(cell))) {
                return false;
            }
        }

        return true;
    }

    /**
     * 从工作表中提取数据
     */
    private List<Map<String, Object>> extractDataFromSheet(Sheet sheet, TemplateStructure template) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        int startRow = template.getDataStartRowIndex();
        int endRow = sheet.getLastRowNum();
        for (int i = startRow; i <= endRow; i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;
            Map<String, Object> rowData = new HashMap<>();
            boolean hasData = false;
            for (TemplateColumn column : template.getTempColumns()) {
                Cell cell = row.getCell(column.getColumnIndex());
                Object value = getCellValue(cell, column.getDataType());
                if (value != null) {
                    hasData = true;
                }
                rowData.put(column.getFieldName(), value);
            }
            if (hasData) {
                dataList.add(rowData);
            }
        }

        return dataList;
    }

    /**
     * 获取单元格值
     */
    private Object getCellValue(Cell cell, Class<?> dataType) {
        if (cell == null) {
            return null;
        }

        try {
            if (dataType == String.class) {
                return getCellValueAsString(cell);
            } else if (dataType == Integer.class) {
                return (int) cell.getNumericCellValue();
            } else if (dataType == Double.class) {
                return cell.getNumericCellValue();
            } else if (dataType == Date.class) {
                return cell.getDateCellValue();
            } else if (dataType == Boolean.class) {
                return cell.getBooleanCellValue();
            }
        } catch (Exception e) {
            // 类型转换失败
            return null;
        }

        return null;
    }

    /**
     * 获取单元格字符串值
     */
    private String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return null;
        }

        switch (cell.getCellTypeEnum()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}

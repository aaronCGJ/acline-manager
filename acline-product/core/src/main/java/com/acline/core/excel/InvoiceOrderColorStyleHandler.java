package com.acline.core.excel;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.AbstractCellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class InvoiceOrderColorStyleHandler extends AbstractCellWriteHandler {
    Logger logger = LoggerFactory.getLogger(InvoiceOrderColorStyleHandler.class);


    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<CellData> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {

        if (cell == null) {
            return; // 空指针检查
        }
        int rowIndex = cell.getRowIndex();
        int columnIndex = cell.getColumnIndex();
        Row row = cell.getRow();

        if (row == null) {
            return; // 空指针检查
        }
        Workbook workbook = writeSheetHolder.getSheet().getWorkbook();

        if(isHead){
            Font font = workbook.createFont();
            CellStyle style = workbook.createCellStyle();
            font.setFontHeightInPoints((short) 10);
            font.setFontName("仿宋");
            font.setBold(true);
            style.setAlignment(HorizontalAlignment.CENTER);
            cell.setCellStyle(style);
        }else  if (columnIndex == 32 && rowIndex > 0) {
            if (CellType.NUMERIC == cell.getCellTypeEnum()) { // 检查单元格内容是否为数字
                int stringCellValue = (int) Math.round(cell.getNumericCellValue()); // 更安全的类型转换
                if (stringCellValue == 2) {
                    for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
                        Cell cell1 = row.getCell(i);
                        if (cell1 != null) {
                            Font font = workbook.createFont();
                            CellStyle style = workbook.createCellStyle();
                            font.setFontHeightInPoints((short) 10);
                            font.setColor(Font.COLOR_RED);
                            style.setFont(font);
                            cell1.setCellStyle(style);
                        }
                    }
                }
            }
        }
        row.removeCell(row.getCell(32));
    }

}

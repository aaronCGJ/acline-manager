package com.acline.core.excel;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.AbstractCellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/4/14
 * @Description:
 * @Version 1.0
 */
public class InvoiceOrderFontStyleHandler extends AbstractCellWriteHandler {

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<CellData> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
        Font font = workbook.createFont();
        CellStyle style = workbook.createCellStyle();
        font.setFontHeightInPoints((short) 10);
        style.setFont(font);
        cell.setCellStyle(style);
    }



    public static void main(String[] args) {

    }


}

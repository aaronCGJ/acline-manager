package com.acline.core.excel;

import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.ApInvoiceOrderDetailExcelDTO;
import com.acline.common.dto.InvoiceSearchDTO;
import com.acline.core.excel.convert.DataConvertUtils;
import com.acline.core.service.InvoiceCoreService;
import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/2/28
 * @Description:TODO
 * @Version 1.0
 */
@Component
public class ApInvoiceDetailExportManagerImpl implements ExportExcelBizManager, InitializingBean {

    private static final String FILE_NAME = "AP账单明细";

    @Autowired
    private InvoiceCoreService invoiceCoreService;
    @Autowired
    private DataConvertUtils convertUtils;

    @Override
    public ExportExcelDTO excelExportContent(String paramJson) {
        InvoiceSearchDTO queryDTO = JSON.parseObject(paramJson, InvoiceSearchDTO.class);
        List<InvoiceOrderDetailBO> orderDetailBOS = invoiceCoreService.invoiceDetailPage(queryDTO);
        ExportExcelDTO exportExcelDTO = new ExportExcelDTO();
        List<ApInvoiceOrderDetailExcelDTO> exportBOS
                = new ArrayList<>();
        convertUtils.invoiceDetailDataConvert(orderDetailBOS,exportBOS);
        exportExcelDTO.setData(exportBOS);
        exportExcelDTO.setDataClazz(ApInvoiceOrderDetailExcelDTO.class);
        String fileName = FILE_NAME;
        exportExcelDTO.setFileName(fileName);
        exportExcelDTO.addWriteHandler(new InvoiceOrderFontStyleHandler());
//        exportExcelDTO.addWriteHandler(new InvoiceOrderColorStyleHandler());
        return exportExcelDTO;
    }


    @Override
    public String getBizCode() {
        return "AP-ORDER-DETAIL-BIZ";
    }
}

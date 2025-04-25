package com.acline.core.excel;

import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.ApInvoiceOrderDetailReportExcelDTO;
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
 * @Description:AP账单明细报表导出
 * @Version 1.0
 */
@Component
public class ApInvoiceDetailReportExportManagerImpl implements ExportExcelBizManager , InitializingBean {
    private static final String FILE_NAME = "AP账单明细报表";
    @Autowired
    private InvoiceCoreService invoiceCoreService;

    @Autowired
    DataConvertUtils convertUtils;;

    @Override
    public ExportExcelDTO excelExportContent(String paramJson) {

        InvoiceSearchDTO queryDTO = JSON.parseObject(paramJson, InvoiceSearchDTO.class);
        List<InvoiceOrderDetailBO> orderDetailBOS = invoiceCoreService.invoiceDetailPage(queryDTO);
        ExportExcelDTO exportExcelDTO = new ExportExcelDTO();
        List<ApInvoiceOrderDetailReportExcelDTO> exportBOS
                = new ArrayList<>();
        convertUtils.invoiceDetailReportDataConvert(orderDetailBOS,exportBOS);
        exportExcelDTO.setData(exportBOS);
        exportExcelDTO.setDataClazz(ApInvoiceOrderDetailReportExcelDTO.class);
        String fileName = FILE_NAME;
        exportExcelDTO.setFileName(fileName);
        exportExcelDTO.addWriteHandler( new InvoiceOrderColorStyleHandler());
        return exportExcelDTO;
    }

    @Override
    public String getBizCode() {
        return "AP-DETAIL-REPORT-BIZ";
    }
}

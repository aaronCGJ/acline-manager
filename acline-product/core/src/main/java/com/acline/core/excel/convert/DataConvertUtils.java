package com.acline.core.excel.convert;

import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.ApInvoiceOrderDetailExcelDTO;
import com.acline.common.dto.ApInvoiceOrderDetailReportExcelDTO;
import com.acline.core.service.InstAndSubscriptionCoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * @author Aaron Chen
 * @date：2025/2/28
 * @Description:TODO
 * @Version 1.0
 */
@Component
public class DataConvertUtils {

    public void invoiceDetailDataConvert(List<InvoiceOrderDetailBO> orderDetailBOS, List<ApInvoiceOrderDetailExcelDTO> exportBOS) {
        if (Objects.isNull(orderDetailBOS)) {
            return;
        }
        orderDetailBOS.forEach(orderDetailBO -> {
            ApInvoiceOrderDetailExcelDTO templateExcelDTO = new ApInvoiceOrderDetailExcelDTO();
            BeanUtils.copyProperties(orderDetailBO, templateExcelDTO);
            templateExcelDTO.setFacName(spellFacName(orderDetailBO));
            templateExcelDTO.setPurchaseTypeValue(purchaseTypeEnum(orderDetailBO.getPurchaseType()));
            templateExcelDTO.setQuoteModeValue(quoteModeEnum(orderDetailBO.getQuoteMode()));
            templateExcelDTO.setTypeValue(invoiceTypeEnum(orderDetailBO.getType()));
            exportBOS.add(templateExcelDTO);
        });
    }

    public void invoiceDetailReportDataConvert(List<InvoiceOrderDetailBO> orderDetailBOS, List<ApInvoiceOrderDetailReportExcelDTO> exportBOS) {
        if (Objects.isNull(orderDetailBOS)) {
            return;
        }
        orderDetailBOS.forEach(orderDetailBO -> {
            ApInvoiceOrderDetailReportExcelDTO templateExcelDTO = new ApInvoiceOrderDetailReportExcelDTO();
            BeanUtils.copyProperties(orderDetailBO, templateExcelDTO);
            templateExcelDTO.setFacName(spellFacName(orderDetailBO));
            templateExcelDTO.setPurchaseTypeValue(purchaseTypeEnum(orderDetailBO.getPurchaseType()));
            templateExcelDTO.setQuoteModeValue(quoteModeEnum(orderDetailBO.getQuoteMode()));
            templateExcelDTO.setTypeValue(invoiceTypeEnum(orderDetailBO.getType()));
            exportBOS.add(templateExcelDTO);
        });
    }


    private String spellFacName(InvoiceOrderDetailBO orderDetailBO) {
        StringBuilder facName = new StringBuilder();
        if (Objects.nonNull(orderDetailBO.getFacNameA())) {
            facName.append(orderDetailBO.getFacNameA());
        }

        if (Objects.isNull(orderDetailBO.getFacNameZ())) {
            facName.append("_");
            facName.append(orderDetailBO.getFacNameZ());
        }
        String strName = facName.toString();
        if(strName.startsWith("_")){
            strName = strName.substring(1);
        }
        return strName;
    }


    private String purchaseTypeEnum(Integer purchaseType) {
        try {
         return "自定义";
        } catch (IllegalArgumentException ex) {
            return "";
        }
    }
    private String invoiceTypeEnum(Integer invoiceType  ) {
        try {
            return "自定义";
        } catch (IllegalArgumentException ex) {
            return "";
        }
    }

    private String quoteModeEnum(Integer quoteMode) {
        try {
            return "自定义";
        } catch (IllegalArgumentException ex) {
            return "";
        }
    }



}

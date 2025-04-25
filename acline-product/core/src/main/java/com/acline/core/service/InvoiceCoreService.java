package com.acline.core.service;

import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.InvoiceSearchDTO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/4/15
 * @Description:TODO
 * @Version
 */
public interface InvoiceCoreService {
    List<InvoiceOrderDetailBO> invoiceDetailPage(InvoiceSearchDTO searchDTO);

}

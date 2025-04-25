package com.acline.common.dal.dao.invoice;

import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.InvoiceSearchDTO;

import java.util.List;

public interface InvoiceDetailDAO  {

	List<InvoiceOrderDetailBO> invoiceDetailPage(InvoiceSearchDTO searchDTO);

}

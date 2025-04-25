package com.acline.common.dal.mapper;

import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.InvoiceSearchDTO;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PurchaseInvoiceDetailDOMapper  {

	List<InvoiceOrderDetailBO> invoiceDetailPage(InvoiceSearchDTO searchDTO);

}

package com.acline.common.dal.dao.impl;

import com.acline.common.dal.dao.invoice.InvoiceDetailDAO;
import com.acline.common.dal.mapper.PurchaseInvoiceDetailDOMapper;
import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.InvoiceSearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceDetailDAOImpl

		implements InvoiceDetailDAO {
	
        @Autowired
	private PurchaseInvoiceDetailDOMapper invoiceDetailDOMapper;
	@Override
	public List<InvoiceOrderDetailBO> invoiceDetailPage(InvoiceSearchDTO searchDTO) {
		return invoiceDetailDOMapper.invoiceDetailPage(searchDTO);
	}

}

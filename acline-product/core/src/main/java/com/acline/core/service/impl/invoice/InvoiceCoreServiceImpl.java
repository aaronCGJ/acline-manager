package com.acline.core.service.impl.invoice;

import com.acline.common.dal.dao.invoice.InvoiceDetailDAO;
import com.acline.common.domain.InvoiceOrderDetailBO;
import com.acline.common.dto.InvoiceSearchDTO;
import com.acline.core.service.InvoiceCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceCoreServiceImpl implements InvoiceCoreService {

	@Autowired
	InvoiceDetailDAO detailDAO;

	@Override
	public List<InvoiceOrderDetailBO> invoiceDetailPage(InvoiceSearchDTO searchDTO) {
		return detailDAO.invoiceDetailPage(searchDTO);
	}
}

package com.acline.common.dal.dao;

import com.acline.common.dal.mapper.PurchaseQuoteChangeDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseQuoteChangeDAOImpl
		implements PurchaseQuoteChangeDAO {

	@Autowired
	private PurchaseQuoteChangeDOMapper mapper;
	@Override
	public boolean existPreQuoteChange(String preDeliveryNo) {
//		String deliveryNoCopy=preDeliveryNo;
		return mapper.existPreQuoteChange(preDeliveryNo) > 0;
	}
}

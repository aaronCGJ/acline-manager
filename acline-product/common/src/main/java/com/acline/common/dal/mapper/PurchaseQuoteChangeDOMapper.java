package com.acline.common.dal.mapper;

import org.apache.ibatis.annotations.Param;

@org.apache.ibatis.annotations.Mapper
public interface PurchaseQuoteChangeDOMapper  {

    /**
     * 查询PO明细被变更的记录
     * @date 2021/9/15
     */


    int existPreQuoteChange(@Param("preDeliveryNo")String preDeliveryNo
//            ,@Param("deliveryNoCopy") String deliveryNoCopy
    );
}

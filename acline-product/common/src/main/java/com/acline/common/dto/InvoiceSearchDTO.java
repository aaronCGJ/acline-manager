package com.acline.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/2/27
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class InvoiceSearchDTO {
    /**
     * 账单ID
     */
    private Integer invoiceId;
    /**
     * 供应商ID
     */
    private List<Integer> supplierIds;
        /**
         * 签约主体ID
         */
    private  List<Integer> signEntitys;
    /**
     *明细出账日期
     */
    private String invoiceDate;
    /**
     *账单出账日期
     */
    private String invoiceDate2;
    /**
     * 计费开始日期
     */
    private Date startDate;
    /**
     * 计费结束日期
     */
    private Date endDate;
    /**
     * 对账状态
     */
    private List<Integer> allCheckStatus;

    /**
     * 支付类型 0:MRC 1:NRC 2 :Overage
     */
    private  List<Integer> paymentTypes;
    /**
     * 币种
     */
    private String currency;

    private List<String> orderByClauses;
    private Integer pageNum;
    private Integer pageSize;

    private String queryValue;

}

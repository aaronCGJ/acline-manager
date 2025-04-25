package com.acline.common.dto;

import com.acline.common.excel.DateConvert;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Aaron Chen
 * @date：2025/2/28
 * @Description:Ap账单明细模板
 * @Version 1.0
 */
@ColumnWidth(15)
@Data
public class ApInvoiceOrderDetailExcelDTO {

    /**
     * 账单编号
     */
    @ExcelProperty(value = "Invoice ID",index = 0)
    private String invoiceOrderNo;

    /**
     * 供应商名称
     */
    @ExcelProperty( value = "Vendor",index = 1)
    private String supplierName;

    /**
     * 明细ID
     */
    @ExcelProperty(value = "ID",index = 2)
    private Integer id;


    /**
     * 报价订单号
     */
    @ExcelProperty( value = "PO",index = 3)
    private String quoteOrderNo;

    /**
     * 币种
     */
    @ExcelProperty( value = "Currency",index = 4)
    private String currency;


    /**
     * PR明细编号
     */
    @ExcelProperty( value = "PR#",index = 5)
    private String requestDetailNo;

    @ExcelProperty(value = "Deduction ID",index=6)
    private Integer deductionId;


    /**
     * BV代码
     */
    @ExcelProperty( value = "BV Code",index = 7)
    private String bvCode;


    /**
     * SKU描述英文
     */
    @ExcelProperty( value = "SKU",index = 8)
    private String skuDescriptionEn;

    /**
     * 账单所含订购量合计
     */
    @ExcelProperty( value = "QTY",index = 9)
    private BigDecimal qty;


    /**
     * sku单位英文
     */
    @ExcelProperty( value = "Unit",index = 10)
    private String skuUnitEn;

    /**
     * tax method
     * 0:税前  1 :税后
     */
    @ExcelProperty(value = "Tax Method",index = 11)
    private String quoteModeValue;

    /**
     * 原始金额
     */
    @ExcelProperty( value = "Original Amount",index = 12)
    private BigDecimal originalAmount;
    /**
     * 单价
     */
    @ExcelProperty( value = "Amount",  index = 13)
    private BigDecimal amount;


    /**
     * 类型 0:MRC 1:NRC 2:Overage
     */
    @ExcelProperty(value = "Type", index = 14)
    private String typeValue;


    @ExcelProperty(value = "Product Line", index = 15)
    private String budgetUnitName;

    @ExcelProperty(value = "Term Rate(%)", index = 16)
    private String termRateValue;

    /**
     * 数量金额 qty * amount 即PO Amount
     */
    @ExcelProperty( value = "PO Amount",index =17)
    private BigDecimal qtyAmount;


    /**
     * 税率
     */
    @ExcelProperty( value = "Tax Rate(%)",index = 18)
    private String taxRateValue;


    /**
     * 税额 taxrate * amount
     */
    @ExcelProperty(value = "Tax Amount",index = 19)
    private BigDecimal taxAmount;


    /**
     * 折扣率
     */
    @ExcelProperty( value = "Discount Rate(%)",index = 20)
    private String discountRateValue;


    /**
     * 折扣金额 discount rate * amount
     */
    @ExcelProperty( value = "Discount Amount",index = 21)
    private BigDecimal discountAmount;


    /**
     * 支付金额 qty amount - discount amount + tax amount
     */
    @ExcelProperty(value = "Gamount",index = 22)
    private BigDecimal gemount;

    /**
     * 机房名称
     */
    @ExcelProperty( value = "Data Center",index = 23)
    private String facName;

    /**
     * 计费开始日期
     */
    @ExcelProperty( value = "Billing Date",converter = DateConvert.class,index = 24)
    private Date billingStartDate;

    /**
     * billing Days
     */
    @ExcelProperty( value = "Billing Days",converter = DateConvert.class,index = 25)
    private Date invoiceDate;

    /**
     * 账单开始日期
     */
    @ExcelProperty( value = "Term Start Date",converter = DateConvert.class,index = 26)
    private Date startDate;

    /**
     * 账单结束日期
     */
    @ExcelProperty( value = "Term End Date",converter = DateConvert.class,index = 27)
    private Date endDate;


    /**
     * 采购类型
     */
    @ExcelProperty( value = "Purchase Type",index = 28)
    private String purchaseTypeValue;

    /**
     * 账单规则
     */
    @ExcelProperty( value = "Billing Rules",index = 29)
    private String invoiceRuleName;

    /**
     * 交付实例编号
     */
    @ExcelProperty( value = "PW",index = 30)
    private String deliveryInstanceCode;

    @ExcelProperty( value = "Original PO",index = 31)
    private String originQuoteNo;
    /**
     * 减免类型
     */
    @ExcelProperty( value = "deductionModel",index = 32)
    public  Integer deductionModel;

}

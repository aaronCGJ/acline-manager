package com.acline.common.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Aaron Chen
 * @date：2025/2/27
 * @Description:
 * @Version 1.0
 */
@Data
@ApiModel(description = "账单明细")
public class InvoiceOrderDetailBO {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 主账单订单号
     */
    @ApiModelProperty(value = "账单编号")
    private String invoiceOrderNo;

    /**
     * 报价明细主键
     */
    @ApiModelProperty(value = "报价明细主键")
    private Integer quoteDetailId;

    /**
     * 订单主键
     */
    @ApiModelProperty(value = "订单流程主键")
    private  Integer quoteInstanceId;

    /**
     * 报价订单号
     */
    @ApiModelProperty(value = "PO")
    private String quoteOrderNo;

    /**
     * PR明细编号
     */
    @ApiModelProperty(value = "PR#")
    private String requestDetailNo;

    /**
     * 供应商主键
     */
    @ApiModelProperty(value = "供应商主键")
    private Integer supplierId;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value = "供应商名称")
    private String supplierName;

    /**
     * 签约主体
     */
    @ApiModelProperty(value = "签约主体")
    private Integer signEntity;

    /**
     * 签约主体名称
     */
    @ApiModelProperty(value = "签约主体名称")
    private String signEntityName;

    /**
     * SKU描述英文
     */
    @ApiModelProperty(value = "SKU描述英文")
    private String skuDescriptionEn;

    /**
     * sku单位英文
     */
    @ApiModelProperty(value = "sku单位英文")
    private String skuUnitEn;


    /**
     * tax method
     * 0:税前  1 :税后
     */
    @ApiModelProperty(value = "Tax method")
    private Integer quoteMode;

    /**
     * 原始金额
     */
    @ApiModelProperty(value = "Original Amount")
    private BigDecimal originalAmount;


    /**
     * BV代码
     */
    @ApiModelProperty(value = "BV代码")
    private String bvCode;

    /**
     * delivery_instance_id
     */
    @ApiModelProperty(value = "交付实例ID")
    private String deliveryInstanceId;

    /**
     * 交付实例编号
     */
    @ApiModelProperty(value = "交付实例编号")
    private String deliveryInstanceCode;


    /**
     * 类型 0:MRC 1:NRC 2:Overage
     */
    @ApiModelProperty(value = "类型 0:MRC 1:NRC 2:Overage")
    private Integer type;
    /**
     * termRate
     */
    @ApiModelProperty(value = "百分比（termRate*100）")
    private BigDecimal termRate;

    /**
     * 单价
     */
    @ApiModelProperty(value = "单价")
    private BigDecimal amount;

    /**
     * 账单所含订购量合计
     */
    @ApiModelProperty(value = "QTY")
    private BigDecimal qty;

    /**
     * 数量金额 qty * amount 即PO Amount
     */
    @ApiModelProperty(value = "PO Amount")
    private BigDecimal qtyAmount;

    /**
     * 税率
     */
    @ApiModelProperty(value = "税率")
    private BigDecimal taxRate;

    /**
     * 税额 taxrate * amount
     */
    @ApiModelProperty(value = "税额")
    private BigDecimal taxAmount;

    /**
     * 折扣率
     */
    @ApiModelProperty(value = "折扣率")
    private BigDecimal discountRate;

    /**
     * 折扣金额 discount rate * amount
     */
    @ApiModelProperty(value = "折扣金额")
    private BigDecimal discountAmount;

    /**
     * 支付金额 qty amount - discount amount + tax amount
     */
    @ApiModelProperty(value = "支付金额")
    private BigDecimal gemount;

    /**
     * 币种
     */
    @ApiModelProperty(value = "币种")
    private String currency;

    /**
     * 计费开始日期
     */
    @ApiModelProperty(value = "计费开始日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date billingStartDate;

    /**
     * 账单开始日期
     */
    @ApiModelProperty(value = "账单开始日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date startDate;

    /**
     * 账单结束日期
     */
    @ApiModelProperty(value = "账单结束日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date endDate;


    /**
     * A端机房名称
     */
    @ApiModelProperty(value = "A端机房名称")
    private String facNameA;


    /**
     * Z端机房名称
     */
    @ApiModelProperty(value = "Z端机房名称")
    private String facNameZ;

    /**
     * 采购类型
     */
    @ApiModelProperty(value = "采购类型 0：买 1:租")
    private Integer purchaseType;

    /**
     * 账单生成日期  billing Days
     */
    @ApiModelProperty(value = "出账日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date invoiceDate;

    /**
     * 账单规则主键
     */
    @ApiModelProperty(value = "账单规则主键")
    private Integer invoiceRuleId;

    /**
     * 供应商的账单编号
     */
    @ApiModelProperty(value = "供应商的账单编号")
    private String supplierInvoiceNo;
    /**
     * 财务规则名称
     */
    @ApiModelProperty(value = "规则名称")
    private String invoiceRuleName;


    /**
     * 对账状态 1:已对账 2:部分对账 3:未对账
     */
    @ApiModelProperty(value = "对账状态 1:已对账 2:部分对账 3:未对账")
    private Integer checkStatus;

    @ApiModelProperty(value = "产品线")
    private String budgetUnitName;
    @ApiModelProperty(value="账单ID")
    private String invoiceId;
    @ApiModelProperty("原始PO号")
    private String originQuoteNo;
    @ApiModelProperty("原始PO工单号")
    private String originQuoteInstanceCode;
    @ApiModelProperty("原始PO工单ID")
    private Integer originQuoteInstanceId;
    @ApiModelProperty("折扣%")
    private String discountRateValue;
    @ApiModelProperty("税率%")
    private String taxRateValue;
    @ApiModelProperty("TermRate%")
    private String termRateValue;
    @ApiModelProperty("减免类型 0 正常账单条目，1:被减免账单条目，2 负账单条目")
    private Integer deductionModel;
    @ApiModelProperty("被减免ID")
    private Integer  revisedId;
    @ApiModelProperty("正向减免ID")
    private Integer  forwardId;
    @ApiModelProperty("自定义减免ID")
    private Integer  deductionId;


    public void setTermRate(BigDecimal termRate) {
        this.termRate = termRate.multiply(new BigDecimal(100));
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate.multiply(new BigDecimal(100));
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate.multiply(new BigDecimal(100));;
    }
}

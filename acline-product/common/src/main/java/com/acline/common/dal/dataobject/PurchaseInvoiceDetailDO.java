package com.acline.common.dal.dataobject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`vendor_purchase_invoice_detail`")
public class PurchaseInvoiceDetailDO {
	/**
	 * 主键
	 */
	@Id
	@Column(name = "`id`")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 主账单订单号
	 */
	@Column(name = "`invoice_order_no`")
	private String invoiceOrderNo;

	/**
	 * 报价明细主键
	 */
	@Column(name = "`quote_detail_id`")
	private Integer quoteDetailId;

	/**
	 * 报价订单号
	 */
	@Column(name = "`quote_order_no`")
	private String quoteOrderNo;

	/**
	 * PR明细编号
	 */
	@Column(name = "`request_detail_no`")
	private String requestDetailNo;

	/**
	 * 供应商主键
	 */
	@Column(name = "`supplier_id`")
	private Integer supplierId;

	/**
	 * 供应商名称
	 */
	@Column(name = "`supplier_name`")
	private String supplierName;

	/**
	 * 签约主体
	 */
	@Column(name = "`sign_entity`")
	private Integer signEntity;

	/**
	 * 签约主体名称
	 */
	@Column(name = "`sign_entity_name`")
	private String signEntityName;

	/**
	 * SKU描述英文
	 */
	@Column(name = "`sku_description_en`")
	private String skuDescriptionEn;

	/**
	 * sku单位英文
	 */
	@Column(name = "`sku_unit_en`")
	private String skuUnitEn;

	/**
	 * BV代码
	 */
	@Column(name = "`bv_code`")
	private String bvCode;

	/**
	 * 交付实例编号
	 */
	@Column(name = "`delivery_instance_code`")
	private String deliveryInstanceCode;

	/**
	 * 报价方式 0:税前 1:税后
	 */
	@Column(name = "`quote_mode`")
	private Integer quoteMode;

	/**
	 * 原始单价
	 */
	@Column(name = "`original_amount`")
	private BigDecimal originalAmount;

	/**
	 * 单价
	 */
	@Column(name = "`amount`")
	private BigDecimal amount;

	/**
	 * 账单所含订购量合计
	 */
	@Column(name = "`qty`")
	private BigDecimal qty;

	/**
	 * 数量金额 qty * amount 即PO Amount
	 */
	@Column(name = "`qty_amount`")
	private BigDecimal qtyAmount;

	/**
	 * 税率
	 */
	@Column(name = "`tax_rate`")
	private BigDecimal taxRate;

	/**
	 * 税额 taxrate * amount
	 */
	@Column(name = "`tax_amount`")
	private BigDecimal taxAmount;

	/**
	 * 折扣率
	 */
	@Column(name = "`discount_rate`")
	private BigDecimal discountRate;

	/**
	 * 折扣金额 discount rate * amount
	 */
	@Column(name = "`discount_amount`")
	private BigDecimal discountAmount;

	/**
	 * 支付金额 qty amount - discount amount + tax amount
	 */
	@Column(name = "`gemount`")
	private BigDecimal gemount;

	/**
	 * 币种
	 */
	@Column(name = "`currency`")
	private String currency;

	/**
	 * 计费开始日期
	 */
	@Column(name = "`billing_start_date`")
	private Date billingStartDate;

	/**
	 * 类型 0:MRC 1:NRC 2:Overage
	 */
	@Column(name = "`type`")
	private Integer type;

	/**
	 * 账单开始日期
	 */
	@Column(name = "`start_date`")
	private Date startDate;

	/**
	 * 账单结束日期
	 */
	@Column(name = "`end_date`")
	private Date endDate;

	/**
	 * 周期折算率
	 */
	@Column(name = "`term_rate`")
	private BigDecimal termRate;

	/**
	 * A端机房主键
	 */
	@Column(name = "`fac_id_a`")
	private Integer facIdA;

	/**
	 * A端机房名称
	 */
	@Column(name = "`fac_name_a`")
	private String facNameA;

	/**
	 * Z端机房主键
	 */
	@Column(name = "`fac_id_z`")
	private Integer facIdZ;

	/**
	 * Z端机房名称
	 */
	@Column(name = "`fac_name_z`")
	private String facNameZ;

	/**
	 * 采购类型
	 */
	@Column(name = "`purchase_type`")
	private Integer purchaseType;

	/**
	 * 预算单元主键
	 */
	@Column(name = "`budget_unit_id`")
	private Integer budgetUnitId;

	/**
	 * 预算单元名称
	 */
	@Column(name = "`budget_unit_name`")
	private String budgetUnitName;

	/**
	 * 账单生成日期
	 */
	@Column(name = "`invoice_date`")
	private Date invoiceDate;

	/**
	 * 账单规则主键
	 */
	@Column(name = "`invoice_rule_id`")
	private Integer invoiceRuleId;

	/**
	 * 主账单生成日期
	 */
	@Column(name = "`invoice_order_date`")
	private Date invoiceOrderDate;

	/**
	 * 供应商的账单编号
	 */
	@Column(name = "`supplier_invoice_no`")
	private String supplierInvoiceNo;

	/**
	 * 账单标签 1:正向 2:减免
	 */
	@Column(name = "`tag`")
	private Integer tag;

	/**
	 * 被纠正订购账单主键
	 */
	@Column(name = "`revised_id`")
	private Integer revisedId;

	/**
	 * 创建时间
	 */
	@Column(name = "`create_time`")
	private Date createTime;

	/**
	 * 创建人
	 */
	@Column(name = "`create_by`")
	private String createBy;

	/**
	 * 修改时间
	 */
	@Column(name = "`update_time`")
	private Date updateTime;

	/**
	 * 更新人
	 */
	@Column(name = "`update_by`")
	private String updateBy;

	/**
	 * 删除时间
	 */
	@Column(name = "`delete_time`")
	private Date deleteTime;

	@Column(name = "`del`")
	private Integer del;

	public static final String ID = "id";

	public static final String INVOICE_ORDER_NO = "invoiceOrderNo";

	public static final String QUOTE_DETAIL_ID = "quoteDetailId";

	public static final String QUOTE_ORDER_NO = "quoteOrderNo";

	public static final String REQUEST_DETAIL_NO = "requestDetailNo";

	public static final String SUPPLIER_ID = "supplierId";

	public static final String SUPPLIER_NAME = "supplierName";

	public static final String SIGN_ENTITY = "signEntity";

	public static final String SIGN_ENTITY_NAME = "signEntityName";

	public static final String SKU_DESCRIPTION_EN = "skuDescriptionEn";

	public static final String SKU_UNIT_EN = "skuUnitEn";

	public static final String BV_CODE = "bvCode";

	public static final String DELIVERY_INSTANCE_CODE = "deliveryInstanceCode";

	public static final String QUOTE_MODE = "quoteMode";

	public static final String ORIGINAL_AMOUNT = "originalAmount";

	public static final String AMOUNT = "amount";

	public static final String QTY = "qty";

	public static final String QTY_AMOUNT = "qtyAmount";

	public static final String TAX_RATE = "taxRate";

	public static final String TAX_AMOUNT = "taxAmount";

	public static final String DISCOUNT_RATE = "discountRate";

	public static final String DISCOUNT_AMOUNT = "discountAmount";

	public static final String GEMOUNT = "gemount";

	public static final String CURRENCY = "currency";

	public static final String BILLING_START_DATE = "billingStartDate";

	public static final String TYPE = "type";

	public static final String START_DATE = "startDate";

	public static final String END_DATE = "endDate";

	public static final String TERM_RATE = "termRate";

	public static final String FAC_ID_A = "facIdA";

	public static final String FAC_NAME_A = "facNameA";

	public static final String FAC_ID_Z = "facIdZ";

	public static final String FAC_NAME_Z = "facNameZ";

	public static final String PURCHASE_TYPE = "purchaseType";

	public static final String BUDGET_UNIT_ID = "budgetUnitId";

	public static final String BUDGET_UNIT_NAME = "budgetUnitName";

	public static final String INVOICE_DATE = "invoiceDate";

	public static final String INVOICE_RULE_ID = "invoiceRuleId";

	public static final String INVOICE_ORDER_DATE = "invoiceOrderDate";

	public static final String SUPPLIER_INVOICE_NO = "supplierInvoiceNo";

	public static final String TAG = "tag";

	public static final String REVISED_ID = "revisedId";

	public static final String CREATE_TIME = "createTime";

	public static final String CREATE_BY = "createBy";

	public static final String UPDATE_TIME = "updateTime";

	public static final String UPDATE_BY = "updateBy";

	public static final String DELETE_TIME = "deleteTime";

	public static final String DEL = "del";

	/**
	 * 获取主键
	 *
	 * @return id - 主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置主键
	 *
	 * @param id 主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取主账单订单号
	 *
	 * @return invoice_order_no - 主账单订单号
	 */
	public String getInvoiceOrderNo() {
		return invoiceOrderNo;
	}

	/**
	 * 设置主账单订单号
	 *
	 * @param invoiceOrderNo 主账单订单号
	 */
	public void setInvoiceOrderNo(String invoiceOrderNo) {
		this.invoiceOrderNo = invoiceOrderNo == null ? null : invoiceOrderNo.trim();
	}

	/**
	 * 获取报价明细主键
	 *
	 * @return quote_detail_id - 报价明细主键
	 */
	public Integer getQuoteDetailId() {
		return quoteDetailId;
	}

	/**
	 * 设置报价明细主键
	 *
	 * @param quoteDetailId 报价明细主键
	 */
	public void setQuoteDetailId(Integer quoteDetailId) {
		this.quoteDetailId = quoteDetailId;
	}

	/**
	 * 获取报价订单号
	 *
	 * @return quote_order_no - 报价订单号
	 */
	public String getQuoteOrderNo() {
		return quoteOrderNo;
	}

	/**
	 * 设置报价订单号
	 *
	 * @param quoteOrderNo 报价订单号
	 */
	public void setQuoteOrderNo(String quoteOrderNo) {
		this.quoteOrderNo = quoteOrderNo == null ? null : quoteOrderNo.trim();
	}

	/**
	 * 获取PR明细编号
	 *
	 * @return request_detail_no - PR明细编号
	 */
	public String getRequestDetailNo() {
		return requestDetailNo;
	}

	/**
	 * 设置PR明细编号
	 *
	 * @param requestDetailNo PR明细编号
	 */
	public void setRequestDetailNo(String requestDetailNo) {
		this.requestDetailNo = requestDetailNo == null ? null : requestDetailNo.trim();
	}

	/**
	 * 获取供应商主键
	 *
	 * @return supplier_id - 供应商主键
	 */
	public Integer getSupplierId() {
		return supplierId;
	}

	/**
	 * 设置供应商主键
	 *
	 * @param supplierId 供应商主键
	 */
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * 获取供应商名称
	 *
	 * @return supplier_name - 供应商名称
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * 设置供应商名称
	 *
	 * @param supplierName 供应商名称
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName == null ? null : supplierName.trim();
	}

	/**
	 * 获取签约主体
	 *
	 * @return sign_entity - 签约主体
	 */
	public Integer getSignEntity() {
		return signEntity;
	}

	/**
	 * 设置签约主体
	 *
	 * @param signEntity 签约主体
	 */
	public void setSignEntity(Integer signEntity) {
		this.signEntity = signEntity;
	}

	/**
	 * 获取签约主体名称
	 *
	 * @return sign_entity_name - 签约主体名称
	 */
	public String getSignEntityName() {
		return signEntityName;
	}

	/**
	 * 设置签约主体名称
	 *
	 * @param signEntityName 签约主体名称
	 */
	public void setSignEntityName(String signEntityName) {
		this.signEntityName = signEntityName == null ? null : signEntityName.trim();
	}

	/**
	 * 获取SKU描述英文
	 *
	 * @return sku_description_en - SKU描述英文
	 */
	public String getSkuDescriptionEn() {
		return skuDescriptionEn;
	}

	/**
	 * 设置SKU描述英文
	 *
	 * @param skuDescriptionEn SKU描述英文
	 */
	public void setSkuDescriptionEn(String skuDescriptionEn) {
		this.skuDescriptionEn = skuDescriptionEn == null ? null : skuDescriptionEn.trim();
	}

	/**
	 * 获取sku单位英文
	 *
	 * @return sku_unit_en - sku单位英文
	 */
	public String getSkuUnitEn() {
		return skuUnitEn;
	}

	/**
	 * 设置sku单位英文
	 *
	 * @param skuUnitEn sku单位英文
	 */
	public void setSkuUnitEn(String skuUnitEn) {
		this.skuUnitEn = skuUnitEn == null ? null : skuUnitEn.trim();
	}

	/**
	 * 获取BV代码
	 *
	 * @return bv_code - BV代码
	 */
	public String getBvCode() {
		return bvCode;
	}

	/**
	 * 设置BV代码
	 *
	 * @param bvCode BV代码
	 */
	public void setBvCode(String bvCode) {
		this.bvCode = bvCode == null ? null : bvCode.trim();
	}

	/**
	 * 获取交付实例编号
	 *
	 * @return delivery_instance_code - 交付实例编号
	 */
	public String getDeliveryInstanceCode() {
		return deliveryInstanceCode;
	}

	/**
	 * 设置交付实例编号
	 *
	 * @param deliveryInstanceCode 交付实例编号
	 */
	public void setDeliveryInstanceCode(String deliveryInstanceCode) {
		this.deliveryInstanceCode = deliveryInstanceCode == null ? null : deliveryInstanceCode.trim();
	}

	/**
	 * 获取报价方式 0:税前 1:税后
	 *
	 * @return quote_mode - 报价方式 0:税前 1:税后
	 */
	public Integer getQuoteMode() {
		return quoteMode;
	}

	/**
	 * 设置报价方式 0:税前 1:税后
	 *
	 * @param quoteMode 报价方式 0:税前 1:税后
	 */
	public void setQuoteMode(Integer quoteMode) {
		this.quoteMode = quoteMode;
	}

	/**
	 * 获取原始单价
	 *
	 * @return original_amount - 原始单价
	 */
	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	/**
	 * 设置原始单价
	 *
	 * @param originalAmount 原始单价
	 */
	public void setOriginalAmount(BigDecimal originalAmount) {
		this.originalAmount = originalAmount;
	}

	/**
	 * 获取单价
	 *
	 * @return amount - 单价
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 设置单价
	 *
	 * @param amount 单价
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * 获取账单所含订购量合计
	 *
	 * @return qty - 账单所含订购量合计
	 */
	public BigDecimal getQty() {
		return qty;
	}

	/**
	 * 设置账单所含订购量合计
	 *
	 * @param qty 账单所含订购量合计
	 */
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	/**
	 * 获取数量金额 qty * amount 即PO Amount
	 *
	 * @return qty_amount - 数量金额 qty * amount 即PO Amount
	 */
	public BigDecimal getQtyAmount() {
		return qtyAmount;
	}

	/**
	 * 设置数量金额 qty * amount 即PO Amount
	 *
	 * @param qtyAmount 数量金额 qty * amount 即PO Amount
	 */
	public void setQtyAmount(BigDecimal qtyAmount) {
		this.qtyAmount = qtyAmount;
	}

	/**
	 * 获取税率
	 *
	 * @return tax_rate - 税率
	 */
	public BigDecimal getTaxRate() {
		return taxRate;
	}

	/**
	 * 设置税率
	 *
	 * @param taxRate 税率
	 */
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 * 获取税额 taxrate * amount
	 *
	 * @return tax_amount - 税额 taxrate * amount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * 设置税额 taxrate * amount
	 *
	 * @param taxAmount 税额 taxrate * amount
	 */
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * 获取折扣率
	 *
	 * @return discount_rate - 折扣率
	 */
	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	/**
	 * 设置折扣率
	 *
	 * @param discountRate 折扣率
	 */
	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * 获取折扣金额 discount rate * amount
	 *
	 * @return discount_amount - 折扣金额 discount rate * amount
	 */
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * 设置折扣金额 discount rate * amount
	 *
	 * @param discountAmount 折扣金额 discount rate * amount
	 */
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * 获取支付金额 qty amount - discount amount + tax amount
	 *
	 * @return gemount - 支付金额 qty amount - discount amount + tax amount
	 */
	public BigDecimal getGemount() {
		return gemount;
	}

	/**
	 * 设置支付金额 qty amount - discount amount + tax amount
	 *
	 * @param gemount 支付金额 qty amount - discount amount + tax amount
	 */
	public void setGemount(BigDecimal gemount) {
		this.gemount = gemount;
	}

	/**
	 * 获取币种
	 *
	 * @return currency - 币种
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * 设置币种
	 *
	 * @param currency 币种
	 */
	public void setCurrency(String currency) {
		this.currency = currency == null ? null : currency.trim();
	}

	/**
	 * 获取计费开始日期
	 *
	 * @return billing_start_date - 计费开始日期
	 */
	public Date getBillingStartDate() {
		return billingStartDate;
	}

	/**
	 * 设置计费开始日期
	 *
	 * @param billingStartDate 计费开始日期
	 */
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}

	/**
	 * 获取类型 0:MRC 1:NRC 2:Overage
	 *
	 * @return type - 类型 0:MRC 1:NRC 2:Overage
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 设置类型 0:MRC 1:NRC 2:Overage
	 *
	 * @param type 类型 0:MRC 1:NRC 2:Overage
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取账单开始日期
	 *
	 * @return start_date - 账单开始日期
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * 设置账单开始日期
	 *
	 * @param startDate 账单开始日期
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * 获取账单结束日期
	 *
	 * @return end_date - 账单结束日期
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * 设置账单结束日期
	 *
	 * @param endDate 账单结束日期
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * 获取周期折算率
	 *
	 * @return term_rate - 周期折算率
	 */
	public BigDecimal getTermRate() {
		return termRate;
	}

	/**
	 * 设置周期折算率
	 *
	 * @param termRate 周期折算率
	 */
	public void setTermRate(BigDecimal termRate) {
		this.termRate = termRate;
	}

	/**
	 * 获取A端机房主键
	 *
	 * @return fac_id_a - A端机房主键
	 */
	public Integer getFacIdA() {
		return facIdA;
	}

	/**
	 * 设置A端机房主键
	 *
	 * @param facIdA A端机房主键
	 */
	public void setFacIdA(Integer facIdA) {
		this.facIdA = facIdA;
	}

	/**
	 * 获取A端机房名称
	 *
	 * @return fac_name_a - A端机房名称
	 */
	public String getFacNameA() {
		return facNameA;
	}

	/**
	 * 设置A端机房名称
	 *
	 * @param facNameA A端机房名称
	 */
	public void setFacNameA(String facNameA) {
		this.facNameA = facNameA == null ? null : facNameA.trim();
	}

	/**
	 * 获取Z端机房主键
	 *
	 * @return fac_id_z - Z端机房主键
	 */
	public Integer getFacIdZ() {
		return facIdZ;
	}

	/**
	 * 设置Z端机房主键
	 *
	 * @param facIdZ Z端机房主键
	 */
	public void setFacIdZ(Integer facIdZ) {
		this.facIdZ = facIdZ;
	}

	/**
	 * 获取Z端机房名称
	 *
	 * @return fac_name_z - Z端机房名称
	 */
	public String getFacNameZ() {
		return facNameZ;
	}

	/**
	 * 设置Z端机房名称
	 *
	 * @param facNameZ Z端机房名称
	 */
	public void setFacNameZ(String facNameZ) {
		this.facNameZ = facNameZ == null ? null : facNameZ.trim();
	}

	/**
	 * 获取采购类型
	 *
	 * @return purchase_type - 采购类型
	 */
	public Integer getPurchaseType() {
		return purchaseType;
	}

	/**
	 * 设置采购类型
	 *
	 * @param purchaseType 采购类型
	 */
	public void setPurchaseType(Integer purchaseType) {
		this.purchaseType = purchaseType;
	}

	/**
	 * 获取预算单元主键
	 *
	 * @return budget_unit_id - 预算单元主键
	 */
	public Integer getBudgetUnitId() {
		return budgetUnitId;
	}

	/**
	 * 设置预算单元主键
	 *
	 * @param budgetUnitId 预算单元主键
	 */
	public void setBudgetUnitId(Integer budgetUnitId) {
		this.budgetUnitId = budgetUnitId;
	}

	/**
	 * 获取预算单元名称
	 *
	 * @return budget_unit_name - 预算单元名称
	 */
	public String getBudgetUnitName() {
		return budgetUnitName;
	}

	/**
	 * 设置预算单元名称
	 *
	 * @param budgetUnitName 预算单元名称
	 */
	public void setBudgetUnitName(String budgetUnitName) {
		this.budgetUnitName = budgetUnitName == null ? null : budgetUnitName.trim();
	}

	/**
	 * 获取账单生成日期
	 *
	 * @return invoice_date - 账单生成日期
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * 设置账单生成日期
	 *
	 * @param invoiceDate 账单生成日期
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * 获取账单规则主键
	 *
	 * @return invoice_rule_id - 账单规则主键
	 */
	public Integer getInvoiceRuleId() {
		return invoiceRuleId;
	}

	/**
	 * 设置账单规则主键
	 *
	 * @param invoiceRuleId 账单规则主键
	 */
	public void setInvoiceRuleId(Integer invoiceRuleId) {
		this.invoiceRuleId = invoiceRuleId;
	}

	/**
	 * 获取主账单生成日期
	 *
	 * @return invoice_order_date - 主账单生成日期
	 */
	public Date getInvoiceOrderDate() {
		return invoiceOrderDate;
	}

	/**
	 * 设置主账单生成日期
	 *
	 * @param invoiceOrderDate 主账单生成日期
	 */
	public void setInvoiceOrderDate(Date invoiceOrderDate) {
		this.invoiceOrderDate = invoiceOrderDate;
	}

	/**
	 * 获取供应商的账单编号
	 *
	 * @return supplier_invoice_no - 供应商的账单编号
	 */
	public String getSupplierInvoiceNo() {
		return supplierInvoiceNo;
	}

	/**
	 * 设置供应商的账单编号
	 *
	 * @param supplierInvoiceNo 供应商的账单编号
	 */
	public void setSupplierInvoiceNo(String supplierInvoiceNo) {
		this.supplierInvoiceNo = supplierInvoiceNo == null ? null : supplierInvoiceNo.trim();
	}

	/**
	 * 获取账单标签 1:正向 2:减免
	 *
	 * @return tag - 账单标签 1:正向 2:减免
	 */
	public Integer getTag() {
		return tag;
	}

	/**
	 * 设置账单标签 1:正向 2:减免
	 *
	 * @param tag 账单标签 1:正向 2:减免
	 */
	public void setTag(Integer tag) {
		this.tag = tag;
	}

	/**
	 * 获取被纠正订购账单主键
	 *
	 * @return revised_id - 被纠正订购账单主键
	 */
	public Integer getRevisedId() {
		return revisedId;
	}

	/**
	 * 设置被纠正订购账单主键
	 *
	 * @param revisedId 被纠正订购账单主键
	 */
	public void setRevisedId(Integer revisedId) {
		this.revisedId = revisedId;
	}

	/**
	 * 获取创建时间
	 *
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取创建人
	 *
	 * @return create_by - 创建人
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * 设置创建人
	 *
	 * @param createBy 创建人
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	/**
	 * 获取修改时间
	 *
	 * @return update_time - 修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置修改时间
	 *
	 * @param updateTime 修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取更新人
	 *
	 * @return update_by - 更新人
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * 设置更新人
	 *
	 * @param updateBy 更新人
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	/**
	 * 获取删除时间
	 *
	 * @return delete_time - 删除时间
	 */
	public Date getDeleteTime() {
		return deleteTime;
	}

	/**
	 * 设置删除时间
	 *
	 * @param deleteTime 删除时间
	 */
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	/**
	 * @return del
	 */
	public Integer getDel() {
		return del;
	}

	/**
	 * @param del
	 */
	public void setDel(Integer del) {
		this.del = del;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", invoiceOrderNo=").append(invoiceOrderNo);
		sb.append(", quoteDetailId=").append(quoteDetailId);
		sb.append(", quoteOrderNo=").append(quoteOrderNo);
		sb.append(", requestDetailNo=").append(requestDetailNo);
		sb.append(", supplierId=").append(supplierId);
		sb.append(", supplierName=").append(supplierName);
		sb.append(", signEntity=").append(signEntity);
		sb.append(", signEntityName=").append(signEntityName);
		sb.append(", skuDescriptionEn=").append(skuDescriptionEn);
		sb.append(", skuUnitEn=").append(skuUnitEn);
		sb.append(", bvCode=").append(bvCode);
		sb.append(", deliveryInstanceCode=").append(deliveryInstanceCode);
		sb.append(", quoteMode=").append(quoteMode);
		sb.append(", originalAmount=").append(originalAmount);
		sb.append(", amount=").append(amount);
		sb.append(", qty=").append(qty);
		sb.append(", qtyAmount=").append(qtyAmount);
		sb.append(", taxRate=").append(taxRate);
		sb.append(", taxAmount=").append(taxAmount);
		sb.append(", discountRate=").append(discountRate);
		sb.append(", discountAmount=").append(discountAmount);
		sb.append(", gemount=").append(gemount);
		sb.append(", currency=").append(currency);
		sb.append(", billingStartDate=").append(billingStartDate);
		sb.append(", type=").append(type);
		sb.append(", startDate=").append(startDate);
		sb.append(", endDate=").append(endDate);
		sb.append(", termRate=").append(termRate);
		sb.append(", facIdA=").append(facIdA);
		sb.append(", facNameA=").append(facNameA);
		sb.append(", facIdZ=").append(facIdZ);
		sb.append(", facNameZ=").append(facNameZ);
		sb.append(", purchaseType=").append(purchaseType);
		sb.append(", budgetUnitId=").append(budgetUnitId);
		sb.append(", budgetUnitName=").append(budgetUnitName);
		sb.append(", invoiceDate=").append(invoiceDate);
		sb.append(", invoiceRuleId=").append(invoiceRuleId);
		sb.append(", invoiceOrderDate=").append(invoiceOrderDate);
		sb.append(", supplierInvoiceNo=").append(supplierInvoiceNo);
		sb.append(", tag=").append(tag);
		sb.append(", revisedId=").append(revisedId);
		sb.append(", createTime=").append(createTime);
		sb.append(", createBy=").append(createBy);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", updateBy=").append(updateBy);
		sb.append(", deleteTime=").append(deleteTime);
		sb.append(", del=").append(del);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		PurchaseInvoiceDetailDO other = (PurchaseInvoiceDetailDO) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getInvoiceOrderNo() == null ? other.getInvoiceOrderNo() == null : this.getInvoiceOrderNo().equals(other.getInvoiceOrderNo()))
				&& (this.getQuoteDetailId() == null ? other.getQuoteDetailId() == null : this.getQuoteDetailId().equals(other.getQuoteDetailId()))
				&& (this.getQuoteOrderNo() == null ? other.getQuoteOrderNo() == null : this.getQuoteOrderNo().equals(other.getQuoteOrderNo()))
				&& (this.getRequestDetailNo() == null ? other.getRequestDetailNo() == null : this.getRequestDetailNo().equals(other.getRequestDetailNo()))
				&& (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
				&& (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
				&& (this.getSignEntity() == null ? other.getSignEntity() == null : this.getSignEntity().equals(other.getSignEntity()))
				&& (this.getSignEntityName() == null ? other.getSignEntityName() == null : this.getSignEntityName().equals(other.getSignEntityName()))
				&& (this.getSkuDescriptionEn() == null ? other.getSkuDescriptionEn() == null : this.getSkuDescriptionEn().equals(other.getSkuDescriptionEn()))
				&& (this.getSkuUnitEn() == null ? other.getSkuUnitEn() == null : this.getSkuUnitEn().equals(other.getSkuUnitEn()))
				&& (this.getBvCode() == null ? other.getBvCode() == null : this.getBvCode().equals(other.getBvCode()))
				&& (this.getDeliveryInstanceCode() == null ? other.getDeliveryInstanceCode() == null : this.getDeliveryInstanceCode().equals(other.getDeliveryInstanceCode()))
				&& (this.getQuoteMode() == null ? other.getQuoteMode() == null : this.getQuoteMode().equals(other.getQuoteMode()))
				&& (this.getOriginalAmount() == null ? other.getOriginalAmount() == null : this.getOriginalAmount().equals(other.getOriginalAmount()))
				&& (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
				&& (this.getQty() == null ? other.getQty() == null : this.getQty().equals(other.getQty()))
				&& (this.getQtyAmount() == null ? other.getQtyAmount() == null : this.getQtyAmount().equals(other.getQtyAmount()))
				&& (this.getTaxRate() == null ? other.getTaxRate() == null : this.getTaxRate().equals(other.getTaxRate()))
				&& (this.getTaxAmount() == null ? other.getTaxAmount() == null : this.getTaxAmount().equals(other.getTaxAmount()))
				&& (this.getDiscountRate() == null ? other.getDiscountRate() == null : this.getDiscountRate().equals(other.getDiscountRate()))
				&& (this.getDiscountAmount() == null ? other.getDiscountAmount() == null : this.getDiscountAmount().equals(other.getDiscountAmount()))
				&& (this.getGemount() == null ? other.getGemount() == null : this.getGemount().equals(other.getGemount()))
				&& (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
				&& (this.getBillingStartDate() == null ? other.getBillingStartDate() == null : this.getBillingStartDate().equals(other.getBillingStartDate()))
				&& (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
				&& (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
				&& (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
				&& (this.getTermRate() == null ? other.getTermRate() == null : this.getTermRate().equals(other.getTermRate()))
				&& (this.getFacIdA() == null ? other.getFacIdA() == null : this.getFacIdA().equals(other.getFacIdA()))
				&& (this.getFacNameA() == null ? other.getFacNameA() == null : this.getFacNameA().equals(other.getFacNameA()))
				&& (this.getFacIdZ() == null ? other.getFacIdZ() == null : this.getFacIdZ().equals(other.getFacIdZ()))
				&& (this.getFacNameZ() == null ? other.getFacNameZ() == null : this.getFacNameZ().equals(other.getFacNameZ()))
				&& (this.getPurchaseType() == null ? other.getPurchaseType() == null : this.getPurchaseType().equals(other.getPurchaseType()))
				&& (this.getBudgetUnitId() == null ? other.getBudgetUnitId() == null : this.getBudgetUnitId().equals(other.getBudgetUnitId()))
				&& (this.getBudgetUnitName() == null ? other.getBudgetUnitName() == null : this.getBudgetUnitName().equals(other.getBudgetUnitName()))
				&& (this.getInvoiceDate() == null ? other.getInvoiceDate() == null : this.getInvoiceDate().equals(other.getInvoiceDate()))
				&& (this.getInvoiceRuleId() == null ? other.getInvoiceRuleId() == null : this.getInvoiceRuleId().equals(other.getInvoiceRuleId()))
				&& (this.getInvoiceOrderDate() == null ? other.getInvoiceOrderDate() == null : this.getInvoiceOrderDate().equals(other.getInvoiceOrderDate()))
				&& (this.getSupplierInvoiceNo() == null ? other.getSupplierInvoiceNo() == null : this.getSupplierInvoiceNo().equals(other.getSupplierInvoiceNo()))
				&& (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
				&& (this.getRevisedId() == null ? other.getRevisedId() == null : this.getRevisedId().equals(other.getRevisedId()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
				&& (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
				&& (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getInvoiceOrderNo() == null) ? 0 : getInvoiceOrderNo().hashCode());
		result = prime * result + ((getQuoteDetailId() == null) ? 0 : getQuoteDetailId().hashCode());
		result = prime * result + ((getQuoteOrderNo() == null) ? 0 : getQuoteOrderNo().hashCode());
		result = prime * result + ((getRequestDetailNo() == null) ? 0 : getRequestDetailNo().hashCode());
		result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
		result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
		result = prime * result + ((getSignEntity() == null) ? 0 : getSignEntity().hashCode());
		result = prime * result + ((getSignEntityName() == null) ? 0 : getSignEntityName().hashCode());
		result = prime * result + ((getSkuDescriptionEn() == null) ? 0 : getSkuDescriptionEn().hashCode());
		result = prime * result + ((getSkuUnitEn() == null) ? 0 : getSkuUnitEn().hashCode());
		result = prime * result + ((getBvCode() == null) ? 0 : getBvCode().hashCode());
		result = prime * result + ((getDeliveryInstanceCode() == null) ? 0 : getDeliveryInstanceCode().hashCode());
		result = prime * result + ((getQuoteMode() == null) ? 0 : getQuoteMode().hashCode());
		result = prime * result + ((getOriginalAmount() == null) ? 0 : getOriginalAmount().hashCode());
		result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
		result = prime * result + ((getQty() == null) ? 0 : getQty().hashCode());
		result = prime * result + ((getQtyAmount() == null) ? 0 : getQtyAmount().hashCode());
		result = prime * result + ((getTaxRate() == null) ? 0 : getTaxRate().hashCode());
		result = prime * result + ((getTaxAmount() == null) ? 0 : getTaxAmount().hashCode());
		result = prime * result + ((getDiscountRate() == null) ? 0 : getDiscountRate().hashCode());
		result = prime * result + ((getDiscountAmount() == null) ? 0 : getDiscountAmount().hashCode());
		result = prime * result + ((getGemount() == null) ? 0 : getGemount().hashCode());
		result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
		result = prime * result + ((getBillingStartDate() == null) ? 0 : getBillingStartDate().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
		result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
		result = prime * result + ((getTermRate() == null) ? 0 : getTermRate().hashCode());
		result = prime * result + ((getFacIdA() == null) ? 0 : getFacIdA().hashCode());
		result = prime * result + ((getFacNameA() == null) ? 0 : getFacNameA().hashCode());
		result = prime * result + ((getFacIdZ() == null) ? 0 : getFacIdZ().hashCode());
		result = prime * result + ((getFacNameZ() == null) ? 0 : getFacNameZ().hashCode());
		result = prime * result + ((getPurchaseType() == null) ? 0 : getPurchaseType().hashCode());
		result = prime * result + ((getBudgetUnitId() == null) ? 0 : getBudgetUnitId().hashCode());
		result = prime * result + ((getBudgetUnitName() == null) ? 0 : getBudgetUnitName().hashCode());
		result = prime * result + ((getInvoiceDate() == null) ? 0 : getInvoiceDate().hashCode());
		result = prime * result + ((getInvoiceRuleId() == null) ? 0 : getInvoiceRuleId().hashCode());
		result = prime * result + ((getInvoiceOrderDate() == null) ? 0 : getInvoiceOrderDate().hashCode());
		result = prime * result + ((getSupplierInvoiceNo() == null) ? 0 : getSupplierInvoiceNo().hashCode());
		result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
		result = prime * result + ((getRevisedId() == null) ? 0 : getRevisedId().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
		result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
		result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
		return result;
	}
}

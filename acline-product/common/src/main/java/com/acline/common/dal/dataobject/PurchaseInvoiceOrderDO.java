package com.acline.common.dal.dataobject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`vendor_purchase_invoice_order`")
public class PurchaseInvoiceOrderDO {
	/**
	 * 主键
	 */
	@Id
	@Column(name = "`id`")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 账单编号
	 */
	@Column(name = "`order_no`")
	private String orderNo;

	/**
	 * 账单生成日期
	 */
	@Column(name = "`invoice_date`")
	private Date invoiceDate;

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
	 * 数量金额合计=PO Amount合计
	 */
	@Column(name = "`qty_amount`")
	private BigDecimal qtyAmount;

	/**
	 * 支付金额合计
	 */
	@Column(name = "`gemount`")
	private BigDecimal gemount;

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
	 * 币种
	 */
	@Column(name = "`currency`")
	private String currency;

	/**
	 * 对账状态 1:已对账 2:部分对账 3:未对账
	 */
	@Column(name = "`check_status`")
	private Integer checkStatus;

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

	public static final String ORDER_NO = "orderNo";

	public static final String INVOICE_DATE = "invoiceDate";

	public static final String SUPPLIER_ID = "supplierId";

	public static final String SUPPLIER_NAME = "supplierName";

	public static final String SIGN_ENTITY = "signEntity";

	public static final String SIGN_ENTITY_NAME = "signEntityName";

	public static final String QTY_AMOUNT = "qtyAmount";

	public static final String GEMOUNT = "gemount";

	public static final String START_DATE = "startDate";

	public static final String END_DATE = "endDate";

	public static final String CURRENCY = "currency";

	public static final String CHECK_STATUS = "checkStatus";

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
	 * 获取账单编号
	 *
	 * @return order_no - 账单编号
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * 设置账单编号
	 *
	 * @param orderNo 账单编号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo == null ? null : orderNo.trim();
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
	 * 获取数量金额合计=PO Amount合计
	 *
	 * @return qty_amount - 数量金额合计=PO Amount合计
	 */
	public BigDecimal getQtyAmount() {
		return qtyAmount;
	}

	/**
	 * 设置数量金额合计=PO Amount合计
	 *
	 * @param qtyAmount 数量金额合计=PO Amount合计
	 */
	public void setQtyAmount(BigDecimal qtyAmount) {
		this.qtyAmount = qtyAmount;
	}

	/**
	 * 获取支付金额合计
	 *
	 * @return gemount - 支付金额合计
	 */
	public BigDecimal getGemount() {
		return gemount;
	}

	/**
	 * 设置支付金额合计
	 *
	 * @param gemount 支付金额合计
	 */
	public void setGemount(BigDecimal gemount) {
		this.gemount = gemount;
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
	 * 获取对账状态 1:已对账 2:部分对账 3:未对账
	 *
	 * @return check_status - 对账状态 1:已对账 2:部分对账 3:未对账
	 */
	public Integer getCheckStatus() {
		return checkStatus;
	}

	/**
	 * 设置对账状态 1:已对账 2:部分对账 3:未对账
	 *
	 * @param checkStatus 对账状态 1:已对账 2:部分对账 3:未对账
	 */
	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
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
		sb.append(", orderNo=").append(orderNo);
		sb.append(", invoiceDate=").append(invoiceDate);
		sb.append(", supplierId=").append(supplierId);
		sb.append(", supplierName=").append(supplierName);
		sb.append(", signEntity=").append(signEntity);
		sb.append(", signEntityName=").append(signEntityName);
		sb.append(", qtyAmount=").append(qtyAmount);
		sb.append(", gemount=").append(gemount);
		sb.append(", startDate=").append(startDate);
		sb.append(", endDate=").append(endDate);
		sb.append(", currency=").append(currency);
		sb.append(", checkStatus=").append(checkStatus);
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
		PurchaseInvoiceOrderDO other = (PurchaseInvoiceOrderDO) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
				&& (this.getInvoiceDate() == null ? other.getInvoiceDate() == null : this.getInvoiceDate().equals(other.getInvoiceDate()))
				&& (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
				&& (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
				&& (this.getSignEntity() == null ? other.getSignEntity() == null : this.getSignEntity().equals(other.getSignEntity()))
				&& (this.getSignEntityName() == null ? other.getSignEntityName() == null : this.getSignEntityName().equals(other.getSignEntityName()))
				&& (this.getQtyAmount() == null ? other.getQtyAmount() == null : this.getQtyAmount().equals(other.getQtyAmount()))
				&& (this.getGemount() == null ? other.getGemount() == null : this.getGemount().equals(other.getGemount()))
				&& (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
				&& (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
				&& (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
				&& (this.getCheckStatus() == null ? other.getCheckStatus() == null : this.getCheckStatus().equals(other.getCheckStatus()))
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
		result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
		result = prime * result + ((getInvoiceDate() == null) ? 0 : getInvoiceDate().hashCode());
		result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
		result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
		result = prime * result + ((getSignEntity() == null) ? 0 : getSignEntity().hashCode());
		result = prime * result + ((getSignEntityName() == null) ? 0 : getSignEntityName().hashCode());
		result = prime * result + ((getQtyAmount() == null) ? 0 : getQtyAmount().hashCode());
		result = prime * result + ((getGemount() == null) ? 0 : getGemount().hashCode());
		result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
		result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
		result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
		result = prime * result + ((getCheckStatus() == null) ? 0 : getCheckStatus().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
		result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
		result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
		return result;
	}
}

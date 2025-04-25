package com.acline.common.dal.dataobject;

import javax.persistence.*;
import java.util.Date;

@Table(name = "`vendor_purchase_quote_change`")
public class PurchaseQuoteChangeDO {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资源主键
     */
    @Column(name = "`resource_id`")
    private Integer resourceId;

    /**
     * 资源类型
     */
    @Column(name = "`resource_type`")
    private Integer resourceType;

    /**
     * 当前采购请求明细主键
     */
    @Column(name = "`cur_request_detail_id`")
    private Integer curRequestDetailId;

    /**
     * 前一个采购请求明细主键
     */
    @Column(name = "`pre_request_detail_id`")
    private Integer preRequestDetailId;

    /**
     * 当前交付订单号
     */
    @Column(name = "`cur_delivery_order_no`")
    private String curDeliveryOrderNo;

    /**
     * 当前交付明细主键
     */
    @Column(name = "`cur_delivery_detail_id`")
    private Integer curDeliveryDetailId;

    /**
     * 前一个交付订单号
     */
    @Column(name = "`pre_delivery_order_no`")
    private String preDeliveryOrderNo;

    /**
     * 前一个交付明细主键
     */
    @Column(name = "`pre_delivery_detail_id`")
    private Integer preDeliveryDetailId;

    /**
     * 状态 0:变更中 1:变更完成 2:已取消变更
     */
    @Column(name = "`status`")
    private Integer status;

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
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "`update_by`")
    private String updateBy;

    /**
     * 删除标识 0:未删除 1:已删除
     */
    @Column(name = "`del`")
    private Integer del;

    /**
     * 删除时间
     */
    @Column(name = "`delete_time`")
    private Date deleteTime;

    public static final String ID = "id";

    public static final String RESOURCE_ID = "resourceId";

    public static final String RESOURCE_TYPE = "resourceType";

    public static final String CUR_REQUEST_DETAIL_ID = "curRequestDetailId";

    public static final String PRE_REQUEST_DETAIL_ID = "preRequestDetailId";

    public static final String CUR_DELIVERY_ORDER_NO = "curDeliveryOrderNo";

    public static final String CUR_DELIVERY_DETAIL_ID = "curDeliveryDetailId";

    public static final String PRE_DELIVERY_ORDER_NO = "preDeliveryOrderNo";

    public static final String PRE_DELIVERY_DETAIL_ID = "preDeliveryDetailId";

    public static final String STATUS = "status";

    public static final String CREATE_TIME = "createTime";

    public static final String CREATE_BY = "createBy";

    public static final String UPDATE_TIME = "updateTime";

    public static final String UPDATE_BY = "updateBy";

    public static final String DEL = "del";

    public static final String DELETE_TIME = "deleteTime";

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
     * 获取资源主键
     *
     * @return resource_id - 资源主键
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源主键
     *
     * @param resourceId 资源主键
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 获取资源类型
     *
     * @return resource_type - 资源类型
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * 设置资源类型
     *
     * @param resourceType 资源类型
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 获取当前采购请求明细主键
     *
     * @return cur_request_detail_id - 当前采购请求明细主键
     */
    public Integer getCurRequestDetailId() {
        return curRequestDetailId;
    }

    /**
     * 设置当前采购请求明细主键
     *
     * @param curRequestDetailId 当前采购请求明细主键
     */
    public void setCurRequestDetailId(Integer curRequestDetailId) {
        this.curRequestDetailId = curRequestDetailId;
    }

    /**
     * 获取前一个采购请求明细主键
     *
     * @return pre_request_detail_id - 前一个采购请求明细主键
     */
    public Integer getPreRequestDetailId() {
        return preRequestDetailId;
    }

    /**
     * 设置前一个采购请求明细主键
     *
     * @param preRequestDetailId 前一个采购请求明细主键
     */
    public void setPreRequestDetailId(Integer preRequestDetailId) {
        this.preRequestDetailId = preRequestDetailId;
    }

    /**
     * 获取当前交付订单号
     *
     * @return cur_delivery_order_no - 当前交付订单号
     */
    public String getCurDeliveryOrderNo() {
        return curDeliveryOrderNo;
    }

    /**
     * 设置当前交付订单号
     *
     * @param curDeliveryOrderNo 当前交付订单号
     */
    public void setCurDeliveryOrderNo(String curDeliveryOrderNo) {
        this.curDeliveryOrderNo = curDeliveryOrderNo == null ? null : curDeliveryOrderNo.trim();
    }

    /**
     * 获取当前交付明细主键
     *
     * @return cur_delivery_detail_id - 当前交付明细主键
     */
    public Integer getCurDeliveryDetailId() {
        return curDeliveryDetailId;
    }

    /**
     * 设置当前交付明细主键
     *
     * @param curDeliveryDetailId 当前交付明细主键
     */
    public void setCurDeliveryDetailId(Integer curDeliveryDetailId) {
        this.curDeliveryDetailId = curDeliveryDetailId;
    }

    /**
     * 获取前一个交付订单号
     *
     * @return pre_delivery_order_no - 前一个交付订单号
     */
    public String getPreDeliveryOrderNo() {
        return preDeliveryOrderNo;
    }

    /**
     * 设置前一个交付订单号
     *
     * @param preDeliveryOrderNo 前一个交付订单号
     */
    public void setPreDeliveryOrderNo(String preDeliveryOrderNo) {
        this.preDeliveryOrderNo = preDeliveryOrderNo == null ? null : preDeliveryOrderNo.trim();
    }

    /**
     * 获取前一个交付明细主键
     *
     * @return pre_delivery_detail_id - 前一个交付明细主键
     */
    public Integer getPreDeliveryDetailId() {
        return preDeliveryDetailId;
    }

    /**
     * 设置前一个交付明细主键
     *
     * @param preDeliveryDetailId 前一个交付明细主键
     */
    public void setPreDeliveryDetailId(Integer preDeliveryDetailId) {
        this.preDeliveryDetailId = preDeliveryDetailId;
    }

    /**
     * 获取状态 0:变更中 1:变更完成 2:已取消变更
     *
     * @return status - 状态 0:变更中 1:变更完成 2:已取消变更
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0:变更中 1:变更完成 2:已取消变更
     *
     * @param status 状态 0:变更中 1:变更完成 2:已取消变更
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
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
     * 获取删除标识 0:未删除 1:已删除
     *
     * @return del - 删除标识 0:未删除 1:已删除
     */
    public Integer getDel() {
        return del;
    }

    /**
     * 设置删除标识 0:未删除 1:已删除
     *
     * @param del 删除标识 0:未删除 1:已删除
     */
    public void setDel(Integer del) {
        this.del = del;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", curRequestDetailId=").append(curRequestDetailId);
        sb.append(", preRequestDetailId=").append(preRequestDetailId);
        sb.append(", curDeliveryOrderNo=").append(curDeliveryOrderNo);
        sb.append(", curDeliveryDetailId=").append(curDeliveryDetailId);
        sb.append(", preDeliveryOrderNo=").append(preDeliveryOrderNo);
        sb.append(", preDeliveryDetailId=").append(preDeliveryDetailId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", del=").append(del);
        sb.append(", deleteTime=").append(deleteTime);
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
        PurchaseQuoteChangeDO other = (PurchaseQuoteChangeDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId())) && (this.getResourceId() == null ?
                other.getResourceId() == null : this.getResourceId().equals(other.getResourceId())) && (this.getResourceType() == null ?
                other.getResourceType() == null : this.getResourceType().equals(other.getResourceType())) && (
                this.getCurRequestDetailId() == null ? other.getCurRequestDetailId() == null : this.getCurRequestDetailId().equals(
                        other.getCurRequestDetailId())) && (this.getPreRequestDetailId() == null ? other.getPreRequestDetailId() == null
                : this.getPreRequestDetailId().equals(other.getPreRequestDetailId())) && (this.getCurDeliveryOrderNo() == null ?
                other.getCurDeliveryOrderNo() == null : this.getCurDeliveryOrderNo().equals(other.getCurDeliveryOrderNo())) && (
                this.getCurDeliveryDetailId() == null ? other.getCurDeliveryDetailId() == null : this.getCurDeliveryDetailId().equals(
                        other.getCurDeliveryDetailId())) && (this.getPreDeliveryOrderNo() == null ? other.getPreDeliveryOrderNo() == null
                : this.getPreDeliveryOrderNo().equals(other.getPreDeliveryOrderNo())) && (this.getPreDeliveryDetailId() == null ?
                other.getPreDeliveryDetailId() == null : this.getPreDeliveryDetailId().equals(other.getPreDeliveryDetailId())) && (
                this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus())) && (
                this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime())) && (
                this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy())) && (
                this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime())) && (
                this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy())) && (
                this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel())) && (this.getDeleteTime() == null ?
                other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getCurRequestDetailId() == null) ? 0 : getCurRequestDetailId().hashCode());
        result = prime * result + ((getPreRequestDetailId() == null) ? 0 : getPreRequestDetailId().hashCode());
        result = prime * result + ((getCurDeliveryOrderNo() == null) ? 0 : getCurDeliveryOrderNo().hashCode());
        result = prime * result + ((getCurDeliveryDetailId() == null) ? 0 : getCurDeliveryDetailId().hashCode());
        result = prime * result + ((getPreDeliveryOrderNo() == null) ? 0 : getPreDeliveryOrderNo().hashCode());
        result = prime * result + ((getPreDeliveryDetailId() == null) ? 0 : getPreDeliveryDetailId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        return result;
    }
}

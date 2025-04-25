package com.acline.common.dal.dataobject;

import javax.persistence.*;
import java.util.Date;

@Table(name = "`resource_dic`")
public class ResourceDicDO {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 字典代码
     */
    @Column(name = "`code`")
    private String code;

    /**
     * 字典英文名称
     */
    @Column(name = "`name_en`")
    private String nameEn;

    /**
     * 字典中文名称
     */
    @Column(name = "`name_zh`")
    private String nameZh;

    /**
     * 父代码
     */
    @Column(name = "`parent_code`")
    private String parentCode;

    /**
     * 描述
     */
    @Column(name = "`description`")
    private String description;

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
     * 删除标识 0:未删除 1:删除
     */
    @Column(name = "`del`")
    private Integer del;

    /**
     * 删除时间
     */
    @Column(name = "`delete_time`")
    private Date deleteTime;

    public static final String ID = "id";

    public static final String CODE = "code";

    public static final String NAME_EN = "nameEn";

    public static final String NAME_ZH = "nameZh";

    public static final String PARENT_CODE = "parentCode";

    public static final String DESCRIPTION = "description";

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
     * 获取字典代码
     *
     * @return code - 字典代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置字典代码
     *
     * @param code 字典代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取字典英文名称
     *
     * @return name_en - 字典英文名称
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * 设置字典英文名称
     *
     * @param nameEn 字典英文名称
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    /**
     * 获取字典中文名称
     *
     * @return name_zh - 字典中文名称
     */
    public String getNameZh() {
        return nameZh;
    }

    /**
     * 设置字典中文名称
     *
     * @param nameZh 字典中文名称
     */
    public void setNameZh(String nameZh) {
        this.nameZh = nameZh == null ? null : nameZh.trim();
    }

    /**
     * 获取父代码
     *
     * @return parent_code - 父代码
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设置父代码
     *
     * @param parentCode 父代码
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
     * 获取删除标识 0:未删除 1:删除
     *
     * @return del - 删除标识 0:未删除 1:删除
     */
    public Integer getDel() {
        return del;
    }

    /**
     * 设置删除标识 0:未删除 1:删除
     *
     * @param del 删除标识 0:未删除 1:删除
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
        sb.append(", code=").append(code);
        sb.append(", nameEn=").append(nameEn);
        sb.append(", nameZh=").append(nameZh);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", description=").append(description);
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
        ResourceDicDO other = (ResourceDicDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getNameEn() == null ? other.getNameEn() == null : this.getNameEn().equals(other.getNameEn()))
            && (this.getNameZh() == null ? other.getNameZh() == null : this.getNameZh().equals(other.getNameZh()))
            && (this.getParentCode() == null ? other.getParentCode() == null : this.getParentCode().equals(other.getParentCode()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getNameEn() == null) ? 0 : getNameEn().hashCode());
        result = prime * result + ((getNameZh() == null) ? 0 : getNameZh().hashCode());
        result = prime * result + ((getParentCode() == null) ? 0 : getParentCode().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        return result;
    }
}

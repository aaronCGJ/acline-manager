package com.acline.common.dal.dataobject;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
@Table(name = "`resource_cross_connect`")
public class ResourceCrossConnectDO {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * UID
     */
    @Column(name = "`uid`")
    private String uid;

    /**
     * Zenlayer 资源编号
     */
    @Column(name = "`zen_res_no`")
    private String zenResNo;

    /**
     * Vendor 资源编号
     */
    @Column(name = "`vendor_res_no`")
    private String vendorResNo;

    /**
     * 供应商 ID
     */
    @Column(name = "`vendor_id`")
    private Integer vendorId;

    /**
     * 供应商名称
     */
    @Column(name = "`vendor_name`")
    private String vendorName;

    /**
     * A端数据中心
     */
    @Column(name = "`a_fac_id`")
    private Integer aFacId;

    /**
     * A端数据中心名称
     */
    @Column(name = "`a_fac_name`")
    private String aFacName;

    /**
     * A 端设备
     */
    @Column(name = "`a_device_id`")
    private Integer aDeviceId;

    /**
     * A端设备名称
     */
    @Column(name = "`a_device_name`")
    private String aDeviceName;

    /**
     * A端口类型字典代码
     */
    @Column(name = "`a_port_type_code`")
    private String aPortTypeCode;

    /**
     * A端口类型名称
     */
    @Column(name = "`a_port_type_name`")
    private String aPortTypeName;

    /**
     * A 端端口
     */
    @Column(name = "`a_port_id`")
    private Integer aPortId;

    /**
     * A端端口名称
     */
    @Column(name = "`a_port_name`")
    private String aPortName;

    /**
     * A端设备,a_device_id存patch panel
     */
    @Column(name = "`a_side_device_id`")
    private Integer aSideDeviceId;

    /**
     * A端设备名称,a_device_name存patch panel
     */
    @Column(name = "`a_side_device_name`")
    private String aSideDeviceName;

    /**
     * A端端口ID,a_port_id存patch panel
     */
    @Column(name = "`a_side_port_id`")
    private Integer aSidePortId;

    /**
     * A端端口名称,a_port_name存patch panel
     */
    @Column(name = "`a_side_port_name`")
    private String aSidePortName;

    /**
     * Z端数据中心
     */
    @Column(name = "`z_fac_id`")
    private Integer zFacId;

    /**
     * Z端数据中心名称
     */
    @Column(name = "`z_fac_name`")
    private String zFacName;

    /**
     * Z 端设备
     */
    @Column(name = "`z_device_id`")
    private Integer zDeviceId;

    /**
     * Z端设备名称
     */
    @Column(name = "`z_device_name`")
    private String zDeviceName;

    /**
     * Z端口类型字典代码
     */
    @Column(name = "`z_port_type_code`")
    private String zPortTypeCode;

    /**
     * Z端口类型名称
     */
    @Column(name = "`z_port_type_name`")
    private String zPortTypeName;

    /**
     * Z 端端口
     */
    @Column(name = "`z_port_id`")
    private Integer zPortId;

    /**
     * Z端端口名称
     */
    @Column(name = "`z_port_name`")
    private String zPortName;

    /**
     * Z端设备,z_device_id存patch panel
     */
    @Column(name = "`z_side_device_id`")
    private Integer zSideDeviceId;

    /**
     * Z端设备名称,z_device_name存patch panel
     */
    @Column(name = "`z_side_device_name`")
    private String zSideDeviceName;

    /**
     * Z端端口ID,z_port_id存patch panel
     */
    @Column(name = "`z_side_port_id`")
    private Integer zSidePortId;

    /**
     * Z端端口名称,z_port_name存patch panel
     */
    @Column(name = "`z_side_port_name`")
    private String zSidePortName;

    /**
     * 资源归属类型 0:Direct line-层峰 1:  Lease line-供应商
     */
    @Column(name = "`type`")
    private Integer type;

    /**
     * 来源0-页面新增，1-PW流程新增
     */
    @Column(name = "`source`")
    private Integer source;

    /**
     * 保障文件id
     */
    @Column(name = "`support_file_id`")
    private Integer supportFileId;

    /**
     * 状态 0:pre-purchase 1:active 2: in use 3: inactive
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 流程状态 0:nomal  1:renewing 2: renewed 3:terminating 4:terminated
     */
    @Column(name = "`instance_status`")
    private Integer instanceStatus;

    /**
     * 终止时间
     */
    @Column(name = "`termination_date`")
    private Date terminationDate;

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

    public static final String UID = "uid";

    public static final String ZEN_RES_NO = "zenResNo";

    public static final String VENDOR_RES_NO = "vendorResNo";

    public static final String VENDOR_ID = "vendorId";

    public static final String VENDOR_NAME = "vendorName";

    public static final String A_FAC_ID = "aFacId";

    public static final String A_FAC_NAME = "aFacName";

    public static final String A_DEVICE_ID = "aDeviceId";

    public static final String A_DEVICE_NAME = "aDeviceName";

    public static final String A_PORT_TYPE_CODE = "aPortTypeCode";

    public static final String A_PORT_TYPE_NAME = "aPortTypeName";

    public static final String A_PORT_ID = "aPortId";

    public static final String A_PORT_NAME = "aPortName";

    public static final String A_SIDE_DEVICE_ID = "aSideDeviceId";

    public static final String A_SIDE_DEVICE_NAME = "aSideDeviceName";

    public static final String A_SIDE_PORT_ID = "aSidePortId";

    public static final String A_SIDE_PORT_NAME = "aSidePortName";

    public static final String Z_FAC_ID = "zFacId";

    public static final String Z_FAC_NAME = "zFacName";

    public static final String Z_DEVICE_ID = "zDeviceId";

    public static final String Z_DEVICE_NAME = "zDeviceName";

    public static final String Z_PORT_TYPE_CODE = "zPortTypeCode";

    public static final String Z_PORT_TYPE_NAME = "zPortTypeName";

    public static final String Z_PORT_ID = "zPortId";

    public static final String Z_PORT_NAME = "zPortName";

    public static final String Z_SIDE_DEVICE_ID = "zSideDeviceId";

    public static final String Z_SIDE_DEVICE_NAME = "zSideDeviceName";

    public static final String Z_SIDE_PORT_ID = "zSidePortId";

    public static final String Z_SIDE_PORT_NAME = "zSidePortName";

    public static final String TYPE = "type";

    public static final String SOURCE = "source";

    public static final String SUPPORT_FILE_ID = "supportFileId";

    public static final String STATUS = "status";

    public static final String INSTANCE_STATUS = "instanceStatus";

    public static final String TERMINATION_DATE = "terminationDate";

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
     * 获取UID
     *
     * @return uid - UID
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置UID
     *
     * @param uid UID
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * 获取Zenlayer 资源编号
     *
     * @return zen_res_no - Zenlayer 资源编号
     */
    public String getZenResNo() {
        return zenResNo;
    }

    /**
     * 设置Zenlayer 资源编号
     *
     * @param zenResNo Zenlayer 资源编号
     */
    public void setZenResNo(String zenResNo) {
        this.zenResNo = zenResNo == null ? null : zenResNo.trim();
    }

    /**
     * 获取Vendor 资源编号
     *
     * @return vendor_res_no - Vendor 资源编号
     */
    public String getVendorResNo() {
        return vendorResNo;
    }

    /**
     * 设置Vendor 资源编号
     *
     * @param vendorResNo Vendor 资源编号
     */
    public void setVendorResNo(String vendorResNo) {
        this.vendorResNo = vendorResNo == null ? null : vendorResNo.trim();
    }

    /**
     * 获取供应商 ID
     *
     * @return vendor_id - 供应商 ID
     */
    public Integer getVendorId() {
        return vendorId;
    }

    /**
     * 设置供应商 ID
     *
     * @param vendorId 供应商 ID
     */
    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * 获取供应商名称
     *
     * @return vendor_name - 供应商名称
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * 设置供应商名称
     *
     * @param vendorName 供应商名称
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    /**
     * 获取A端数据中心
     *
     * @return a_fac_id - A端数据中心
     */
    public Integer getaFacId() {
        return aFacId;
    }

    /**
     * 设置A端数据中心
     *
     * @param aFacId A端数据中心
     */
    public void setaFacId(Integer aFacId) {
        this.aFacId = aFacId;
    }

    /**
     * 获取A端数据中心名称
     *
     * @return a_fac_name - A端数据中心名称
     */
    public String getaFacName() {
        return aFacName;
    }

    /**
     * 设置A端数据中心名称
     *
     * @param aFacName A端数据中心名称
     */
    public void setaFacName(String aFacName) {
        this.aFacName = aFacName == null ? null : aFacName.trim();
    }

    /**
     * 获取A 端设备
     *
     * @return a_device_id - A 端设备
     */
    public Integer getaDeviceId() {
        return aDeviceId;
    }

    /**
     * 设置A 端设备
     *
     * @param aDeviceId A 端设备
     */
    public void setaDeviceId(Integer aDeviceId) {
        this.aDeviceId = aDeviceId;
    }

    /**
     * 获取A端设备名称
     *
     * @return a_device_name - A端设备名称
     */
    public String getaDeviceName() {
        return aDeviceName;
    }

    /**
     * 设置A端设备名称
     *
     * @param aDeviceName A端设备名称
     */
    public void setaDeviceName(String aDeviceName) {
        this.aDeviceName = aDeviceName == null ? null : aDeviceName.trim();
    }

    /**
     * 获取A端口类型字典代码
     *
     * @return a_port_type_code - A端口类型字典代码
     */
    public String getaPortTypeCode() {
        return aPortTypeCode;
    }

    /**
     * 设置A端口类型字典代码
     *
     * @param aPortTypeCode A端口类型字典代码
     */
    public void setaPortTypeCode(String aPortTypeCode) {
        this.aPortTypeCode = aPortTypeCode == null ? null : aPortTypeCode.trim();
    }

    /**
     * 获取A端口类型名称
     *
     * @return a_port_type_name - A端口类型名称
     */
    public String getaPortTypeName() {
        return aPortTypeName;
    }

    /**
     * 设置A端口类型名称
     *
     * @param aPortTypeName A端口类型名称
     */
    public void setaPortTypeName(String aPortTypeName) {
        this.aPortTypeName = aPortTypeName == null ? null : aPortTypeName.trim();
    }

    /**
     * 获取A 端端口
     *
     * @return a_port_id - A 端端口
     */
    public Integer getaPortId() {
        return aPortId;
    }

    /**
     * 设置A 端端口
     *
     * @param aPortId A 端端口
     */
    public void setaPortId(Integer aPortId) {
        this.aPortId = aPortId;
    }

    /**
     * 获取A端端口名称
     *
     * @return a_port_name - A端端口名称
     */
    public String getaPortName() {
        return aPortName;
    }

    /**
     * 设置A端端口名称
     *
     * @param aPortName A端端口名称
     */
    public void setaPortName(String aPortName) {
        this.aPortName = aPortName == null ? null : aPortName.trim();
    }

    /**
     * 获取A端设备,a_device_id存patch panel
     *
     * @return a_side_device_id - A端设备,a_device_id存patch panel
     */
    public Integer getaSideDeviceId() {
        return aSideDeviceId;
    }

    /**
     * 设置A端设备,a_device_id存patch panel
     *
     * @param aSideDeviceId A端设备,a_device_id存patch panel
     */
    public void setaSideDeviceId(Integer aSideDeviceId) {
        this.aSideDeviceId = aSideDeviceId;
    }

    /**
     * 获取A端设备名称,a_device_name存patch panel
     *
     * @return a_side_device_name - A端设备名称,a_device_name存patch panel
     */
    public String getaSideDeviceName() {
        return aSideDeviceName;
    }

    /**
     * 设置A端设备名称,a_device_name存patch panel
     *
     * @param aSideDeviceName A端设备名称,a_device_name存patch panel
     */
    public void setaSideDeviceName(String aSideDeviceName) {
        this.aSideDeviceName = aSideDeviceName == null ? null : aSideDeviceName.trim();
    }

    /**
     * 获取A端端口ID,a_port_id存patch panel
     *
     * @return a_side_port_id - A端端口ID,a_port_id存patch panel
     */
    public Integer getaSidePortId() {
        return aSidePortId;
    }

    /**
     * 设置A端端口ID,a_port_id存patch panel
     *
     * @param aSidePortId A端端口ID,a_port_id存patch panel
     */
    public void setaSidePortId(Integer aSidePortId) {
        this.aSidePortId = aSidePortId;
    }

    /**
     * 获取A端端口名称,a_port_name存patch panel
     *
     * @return a_side_port_name - A端端口名称,a_port_name存patch panel
     */
    public String getaSidePortName() {
        return aSidePortName;
    }

    /**
     * 设置A端端口名称,a_port_name存patch panel
     *
     * @param aSidePortName A端端口名称,a_port_name存patch panel
     */
    public void setaSidePortName(String aSidePortName) {
        this.aSidePortName = aSidePortName == null ? null : aSidePortName.trim();
    }

    /**
     * 获取Z端数据中心
     *
     * @return z_fac_id - Z端数据中心
     */
    public Integer getzFacId() {
        return zFacId;
    }

    /**
     * 设置Z端数据中心
     *
     * @param zFacId Z端数据中心
     */
    public void setzFacId(Integer zFacId) {
        this.zFacId = zFacId;
    }

    /**
     * 获取Z端数据中心名称
     *
     * @return z_fac_name - Z端数据中心名称
     */
    public String getzFacName() {
        return zFacName;
    }

    /**
     * 设置Z端数据中心名称
     *
     * @param zFacName Z端数据中心名称
     */
    public void setzFacName(String zFacName) {
        this.zFacName = zFacName == null ? null : zFacName.trim();
    }

    /**
     * 获取Z 端设备
     *
     * @return z_device_id - Z 端设备
     */
    public Integer getzDeviceId() {
        return zDeviceId;
    }

    /**
     * 设置Z 端设备
     *
     * @param zDeviceId Z 端设备
     */
    public void setzDeviceId(Integer zDeviceId) {
        this.zDeviceId = zDeviceId;
    }

    /**
     * 获取Z端设备名称
     *
     * @return z_device_name - Z端设备名称
     */
    public String getzDeviceName() {
        return zDeviceName;
    }

    /**
     * 设置Z端设备名称
     *
     * @param zDeviceName Z端设备名称
     */
    public void setzDeviceName(String zDeviceName) {
        this.zDeviceName = zDeviceName == null ? null : zDeviceName.trim();
    }

    /**
     * 获取Z端口类型字典代码
     *
     * @return z_port_type_code - Z端口类型字典代码
     */
    public String getzPortTypeCode() {
        return zPortTypeCode;
    }

    /**
     * 设置Z端口类型字典代码
     *
     * @param zPortTypeCode Z端口类型字典代码
     */
    public void setzPortTypeCode(String zPortTypeCode) {
        this.zPortTypeCode = zPortTypeCode == null ? null : zPortTypeCode.trim();
    }

    /**
     * 获取Z端口类型名称
     *
     * @return z_port_type_name - Z端口类型名称
     */
    public String getzPortTypeName() {
        return zPortTypeName;
    }

    /**
     * 设置Z端口类型名称
     *
     * @param zPortTypeName Z端口类型名称
     */
    public void setzPortTypeName(String zPortTypeName) {
        this.zPortTypeName = zPortTypeName == null ? null : zPortTypeName.trim();
    }

    /**
     * 获取Z 端端口
     *
     * @return z_port_id - Z 端端口
     */
    public Integer getzPortId() {
        return zPortId;
    }

    /**
     * 设置Z 端端口
     *
     * @param zPortId Z 端端口
     */
    public void setzPortId(Integer zPortId) {
        this.zPortId = zPortId;
    }

    /**
     * 获取Z端端口名称
     *
     * @return z_port_name - Z端端口名称
     */
    public String getzPortName() {
        return zPortName;
    }

    /**
     * 设置Z端端口名称
     *
     * @param zPortName Z端端口名称
     */
    public void setzPortName(String zPortName) {
        this.zPortName = zPortName == null ? null : zPortName.trim();
    }

    /**
     * 获取Z端设备,z_device_id存patch panel
     *
     * @return z_side_device_id - Z端设备,z_device_id存patch panel
     */
    public Integer getzSideDeviceId() {
        return zSideDeviceId;
    }

    /**
     * 设置Z端设备,z_device_id存patch panel
     *
     * @param zSideDeviceId Z端设备,z_device_id存patch panel
     */
    public void setzSideDeviceId(Integer zSideDeviceId) {
        this.zSideDeviceId = zSideDeviceId;
    }

    /**
     * 获取Z端设备名称,z_device_name存patch panel
     *
     * @return z_side_device_name - Z端设备名称,z_device_name存patch panel
     */
    public String getzSideDeviceName() {
        return zSideDeviceName;
    }

    /**
     * 设置Z端设备名称,z_device_name存patch panel
     *
     * @param zSideDeviceName Z端设备名称,z_device_name存patch panel
     */
    public void setzSideDeviceName(String zSideDeviceName) {
        this.zSideDeviceName = zSideDeviceName == null ? null : zSideDeviceName.trim();
    }

    /**
     * 获取Z端端口ID,z_port_id存patch panel
     *
     * @return z_side_port_id - Z端端口ID,z_port_id存patch panel
     */
    public Integer getzSidePortId() {
        return zSidePortId;
    }

    /**
     * 设置Z端端口ID,z_port_id存patch panel
     *
     * @param zSidePortId Z端端口ID,z_port_id存patch panel
     */
    public void setzSidePortId(Integer zSidePortId) {
        this.zSidePortId = zSidePortId;
    }

    /**
     * 获取Z端端口名称,z_port_name存patch panel
     *
     * @return z_side_port_name - Z端端口名称,z_port_name存patch panel
     */
    public String getzSidePortName() {
        return zSidePortName;
    }

    /**
     * 设置Z端端口名称,z_port_name存patch panel
     *
     * @param zSidePortName Z端端口名称,z_port_name存patch panel
     */
    public void setzSidePortName(String zSidePortName) {
        this.zSidePortName = zSidePortName == null ? null : zSidePortName.trim();
    }

    /**
     * 获取资源归属类型 0:Direct line-层峰 1:  Lease line-供应商
     *
     * @return type - 资源归属类型 0:Direct line-层峰 1:  Lease line-供应商
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置资源归属类型 0:Direct line-层峰 1:  Lease line-供应商
     *
     * @param type 资源归属类型 0:Direct line-层峰 1:  Lease line-供应商
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取来源0-页面新增，1-PW流程新增
     *
     * @return source - 来源0-页面新增，1-PW流程新增
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置来源0-页面新增，1-PW流程新增
     *
     * @param source 来源0-页面新增，1-PW流程新增
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取保障文件id
     *
     * @return support_file_id - 保障文件id
     */
    public Integer getSupportFileId() {
        return supportFileId;
    }

    /**
     * 设置保障文件id
     *
     * @param supportFileId 保障文件id
     */
    public void setSupportFileId(Integer supportFileId) {
        this.supportFileId = supportFileId;
    }

    /**
     * 获取状态 0:pre-purchase 1:active 2: in use 3: inactive
     *
     * @return status - 状态 0:pre-purchase 1:active 2: in use 3: inactive
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0:pre-purchase 1:active 2: in use 3: inactive
     *
     * @param status 状态 0:pre-purchase 1:active 2: in use 3: inactive
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取流程状态 0:nomal  1:renewing 2: renewed 3:terminating 4:terminated
     *
     * @return instance_status - 流程状态 0:nomal  1:renewing 2: renewed 3:terminating 4:terminated
     */
    public Integer getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * 设置流程状态 0:nomal  1:renewing 2: renewed 3:terminating 4:terminated
     *
     * @param instanceStatus 流程状态 0:nomal  1:renewing 2: renewed 3:terminating 4:terminated
     */
    public void setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * 获取终止时间
     *
     * @return termination_date - 终止时间
     */
    public Date getTerminationDate() {
        return terminationDate;
    }

    /**
     * 设置终止时间
     *
     * @param terminationDate 终止时间
     */
    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
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
        sb.append(", uid=").append(uid);
        sb.append(", zenResNo=").append(zenResNo);
        sb.append(", vendorResNo=").append(vendorResNo);
        sb.append(", vendorId=").append(vendorId);
        sb.append(", vendorName=").append(vendorName);
        sb.append(", aFacId=").append(aFacId);
        sb.append(", aFacName=").append(aFacName);
        sb.append(", aDeviceId=").append(aDeviceId);
        sb.append(", aDeviceName=").append(aDeviceName);
        sb.append(", aPortTypeCode=").append(aPortTypeCode);
        sb.append(", aPortTypeName=").append(aPortTypeName);
        sb.append(", aPortId=").append(aPortId);
        sb.append(", aPortName=").append(aPortName);
        sb.append(", aSideDeviceId=").append(aSideDeviceId);
        sb.append(", aSideDeviceName=").append(aSideDeviceName);
        sb.append(", aSidePortId=").append(aSidePortId);
        sb.append(", aSidePortName=").append(aSidePortName);
        sb.append(", zFacId=").append(zFacId);
        sb.append(", zFacName=").append(zFacName);
        sb.append(", zDeviceId=").append(zDeviceId);
        sb.append(", zDeviceName=").append(zDeviceName);
        sb.append(", zPortTypeCode=").append(zPortTypeCode);
        sb.append(", zPortTypeName=").append(zPortTypeName);
        sb.append(", zPortId=").append(zPortId);
        sb.append(", zPortName=").append(zPortName);
        sb.append(", zSideDeviceId=").append(zSideDeviceId);
        sb.append(", zSideDeviceName=").append(zSideDeviceName);
        sb.append(", zSidePortId=").append(zSidePortId);
        sb.append(", zSidePortName=").append(zSidePortName);
        sb.append(", type=").append(type);
        sb.append(", source=").append(source);
        sb.append(", supportFileId=").append(supportFileId);
        sb.append(", status=").append(status);
        sb.append(", instanceStatus=").append(instanceStatus);
        sb.append(", terminationDate=").append(terminationDate);
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
        ResourceCrossConnectDO other = (ResourceCrossConnectDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getZenResNo() == null ? other.getZenResNo() == null : this.getZenResNo().equals(other.getZenResNo()))
                && (this.getVendorResNo() == null ? other.getVendorResNo() == null : this.getVendorResNo().equals(other.getVendorResNo()))
                && (this.getVendorId() == null ? other.getVendorId() == null : this.getVendorId().equals(other.getVendorId()))
                && (this.getVendorName() == null ? other.getVendorName() == null : this.getVendorName().equals(other.getVendorName()))
                && (this.getaFacId() == null ? other.getaFacId() == null : this.getaFacId().equals(other.getaFacId()))
                && (this.getaFacName() == null ? other.getaFacName() == null : this.getaFacName().equals(other.getaFacName()))
                && (this.getaDeviceId() == null ? other.getaDeviceId() == null : this.getaDeviceId().equals(other.getaDeviceId()))
                && (this.getaDeviceName() == null ? other.getaDeviceName() == null : this.getaDeviceName().equals(other.getaDeviceName()))
                && (this.getaPortTypeCode() == null ? other.getaPortTypeCode() == null : this.getaPortTypeCode().equals(other.getaPortTypeCode()))
                && (this.getaPortTypeName() == null ? other.getaPortTypeName() == null : this.getaPortTypeName().equals(other.getaPortTypeName()))
                && (this.getaPortId() == null ? other.getaPortId() == null : this.getaPortId().equals(other.getaPortId()))
                && (this.getaPortName() == null ? other.getaPortName() == null : this.getaPortName().equals(other.getaPortName()))
                && (this.getaSideDeviceId() == null ? other.getaSideDeviceId() == null : this.getaSideDeviceId().equals(other.getaSideDeviceId()))
                && (this.getaSideDeviceName() == null ? other.getaSideDeviceName() == null : this.getaSideDeviceName().equals(other.getaSideDeviceName()))
                && (this.getaSidePortId() == null ? other.getaSidePortId() == null : this.getaSidePortId().equals(other.getaSidePortId()))
                && (this.getaSidePortName() == null ? other.getaSidePortName() == null : this.getaSidePortName().equals(other.getaSidePortName()))
                && (this.getzFacId() == null ? other.getzFacId() == null : this.getzFacId().equals(other.getzFacId()))
                && (this.getzFacName() == null ? other.getzFacName() == null : this.getzFacName().equals(other.getzFacName()))
                && (this.getzDeviceId() == null ? other.getzDeviceId() == null : this.getzDeviceId().equals(other.getzDeviceId()))
                && (this.getzDeviceName() == null ? other.getzDeviceName() == null : this.getzDeviceName().equals(other.getzDeviceName()))
                && (this.getzPortTypeCode() == null ? other.getzPortTypeCode() == null : this.getzPortTypeCode().equals(other.getzPortTypeCode()))
                && (this.getzPortTypeName() == null ? other.getzPortTypeName() == null : this.getzPortTypeName().equals(other.getzPortTypeName()))
                && (this.getzPortId() == null ? other.getzPortId() == null : this.getzPortId().equals(other.getzPortId()))
                && (this.getzPortName() == null ? other.getzPortName() == null : this.getzPortName().equals(other.getzPortName()))
                && (this.getzSideDeviceId() == null ? other.getzSideDeviceId() == null : this.getzSideDeviceId().equals(other.getzSideDeviceId()))
                && (this.getzSideDeviceName() == null ? other.getzSideDeviceName() == null : this.getzSideDeviceName().equals(other.getzSideDeviceName()))
                && (this.getzSidePortId() == null ? other.getzSidePortId() == null : this.getzSidePortId().equals(other.getzSidePortId()))
                && (this.getzSidePortName() == null ? other.getzSidePortName() == null : this.getzSidePortName().equals(other.getzSidePortName()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
                && (this.getSupportFileId() == null ? other.getSupportFileId() == null : this.getSupportFileId().equals(other.getSupportFileId()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getInstanceStatus() == null ? other.getInstanceStatus() == null : this.getInstanceStatus().equals(other.getInstanceStatus()))
                && (this.getTerminationDate() == null ? other.getTerminationDate() == null : this.getTerminationDate().equals(other.getTerminationDate()))
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
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getZenResNo() == null) ? 0 : getZenResNo().hashCode());
        result = prime * result + ((getVendorResNo() == null) ? 0 : getVendorResNo().hashCode());
        result = prime * result + ((getVendorId() == null) ? 0 : getVendorId().hashCode());
        result = prime * result + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        result = prime * result + ((getaFacId() == null) ? 0 : getaFacId().hashCode());
        result = prime * result + ((getaFacName() == null) ? 0 : getaFacName().hashCode());
        result = prime * result + ((getaDeviceId() == null) ? 0 : getaDeviceId().hashCode());
        result = prime * result + ((getaDeviceName() == null) ? 0 : getaDeviceName().hashCode());
        result = prime * result + ((getaPortTypeCode() == null) ? 0 : getaPortTypeCode().hashCode());
        result = prime * result + ((getaPortTypeName() == null) ? 0 : getaPortTypeName().hashCode());
        result = prime * result + ((getaPortId() == null) ? 0 : getaPortId().hashCode());
        result = prime * result + ((getaPortName() == null) ? 0 : getaPortName().hashCode());
        result = prime * result + ((getaSideDeviceId() == null) ? 0 : getaSideDeviceId().hashCode());
        result = prime * result + ((getaSideDeviceName() == null) ? 0 : getaSideDeviceName().hashCode());
        result = prime * result + ((getaSidePortId() == null) ? 0 : getaSidePortId().hashCode());
        result = prime * result + ((getaSidePortName() == null) ? 0 : getaSidePortName().hashCode());
        result = prime * result + ((getzFacId() == null) ? 0 : getzFacId().hashCode());
        result = prime * result + ((getzFacName() == null) ? 0 : getzFacName().hashCode());
        result = prime * result + ((getzDeviceId() == null) ? 0 : getzDeviceId().hashCode());
        result = prime * result + ((getzDeviceName() == null) ? 0 : getzDeviceName().hashCode());
        result = prime * result + ((getzPortTypeCode() == null) ? 0 : getzPortTypeCode().hashCode());
        result = prime * result + ((getzPortTypeName() == null) ? 0 : getzPortTypeName().hashCode());
        result = prime * result + ((getzPortId() == null) ? 0 : getzPortId().hashCode());
        result = prime * result + ((getzPortName() == null) ? 0 : getzPortName().hashCode());
        result = prime * result + ((getzSideDeviceId() == null) ? 0 : getzSideDeviceId().hashCode());
        result = prime * result + ((getzSideDeviceName() == null) ? 0 : getzSideDeviceName().hashCode());
        result = prime * result + ((getzSidePortId() == null) ? 0 : getzSidePortId().hashCode());
        result = prime * result + ((getzSidePortName() == null) ? 0 : getzSidePortName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getSupportFileId() == null) ? 0 : getSupportFileId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        result = prime * result + ((getTerminationDate() == null) ? 0 : getTerminationDate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        return result;
    }
}

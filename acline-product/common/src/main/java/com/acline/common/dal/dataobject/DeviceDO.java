package com.acline.common.dal.dataobject;

//@Table(name = "`product_devices`")
public class DeviceDO {
////    @Id
////    @Column(name = "`dev_id`")
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer devId;
//
////    @Column(name = "`parent`")
//    private Integer parent;
//
////    @Column(name = "`type_id`")
//    private Integer typeId;
//    /**
//     * 状态参考：-2 -待报废（新增状态），-1 -回收，0-下架，1-空闲，2-仓库，3-使用中，4-预占，6-待修理（新增状态），8-待激活，9-采购，11-取消中，12-在途
//     */
////    @Column(name = "`status`")
//    private Integer status;
//
////    @Column(name = "`client_id`")
//    private Integer clientId;
//
////    @Column(name = "`service_id`")
//    private Integer serviceId;
//
////    @Column(name = "`owner`")
//    private Integer owner;
//
////    @Column(name = "`owner_type`")
//    private String ownerType;
//
////    @Column(name = "`client_owned`")
//    private Integer clientOwned;
//
////    @Column(name = "`base`")
//    private Integer base;
//
////    @Column(name = "`dev_desc`")
//    private String devDesc;
//
////    @Column(name = "`can_parent`")
//    private Integer canParent;
//
////    @Column(name = "`label`")
//    private String label;
//
////    @Column(name = "`rack_id`")
//    private Integer rackId;
//
//    @Column(name = "`rack_pos`")
//    private String rackPos;
//
//    @Column(name = "`rack_mount_orientation`")
//    private Byte rackMountOrientation;
//
//    @Column(name = "`rack_units`")
//    private Integer rackUnits;
//
//    @Column(name = "`height`")
//    private BigDecimal height;
//
//    @Column(name = "`width`")
//    private BigDecimal width;
//
//    @Column(name = "`depth`")
//    private BigDecimal depth;
//
//    @Column(name = "`front_image_file_id`")
//    private Integer frontImageFileId;
//
//    @Column(name = "`back_image_file_id`")
//    private Integer backImageFileId;
//
//    @Column(name = "`mon_total`")
//    private Integer monTotal;
//
//    @Column(name = "`mon_up`")
//    private Integer monUp;
//
//    @Column(name = "`mon_down`")
//    private Integer monDown;
//
//    @Column(name = "`mon_disabled`")
//    private Integer monDisabled;
//
//    @Column(name = "`mon_warn`")
//    private Integer monWarn;
//
//    @Column(name = "`power_status`")
//    private Integer powerStatus;
//
//    @Column(name = "`last_change`")
//    private Integer lastChange;
//
//    @Column(name = "`last_poll`")
//    private Integer lastPoll;
//
//    @Column(name = "`connection_node_type_id`")
//    private Integer connectionNodeTypeId;
//
//    @Column(name = "`asset_no`")
//    private String assetNo;
//
//    @Column(name = "`sn`")
//    private String sn;
//
//    @Column(name = "`relate_code`")
//    private String relateCode;
//
//    @Column(name = "`relate_detail_id`")
//    private Integer relateDetailId;
//
//    @Column(name = "`owner_id`")
//    private Integer ownerId;
//
//    @Column(name = "`ipmi_ip`")
//    private String ipmiIp;
//
//    @Column(name = "`pool_id`")
//    private Integer poolId;
//
//    /**
//     * 是否是nni
//     */
//    @Column(name = "`is_nni`")
//    private Integer isNni;
//
//    @Column(name = "`create_time`")
//    private Date createTime;
//
//    @Column(name = "`update_time`")
//    private Date updateTime;
//
//    /**
//     * 单价
//     */
//    @Column(name = "`price`")
//    private BigDecimal price;
//
//    /**
//     * 币种
//     */
//    @Column(name = "`currency`")
//    private String currency;
//
//    /**
//     * 采购的PONO
//     */
//    @Column(name = "`pono`")
//    private String pono;
//
//    /**
//     * 仓库编号
//     */
//    @Column(name = "`storage_id`")
//    private Integer storageId;
//
//    /**
//     * 工单ID
//     */
//    @Column(name = "`inst_id`")
//    private Integer instId;
//
//    /**
//     * 操作人ID
//     */
//    @Column(name = "`oper_id`")
//    private String operId;
//
//    /**
//     * 此记录生成时间
//     */
//    @Column(name = "`op_time`")
//    private Date opTime;
//
//    /**
//     * 此记录说明
//     */
//    @Column(name = "`comment`")
//    private String comment;
//
//    /**
//     * 单价
//     */
//    @Column(name = "`unit`")
//    private String unit;
//
//    /**
//     *  数据中心ID
//     */
//    @Column(name = "`fac_id`")
//    private Integer facId;
//
//    /**
//     * 是否订阅
//     */
//    @Column(name = "`is_subscribe`")
//    private Integer isSubscribe;
//
//    @Column(name = "`pw_list_id`")
//    private Integer pwListId;
//
//    /**
//     * 1:未损坏,2:已损坏
//     */
//    @Column(name = "`devices_destroy`")
//    private Integer devicesDestroy;
//
//    /**
//     * 同步版本号
//     */
//    @Column(name = "`sync_version`")
//    private Integer syncVersion;
//
//    /**
//     * 朝向 1-Front to back, 2-Back to front, 3-Left to right, 4-Right to left, 5-Up to down, 6-Down to up
//     */
//    @Column(name = "`fan_direction`")
//    private Integer fanDirection;
//
//    /**
//     * 是否保留，1-是，0-否
//     */
//    @Column(name = "`reserved`")
//    private Integer reserved;
//
//    /**
//     * 是否堆叠设备，1-是，0-否
//     */
//    @Column(name = "`stacked`")
//    private Integer stacked;
//
//    /**
//     * 堆叠编号
//     */
//    @Column(name = "`stack_index`")
//    private Integer stackIndex;
//
//    /**
//     * 堆叠设备的主键id
//     */
//    @Column(name = "`stack_dev_id`")
//    private Integer stackDevId;
//
//    /**
//     * 关联resource_device_type 表主键
//     */
//    @Column(name = "`oss3_dev_type_id`")
//    private Integer oss3DevTypeId;
//
//    @Column(name = "`metadata`")
//    private String metadata;
//
//    @Column(name = "`custom_info`")
//    private String customInfo;
//
//    public static final String DEV_ID = "devId";
//
//    public static final String PARENT = "parent";
//
//    public static final String TYPE_ID = "typeId";
//
//    public static final String STATUS = "status";
//
//    public static final String CLIENT_ID = "clientId";
//
//    public static final String SERVICE_ID = "serviceId";
//
//    public static final String OWNER = "owner";
//
//    public static final String OWNER_TYPE = "ownerType";
//
//    public static final String CLIENT_OWNED = "clientOwned";
//
//    public static final String BASE = "base";
//
//    public static final String DEV_DESC = "devDesc";
//
//    public static final String CAN_PARENT = "canParent";
//
//    public static final String LABEL = "label";
//
//    public static final String RACK_ID = "rackId";
//
//    public static final String RACK_POS = "rackPos";
//
//    public static final String RACK_MOUNT_ORIENTATION = "rackMountOrientation";
//
//    public static final String RACK_UNITS = "rackUnits";
//
//    public static final String HEIGHT = "height";
//
//    public static final String WIDTH = "width";
//
//    public static final String DEPTH = "depth";
//
//    public static final String FRONT_IMAGE_FILE_ID = "frontImageFileId";
//
//    public static final String BACK_IMAGE_FILE_ID = "backImageFileId";
//
//    public static final String MON_TOTAL = "monTotal";
//
//    public static final String MON_UP = "monUp";
//
//    public static final String MON_DOWN = "monDown";
//
//    public static final String MON_DISABLED = "monDisabled";
//
//    public static final String MON_WARN = "monWarn";
//
//    public static final String POWER_STATUS = "powerStatus";
//
//    public static final String LAST_CHANGE = "lastChange";
//
//    public static final String LAST_POLL = "lastPoll";
//
//    public static final String CONNECTION_NODE_TYPE_ID = "connectionNodeTypeId";
//
//    public static final String ASSET_NO = "assetNo";
//
//    public static final String SN = "sn";
//
//    public static final String RELATE_CODE = "relateCode";
//
//    public static final String RELATE_DETAIL_ID = "relateDetailId";
//
//    public static final String OWNER_ID = "ownerId";
//
//    public static final String IPMI_IP = "ipmiIp";
//
//    public static final String POOL_ID = "poolId";
//
//    public static final String IS_NNI = "isNni";
//
//    public static final String CREATE_TIME = "createTime";
//
//    public static final String UPDATE_TIME = "updateTime";
//
//    public static final String PRICE = "price";
//
//    public static final String CURRENCY = "currency";
//
//    public static final String PONO = "pono";
//
//    public static final String STORAGE_ID = "storageId";
//
//    public static final String INST_ID = "instId";
//
//    public static final String OPER_ID = "operId";
//
//    public static final String OP_TIME = "opTime";
//
//    public static final String COMMENT = "comment";
//
//    public static final String UNIT = "unit";
//
//    public static final String FAC_ID = "facId";
//
//    public static final String IS_SUBSCRIBE = "isSubscribe";
//
//    public static final String PW_LIST_ID = "pwListId";
//
//    public static final String DEVICES_DESTROY = "devicesDestroy";
//
//    public static final String SYNC_VERSION = "syncVersion";
//
//    public static final String FAN_DIRECTION = "fanDirection";
//
//    public static final String RESERVED = "reserved";
//
//    public static final String STACKED = "stacked";
//
//    public static final String STACK_INDEX = "stackIndex";
//
//    public static final String STACK_DEV_ID = "stackDevId";
//
//    public static final String OSS3_DEV_TYPE_ID = "oss3DevTypeId";
//
//    public static final String METADATA = "metadata";
//
//    public static final String CUSTOM_INFO = "customInfo";
//
//    /**
//     * @return dev_id
//     */
//    public Integer getDevId() {
//        return devId;
//    }
//
//    /**
//     * @param devId
//     */
//    public void setDevId(Integer devId) {
//        this.devId = devId;
//    }
//
//    /**
//     * @return parent
//     */
//    public Integer getParent() {
//        return parent;
//    }
//
//    /**
//     * @param parent
//     */
//    public void setParent(Integer parent) {
//        this.parent = parent;
//    }
//
//    /**
//     * @return type_id
//     */
//    public Integer getTypeId() {
//        return typeId;
//    }
//
//    /**
//     * @param typeId
//     */
//    public void setTypeId(Integer typeId) {
//        this.typeId = typeId;
//    }
//
//    /**
//     * @return status
//     */
//    public Integer getStatus() {
//        return status;
//    }
//
//    /**
//     * @param status
//     */
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    /**
//     * @return client_id
//     */
//    public Integer getClientId() {
//        return clientId;
//    }
//
//    /**
//     * @param clientId
//     */
//    public void setClientId(Integer clientId) {
//        this.clientId = clientId;
//    }
//
//    /**
//     * @return service_id
//     */
//    public Integer getServiceId() {
//        return serviceId;
//    }
//
//    /**
//     * @param serviceId
//     */
//    public void setServiceId(Integer serviceId) {
//        this.serviceId = serviceId;
//    }
//
//    /**
//     * @return owner
//     */
//    public Integer getOwner() {
//        return owner;
//    }
//
//    /**
//     * @param owner
//     */
//    public void setOwner(Integer owner) {
//        this.owner = owner;
//    }
//
//    /**
//     * @return owner_type
//     */
//    public String getOwnerType() {
//        return ownerType;
//    }
//
//    /**
//     * @param ownerType
//     */
//    public void setOwnerType(String ownerType) {
//        this.ownerType = ownerType == null ? null : ownerType.trim();
//    }
//
//    /**
//     * @return client_owned
//     */
//    public Integer getClientOwned() {
//        return clientOwned;
//    }
//
//    /**
//     * @param clientOwned
//     */
//    public void setClientOwned(Integer clientOwned) {
//        this.clientOwned = clientOwned;
//    }
//
//    /**
//     * @return base
//     */
//    public Integer getBase() {
//        return base;
//    }
//
//    /**
//     * @param base
//     */
//    public void setBase(Integer base) {
//        this.base = base;
//    }
//
//    /**
//     * @return dev_desc
//     */
//    public String getDevDesc() {
//        return devDesc;
//    }
//
//    /**
//     * @param devDesc
//     */
//    public void setDevDesc(String devDesc) {
//        this.devDesc = devDesc == null ? null : devDesc.trim();
//    }
//
//    /**
//     * @return can_parent
//     */
//    public Integer getCanParent() {
//        return canParent;
//    }
//
//    /**
//     * @param canParent
//     */
//    public void setCanParent(Integer canParent) {
//        this.canParent = canParent;
//    }
//
//    /**
//     * @return label
//     */
//    public String getLabel() {
//        return label;
//    }
//
//    /**
//     * @param label
//     */
//    public void setLabel(String label) {
//        this.label = label == null ? null : label.trim();
//    }
//
//    /**
//     * @return rack_id
//     */
//    public Integer getRackId() {
//        return rackId;
//    }
//
//    /**
//     * @param rackId
//     */
//    public void setRackId(Integer rackId) {
//        this.rackId = rackId;
//    }
//
//    /**
//     * @return rack_pos
//     */
//    public String getRackPos() {
//        return rackPos;
//    }
//
//    /**
//     * @param rackPos
//     */
//    public void setRackPos(String rackPos) {
//        this.rackPos = rackPos == null ? null : rackPos.trim();
//    }
//
//    /**
//     * @return rack_mount_orientation
//     */
//    public Byte getRackMountOrientation() {
//        return rackMountOrientation;
//    }
//
//    /**
//     * @param rackMountOrientation
//     */
//    public void setRackMountOrientation(Byte rackMountOrientation) {
//        this.rackMountOrientation = rackMountOrientation;
//    }
//
//    /**
//     * @return rack_units
//     */
//    public Integer getRackUnits() {
//        return rackUnits;
//    }
//
//    /**
//     * @param rackUnits
//     */
//    public void setRackUnits(Integer rackUnits) {
//        this.rackUnits = rackUnits;
//    }
//
//    /**
//     * @return height
//     */
//    public BigDecimal getHeight() {
//        return height;
//    }
//
//    /**
//     * @param height
//     */
//    public void setHeight(BigDecimal height) {
//        this.height = height;
//    }
//
//    /**
//     * @return width
//     */
//    public BigDecimal getWidth() {
//        return width;
//    }
//
//    /**
//     * @param width
//     */
//    public void setWidth(BigDecimal width) {
//        this.width = width;
//    }
//
//    /**
//     * @return depth
//     */
//    public BigDecimal getDepth() {
//        return depth;
//    }
//
//    /**
//     * @param depth
//     */
//    public void setDepth(BigDecimal depth) {
//        this.depth = depth;
//    }
//
//    /**
//     * @return front_image_file_id
//     */
//    public Integer getFrontImageFileId() {
//        return frontImageFileId;
//    }
//
//    /**
//     * @param frontImageFileId
//     */
//    public void setFrontImageFileId(Integer frontImageFileId) {
//        this.frontImageFileId = frontImageFileId;
//    }
//
//    /**
//     * @return back_image_file_id
//     */
//    public Integer getBackImageFileId() {
//        return backImageFileId;
//    }
//
//    /**
//     * @param backImageFileId
//     */
//    public void setBackImageFileId(Integer backImageFileId) {
//        this.backImageFileId = backImageFileId;
//    }
//
//    /**
//     * @return mon_total
//     */
//    public Integer getMonTotal() {
//        return monTotal;
//    }
//
//    /**
//     * @param monTotal
//     */
//    public void setMonTotal(Integer monTotal) {
//        this.monTotal = monTotal;
//    }
//
//    /**
//     * @return mon_up
//     */
//    public Integer getMonUp() {
//        return monUp;
//    }
//
//    /**
//     * @param monUp
//     */
//    public void setMonUp(Integer monUp) {
//        this.monUp = monUp;
//    }
//
//    /**
//     * @return mon_down
//     */
//    public Integer getMonDown() {
//        return monDown;
//    }
//
//    /**
//     * @param monDown
//     */
//    public void setMonDown(Integer monDown) {
//        this.monDown = monDown;
//    }
//
//    /**
//     * @return mon_disabled
//     */
//    public Integer getMonDisabled() {
//        return monDisabled;
//    }
//
//    /**
//     * @param monDisabled
//     */
//    public void setMonDisabled(Integer monDisabled) {
//        this.monDisabled = monDisabled;
//    }
//
//    /**
//     * @return mon_warn
//     */
//    public Integer getMonWarn() {
//        return monWarn;
//    }
//
//    /**
//     * @param monWarn
//     */
//    public void setMonWarn(Integer monWarn) {
//        this.monWarn = monWarn;
//    }
//
//    /**
//     * @return power_status
//     */
//    public Integer getPowerStatus() {
//        return powerStatus;
//    }
//
//    /**
//     * @param powerStatus
//     */
//    public void setPowerStatus(Integer powerStatus) {
//        this.powerStatus = powerStatus;
//    }
//
//    /**
//     * @return last_change
//     */
//    public Integer getLastChange() {
//        return lastChange;
//    }
//
//    /**
//     * @param lastChange
//     */
//    public void setLastChange(Integer lastChange) {
//        this.lastChange = lastChange;
//    }
//
//    /**
//     * @return last_poll
//     */
//    public Integer getLastPoll() {
//        return lastPoll;
//    }
//
//    /**
//     * @param lastPoll
//     */
//    public void setLastPoll(Integer lastPoll) {
//        this.lastPoll = lastPoll;
//    }
//
//    /**
//     * @return connection_node_type_id
//     */
//    public Integer getConnectionNodeTypeId() {
//        return connectionNodeTypeId;
//    }
//
//    /**
//     * @param connectionNodeTypeId
//     */
//    public void setConnectionNodeTypeId(Integer connectionNodeTypeId) {
//        this.connectionNodeTypeId = connectionNodeTypeId;
//    }
//
//    /**
//     * @return asset_no
//     */
//    public String getAssetNo() {
//        return assetNo;
//    }
//
//    /**
//     * @param assetNo
//     */
//    public void setAssetNo(String assetNo) {
//        this.assetNo = assetNo == null ? null : assetNo.trim();
//    }
//
//    /**
//     * @return sn
//     */
//    public String getSn() {
//        return sn;
//    }
//
//    /**
//     * @param sn
//     */
//    public void setSn(String sn) {
//        this.sn = sn == null ? null : sn.trim();
//    }
//
//    /**
//     * @return relate_code
//     */
//    public String getRelateCode() {
//        return relateCode;
//    }
//
//    /**
//     * @param relateCode
//     */
//    public void setRelateCode(String relateCode) {
//        this.relateCode = relateCode == null ? null : relateCode.trim();
//    }
//
//    /**
//     * @return relate_detail_id
//     */
//    public Integer getRelateDetailId() {
//        return relateDetailId;
//    }
//
//    /**
//     * @param relateDetailId
//     */
//    public void setRelateDetailId(Integer relateDetailId) {
//        this.relateDetailId = relateDetailId;
//    }
//
//    /**
//     * @return owner_id
//     */
//    public Integer getOwnerId() {
//        return ownerId;
//    }
//
//    /**
//     * @param ownerId
//     */
//    public void setOwnerId(Integer ownerId) {
//        this.ownerId = ownerId;
//    }
//
//    /**
//     * @return ipmi_ip
//     */
//    public String getIpmiIp() {
//        return ipmiIp;
//    }
//
//    /**
//     * @param ipmiIp
//     */
//    public void setIpmiIp(String ipmiIp) {
//        this.ipmiIp = ipmiIp == null ? null : ipmiIp.trim();
//    }
//
//    /**
//     * @return pool_id
//     */
//    public Integer getPoolId() {
//        return poolId;
//    }
//
//    /**
//     * @param poolId
//     */
//    public void setPoolId(Integer poolId) {
//        this.poolId = poolId;
//    }
//
//    /**
//     * 获取是否是nni
//     *
//     * @return is_nni - 是否是nni
//     */
//    public Integer getIsNni() {
//        return isNni;
//    }
//
//    /**
//     * 设置是否是nni
//     *
//     * @param isNni 是否是nni
//     */
//    public void setIsNni(Integer isNni) {
//        this.isNni = isNni;
//    }
//
//    /**
//     * @return create_time
//     */
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    /**
//     * @param createTime
//     */
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    /**
//     * @return update_time
//     */
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    /**
//     * @param updateTime
//     */
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    /**
//     * 获取单价
//     *
//     * @return price - 单价
//     */
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    /**
//     * 设置单价
//     *
//     * @param price 单价
//     */
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    /**
//     * 获取币种
//     *
//     * @return currency - 币种
//     */
//    public String getCurrency() {
//        return currency;
//    }
//
//    /**
//     * 设置币种
//     *
//     * @param currency 币种
//     */
//    public void setCurrency(String currency) {
//        this.currency = currency == null ? null : currency.trim();
//    }
//
//    /**
//     * 获取采购的PONO
//     *
//     * @return pono - 采购的PONO
//     */
//    public String getPono() {
//        return pono;
//    }
//
//    /**
//     * 设置采购的PONO
//     *
//     * @param pono 采购的PONO
//     */
//    public void setPono(String pono) {
//        this.pono = pono == null ? null : pono.trim();
//    }
//
//    /**
//     * 获取仓库编号
//     *
//     * @return storage_id - 仓库编号
//     */
//    public Integer getStorageId() {
//        return storageId;
//    }
//
//    /**
//     * 设置仓库编号
//     *
//     * @param storageId 仓库编号
//     */
//    public void setStorageId(Integer storageId) {
//        this.storageId = storageId;
//    }
//
//    /**
//     * 获取工单ID
//     *
//     * @return inst_id - 工单ID
//     */
//    public Integer getInstId() {
//        return instId;
//    }
//
//    /**
//     * 设置工单ID
//     *
//     * @param instId 工单ID
//     */
//    public void setInstId(Integer instId) {
//        this.instId = instId;
//    }
//
//    /**
//     * 获取操作人ID
//     *
//     * @return oper_id - 操作人ID
//     */
//    public String getOperId() {
//        return operId;
//    }
//
//    /**
//     * 设置操作人ID
//     *
//     * @param operId 操作人ID
//     */
//    public void setOperId(String operId) {
//        this.operId = operId == null ? null : operId.trim();
//    }
//
//    /**
//     * 获取此记录生成时间
//     *
//     * @return op_time - 此记录生成时间
//     */
//    public Date getOpTime() {
//        return opTime;
//    }
//
//    /**
//     * 设置此记录生成时间
//     *
//     * @param opTime 此记录生成时间
//     */
//    public void setOpTime(Date opTime) {
//        this.opTime = opTime;
//    }
//
//    /**
//     * 获取此记录说明
//     *
//     * @return comment - 此记录说明
//     */
//    public String getComment() {
//        return comment;
//    }
//
//    /**
//     * 设置此记录说明
//     *
//     * @param comment 此记录说明
//     */
//    public void setComment(String comment) {
//        this.comment = comment == null ? null : comment.trim();
//    }
//
//    /**
//     * 获取单价
//     *
//     * @return unit - 单价
//     */
//    public String getUnit() {
//        return unit;
//    }
//
//    /**
//     * 设置单价
//     *
//     * @param unit 单价
//     */
//    public void setUnit(String unit) {
//        this.unit = unit == null ? null : unit.trim();
//    }
//
//    /**
//     * 获取 数据中心ID
//     *
//     * @return fac_id -  数据中心ID
//     */
//    public Integer getFacId() {
//        return facId;
//    }
//
//    /**
//     * 设置 数据中心ID
//     *
//     * @param facId  数据中心ID
//     */
//    public void setFacId(Integer facId) {
//        this.facId = facId;
//    }
//
//    /**
//     * 获取是否订阅
//     *
//     * @return is_subscribe - 是否订阅
//     */
//    public Integer getIsSubscribe() {
//        return isSubscribe;
//    }
//
//    /**
//     * 设置是否订阅
//     *
//     * @param isSubscribe 是否订阅
//     */
//    public void setIsSubscribe(Integer isSubscribe) {
//        this.isSubscribe = isSubscribe;
//    }
//
//    /**
//     * @return pw_list_id
//     */
//    public Integer getPwListId() {
//        return pwListId;
//    }
//
//    /**
//     * @param pwListId
//     */
//    public void setPwListId(Integer pwListId) {
//        this.pwListId = pwListId;
//    }
//
//    /**
//     * 获取1:未损坏,2:已损坏
//     *
//     * @return devices_destroy - 1:未损坏,2:已损坏
//     */
//    public Integer getDevicesDestroy() {
//        return devicesDestroy;
//    }
//
//    /**
//     * 设置1:未损坏,2:已损坏
//     *
//     * @param devicesDestroy 1:未损坏,2:已损坏
//     */
//    public void setDevicesDestroy(Integer devicesDestroy) {
//        this.devicesDestroy = devicesDestroy;
//    }
//
//    /**
//     * 获取同步版本号
//     *
//     * @return sync_version - 同步版本号
//     */
//    public Integer getSyncVersion() {
//        return syncVersion;
//    }
//
//    /**
//     * 设置同步版本号
//     *
//     * @param syncVersion 同步版本号
//     */
//    public void setSyncVersion(Integer syncVersion) {
//        this.syncVersion = syncVersion;
//    }
//
//    /**
//     * 获取朝向 1-Front to back, 2-Back to front, 3-Left to right, 4-Right to left, 5-Up to down, 6-Down to up
//     *
//     * @return fan_direction - 朝向 1-Front to back, 2-Back to front, 3-Left to right, 4-Right to left, 5-Up to down, 6-Down to up
//     */
//    public Integer getFanDirection() {
//        return fanDirection;
//    }
//
//    /**
//     * 设置朝向 1-Front to back, 2-Back to front, 3-Left to right, 4-Right to left, 5-Up to down, 6-Down to up
//     *
//     * @param fanDirection 朝向 1-Front to back, 2-Back to front, 3-Left to right, 4-Right to left, 5-Up to down, 6-Down to up
//     */
//    public void setFanDirection(Integer fanDirection) {
//        this.fanDirection = fanDirection;
//    }
//
//    /**
//     * 获取是否保留，1-是，0-否
//     *
//     * @return reserved - 是否保留，1-是，0-否
//     */
//    public Integer getReserved() {
//        return reserved;
//    }
//
//    /**
//     * 设置是否保留，1-是，0-否
//     *
//     * @param reserved 是否保留，1-是，0-否
//     */
//    public void setReserved(Integer reserved) {
//        this.reserved = reserved;
//    }
//
//    /**
//     * 获取是否堆叠设备，1-是，0-否
//     *
//     * @return stacked - 是否堆叠设备，1-是，0-否
//     */
//    public Integer getStacked() {
//        return stacked;
//    }
//
//    /**
//     * 设置是否堆叠设备，1-是，0-否
//     *
//     * @param stacked 是否堆叠设备，1-是，0-否
//     */
//    public void setStacked(Integer stacked) {
//        this.stacked = stacked;
//    }
//
//    /**
//     * 获取堆叠编号
//     *
//     * @return stack_index - 堆叠编号
//     */
//    public Integer getStackIndex() {
//        return stackIndex;
//    }
//
//    /**
//     * 设置堆叠编号
//     *
//     * @param stackIndex 堆叠编号
//     */
//    public void setStackIndex(Integer stackIndex) {
//        this.stackIndex = stackIndex;
//    }
//
//    /**
//     * 获取堆叠设备的主键id
//     *
//     * @return stack_dev_id - 堆叠设备的主键id
//     */
//    public Integer getStackDevId() {
//        return stackDevId;
//    }
//
//    /**
//     * 设置堆叠设备的主键id
//     *
//     * @param stackDevId 堆叠设备的主键id
//     */
//    public void setStackDevId(Integer stackDevId) {
//        this.stackDevId = stackDevId;
//    }
//
//    /**
//     * 获取关联resource_device_type 表主键
//     *
//     * @return oss3_dev_type_id - 关联resource_device_type 表主键
//     */
//    public Integer getOss3DevTypeId() {
//        return oss3DevTypeId;
//    }
//
//    /**
//     * 设置关联resource_device_type 表主键
//     *
//     * @param oss3DevTypeId 关联resource_device_type 表主键
//     */
//    public void setOss3DevTypeId(Integer oss3DevTypeId) {
//        this.oss3DevTypeId = oss3DevTypeId;
//    }
//
//    /**
//     * @return metadata
//     */
//    public String getMetadata() {
//        return metadata;
//    }
//
//    /**
//     * @param metadata
//     */
//    public void setMetadata(String metadata) {
//        this.metadata = metadata == null ? null : metadata.trim();
//    }
//
//    /**
//     * @return custom_info
//     */
//    public String getCustomInfo() {
//        return customInfo;
//    }
//
//    /**
//     * @param customInfo
//     */
//    public void setCustomInfo(String customInfo) {
//        this.customInfo = customInfo == null ? null : customInfo.trim();
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", devId=").append(devId);
//        sb.append(", parent=").append(parent);
//        sb.append(", typeId=").append(typeId);
//        sb.append(", status=").append(status);
//        sb.append(", clientId=").append(clientId);
//        sb.append(", serviceId=").append(serviceId);
//        sb.append(", owner=").append(owner);
//        sb.append(", ownerType=").append(ownerType);
//        sb.append(", clientOwned=").append(clientOwned);
//        sb.append(", base=").append(base);
//        sb.append(", devDesc=").append(devDesc);
//        sb.append(", canParent=").append(canParent);
//        sb.append(", label=").append(label);
//        sb.append(", rackId=").append(rackId);
//        sb.append(", rackPos=").append(rackPos);
//        sb.append(", rackMountOrientation=").append(rackMountOrientation);
//        sb.append(", rackUnits=").append(rackUnits);
//        sb.append(", height=").append(height);
//        sb.append(", width=").append(width);
//        sb.append(", depth=").append(depth);
//        sb.append(", frontImageFileId=").append(frontImageFileId);
//        sb.append(", backImageFileId=").append(backImageFileId);
//        sb.append(", monTotal=").append(monTotal);
//        sb.append(", monUp=").append(monUp);
//        sb.append(", monDown=").append(monDown);
//        sb.append(", monDisabled=").append(monDisabled);
//        sb.append(", monWarn=").append(monWarn);
//        sb.append(", powerStatus=").append(powerStatus);
//        sb.append(", lastChange=").append(lastChange);
//        sb.append(", lastPoll=").append(lastPoll);
//        sb.append(", connectionNodeTypeId=").append(connectionNodeTypeId);
//        sb.append(", assetNo=").append(assetNo);
//        sb.append(", sn=").append(sn);
//        sb.append(", relateCode=").append(relateCode);
//        sb.append(", relateDetailId=").append(relateDetailId);
//        sb.append(", ownerId=").append(ownerId);
//        sb.append(", ipmiIp=").append(ipmiIp);
//        sb.append(", poolId=").append(poolId);
//        sb.append(", isNni=").append(isNni);
//        sb.append(", createTime=").append(createTime);
//        sb.append(", updateTime=").append(updateTime);
//        sb.append(", price=").append(price);
//        sb.append(", currency=").append(currency);
//        sb.append(", pono=").append(pono);
//        sb.append(", storageId=").append(storageId);
//        sb.append(", instId=").append(instId);
//        sb.append(", operId=").append(operId);
//        sb.append(", opTime=").append(opTime);
//        sb.append(", comment=").append(comment);
//        sb.append(", unit=").append(unit);
//        sb.append(", facId=").append(facId);
//        sb.append(", isSubscribe=").append(isSubscribe);
//        sb.append(", pwListId=").append(pwListId);
//        sb.append(", devicesDestroy=").append(devicesDestroy);
//        sb.append(", syncVersion=").append(syncVersion);
//        sb.append(", fanDirection=").append(fanDirection);
//        sb.append(", reserved=").append(reserved);
//        sb.append(", stacked=").append(stacked);
//        sb.append(", stackIndex=").append(stackIndex);
//        sb.append(", stackDevId=").append(stackDevId);
//        sb.append(", oss3DevTypeId=").append(oss3DevTypeId);
//        sb.append(", metadata=").append(metadata);
//        sb.append(", customInfo=").append(customInfo);
//        sb.append("]");
//        return sb.toString();
//    }
//
//    @Override
//    public boolean equals(Object that) {
//        if (this == that) {
//            return true;
//        }
//        if (that == null) {
//            return false;
//        }
//        if (getClass() != that.getClass()) {
//            return false;
//        }
//        DeviceDO other = (DeviceDO) that;
//        return (this.getDevId() == null ? other.getDevId() == null : this.getDevId().equals(other.getDevId()))
//                && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
//                && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
//                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
//                && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
//                && (this.getServiceId() == null ? other.getServiceId() == null : this.getServiceId().equals(other.getServiceId()))
//                && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
//                && (this.getOwnerType() == null ? other.getOwnerType() == null : this.getOwnerType().equals(other.getOwnerType()))
//                && (this.getClientOwned() == null ? other.getClientOwned() == null : this.getClientOwned().equals(other.getClientOwned()))
//                && (this.getBase() == null ? other.getBase() == null : this.getBase().equals(other.getBase()))
//                && (this.getDevDesc() == null ? other.getDevDesc() == null : this.getDevDesc().equals(other.getDevDesc()))
//                && (this.getCanParent() == null ? other.getCanParent() == null : this.getCanParent().equals(other.getCanParent()))
//                && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
//                && (this.getRackId() == null ? other.getRackId() == null : this.getRackId().equals(other.getRackId()))
//                && (this.getRackPos() == null ? other.getRackPos() == null : this.getRackPos().equals(other.getRackPos()))
//                && (this.getRackMountOrientation() == null ? other.getRackMountOrientation() == null : this.getRackMountOrientation().equals(other.getRackMountOrientation()))
//                && (this.getRackUnits() == null ? other.getRackUnits() == null : this.getRackUnits().equals(other.getRackUnits()))
//                && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
//                && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
//                && (this.getDepth() == null ? other.getDepth() == null : this.getDepth().equals(other.getDepth()))
//                && (this.getFrontImageFileId() == null ? other.getFrontImageFileId() == null : this.getFrontImageFileId().equals(other.getFrontImageFileId()))
//                && (this.getBackImageFileId() == null ? other.getBackImageFileId() == null : this.getBackImageFileId().equals(other.getBackImageFileId()))
//                && (this.getMonTotal() == null ? other.getMonTotal() == null : this.getMonTotal().equals(other.getMonTotal()))
//                && (this.getMonUp() == null ? other.getMonUp() == null : this.getMonUp().equals(other.getMonUp()))
//                && (this.getMonDown() == null ? other.getMonDown() == null : this.getMonDown().equals(other.getMonDown()))
//                && (this.getMonDisabled() == null ? other.getMonDisabled() == null : this.getMonDisabled().equals(other.getMonDisabled()))
//                && (this.getMonWarn() == null ? other.getMonWarn() == null : this.getMonWarn().equals(other.getMonWarn()))
//                && (this.getPowerStatus() == null ? other.getPowerStatus() == null : this.getPowerStatus().equals(other.getPowerStatus()))
//                && (this.getLastChange() == null ? other.getLastChange() == null : this.getLastChange().equals(other.getLastChange()))
//                && (this.getLastPoll() == null ? other.getLastPoll() == null : this.getLastPoll().equals(other.getLastPoll()))
//                && (this.getConnectionNodeTypeId() == null ? other.getConnectionNodeTypeId() == null : this.getConnectionNodeTypeId().equals(other.getConnectionNodeTypeId()))
//                && (this.getAssetNo() == null ? other.getAssetNo() == null : this.getAssetNo().equals(other.getAssetNo()))
//                && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
//                && (this.getRelateCode() == null ? other.getRelateCode() == null : this.getRelateCode().equals(other.getRelateCode()))
//                && (this.getRelateDetailId() == null ? other.getRelateDetailId() == null : this.getRelateDetailId().equals(other.getRelateDetailId()))
//                && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
//                && (this.getIpmiIp() == null ? other.getIpmiIp() == null : this.getIpmiIp().equals(other.getIpmiIp()))
//                && (this.getPoolId() == null ? other.getPoolId() == null : this.getPoolId().equals(other.getPoolId()))
//                && (this.getIsNni() == null ? other.getIsNni() == null : this.getIsNni().equals(other.getIsNni()))
//                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
//                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
//                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
//                && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
//                && (this.getPono() == null ? other.getPono() == null : this.getPono().equals(other.getPono()))
//                && (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
//                && (this.getInstId() == null ? other.getInstId() == null : this.getInstId().equals(other.getInstId()))
//                && (this.getOperId() == null ? other.getOperId() == null : this.getOperId().equals(other.getOperId()))
//                && (this.getOpTime() == null ? other.getOpTime() == null : this.getOpTime().equals(other.getOpTime()))
//                && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
//                && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
//                && (this.getFacId() == null ? other.getFacId() == null : this.getFacId().equals(other.getFacId()))
//                && (this.getIsSubscribe() == null ? other.getIsSubscribe() == null : this.getIsSubscribe().equals(other.getIsSubscribe()))
//                && (this.getPwListId() == null ? other.getPwListId() == null : this.getPwListId().equals(other.getPwListId()))
//                && (this.getDevicesDestroy() == null ? other.getDevicesDestroy() == null : this.getDevicesDestroy().equals(other.getDevicesDestroy()))
//                && (this.getSyncVersion() == null ? other.getSyncVersion() == null : this.getSyncVersion().equals(other.getSyncVersion()))
//                && (this.getFanDirection() == null ? other.getFanDirection() == null : this.getFanDirection().equals(other.getFanDirection()))
//                && (this.getReserved() == null ? other.getReserved() == null : this.getReserved().equals(other.getReserved()))
//                && (this.getStacked() == null ? other.getStacked() == null : this.getStacked().equals(other.getStacked()))
//                && (this.getStackIndex() == null ? other.getStackIndex() == null : this.getStackIndex().equals(other.getStackIndex()))
//                && (this.getStackDevId() == null ? other.getStackDevId() == null : this.getStackDevId().equals(other.getStackDevId()))
//                && (this.getOss3DevTypeId() == null ? other.getOss3DevTypeId() == null : this.getOss3DevTypeId().equals(other.getOss3DevTypeId()));
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getDevId() == null) ? 0 : getDevId().hashCode());
//        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
//        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
//        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
//        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
//        result = prime * result + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
//        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
//        result = prime * result + ((getOwnerType() == null) ? 0 : getOwnerType().hashCode());
//        result = prime * result + ((getClientOwned() == null) ? 0 : getClientOwned().hashCode());
//        result = prime * result + ((getBase() == null) ? 0 : getBase().hashCode());
//        result = prime * result + ((getDevDesc() == null) ? 0 : getDevDesc().hashCode());
//        result = prime * result + ((getCanParent() == null) ? 0 : getCanParent().hashCode());
//        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
//        result = prime * result + ((getRackId() == null) ? 0 : getRackId().hashCode());
//        result = prime * result + ((getRackPos() == null) ? 0 : getRackPos().hashCode());
//        result = prime * result + ((getRackMountOrientation() == null) ? 0 : getRackMountOrientation().hashCode());
//        result = prime * result + ((getRackUnits() == null) ? 0 : getRackUnits().hashCode());
//        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
//        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
//        result = prime * result + ((getDepth() == null) ? 0 : getDepth().hashCode());
//        result = prime * result + ((getFrontImageFileId() == null) ? 0 : getFrontImageFileId().hashCode());
//        result = prime * result + ((getBackImageFileId() == null) ? 0 : getBackImageFileId().hashCode());
//        result = prime * result + ((getMonTotal() == null) ? 0 : getMonTotal().hashCode());
//        result = prime * result + ((getMonUp() == null) ? 0 : getMonUp().hashCode());
//        result = prime * result + ((getMonDown() == null) ? 0 : getMonDown().hashCode());
//        result = prime * result + ((getMonDisabled() == null) ? 0 : getMonDisabled().hashCode());
//        result = prime * result + ((getMonWarn() == null) ? 0 : getMonWarn().hashCode());
//        result = prime * result + ((getPowerStatus() == null) ? 0 : getPowerStatus().hashCode());
//        result = prime * result + ((getLastChange() == null) ? 0 : getLastChange().hashCode());
//        result = prime * result + ((getLastPoll() == null) ? 0 : getLastPoll().hashCode());
//        result = prime * result + ((getConnectionNodeTypeId() == null) ? 0 : getConnectionNodeTypeId().hashCode());
//        result = prime * result + ((getAssetNo() == null) ? 0 : getAssetNo().hashCode());
//        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
//        result = prime * result + ((getRelateCode() == null) ? 0 : getRelateCode().hashCode());
//        result = prime * result + ((getRelateDetailId() == null) ? 0 : getRelateDetailId().hashCode());
//        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
//        result = prime * result + ((getIpmiIp() == null) ? 0 : getIpmiIp().hashCode());
//        result = prime * result + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
//        result = prime * result + ((getIsNni() == null) ? 0 : getIsNni().hashCode());
//        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
//        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
//        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
//        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
//        result = prime * result + ((getPono() == null) ? 0 : getPono().hashCode());
//        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
//        result = prime * result + ((getInstId() == null) ? 0 : getInstId().hashCode());
//        result = prime * result + ((getOperId() == null) ? 0 : getOperId().hashCode());
//        result = prime * result + ((getOpTime() == null) ? 0 : getOpTime().hashCode());
//        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
//        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
//        result = prime * result + ((getFacId() == null) ? 0 : getFacId().hashCode());
//        result = prime * result + ((getIsSubscribe() == null) ? 0 : getIsSubscribe().hashCode());
//        result = prime * result + ((getPwListId() == null) ? 0 : getPwListId().hashCode());
//        result = prime * result + ((getDevicesDestroy() == null) ? 0 : getDevicesDestroy().hashCode());
//        result = prime * result + ((getSyncVersion() == null) ? 0 : getSyncVersion().hashCode());
//        result = prime * result + ((getFanDirection() == null) ? 0 : getFanDirection().hashCode());
//        result = prime * result + ((getReserved() == null) ? 0 : getReserved().hashCode());
//        result = prime * result + ((getStacked() == null) ? 0 : getStacked().hashCode());
//        result = prime * result + ((getStackIndex() == null) ? 0 : getStackIndex().hashCode());
//        result = prime * result + ((getStackDevId() == null) ? 0 : getStackDevId().hashCode());
//        result = prime * result + ((getOss3DevTypeId() == null) ? 0 : getOss3DevTypeId().hashCode());
//        return result;
//    }
}
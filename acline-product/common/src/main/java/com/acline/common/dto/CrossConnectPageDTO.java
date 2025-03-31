package com.acline.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "CrossConnectPageDTO", description = "跳线列表 返回值数据")
public class CrossConnectPageDTO {

    @ApiModelProperty(value = "跳线主键id", example = "1")
    private Integer id;
    @ApiModelProperty(value = "A端数据中心id", example = "0")
    private Integer aFacId;
    @ApiModelProperty("A端数据中心名称")
    private String  aFacName;

    @ApiModelProperty(value = "A端设备id", example = "0")
    private Integer aDeviceId;
    @ApiModelProperty("A端设备名称")
    private String  aDeviceName;

    @ApiModelProperty(value = "A端端口id", example = "0")
    private Integer aPortId;
    @ApiModelProperty("A端端口名称")
    private String  aPortName;

    @ApiModelProperty(value = "A端设备id", example = "1", name = "aSideDeviceId")
//    @JsonProperty("aSideDeviceId")
    private Integer aSideDeviceId;

    @ApiModelProperty("A端设备名称")
//    @JsonProperty("aSideDeviceName")
    private String aSideDeviceName;

    @ApiModelProperty(value = "A端端口id", example = "1")
//    @JsonProperty("aSidePortId")
    private Integer aSidePortId;

    @ApiModelProperty("A端端口名称")
//    @JsonProperty("aSidePortName")
    private String aSidePortName;

    @ApiModelProperty(value = "A端端口类型", example = "0")
    private String aPortTypeCode;
    @ApiModelProperty("A端端口类型名称")
    private String  aPortTypeName;

    @ApiModelProperty(value = "Z端数据中心id", example = "0")
    private Integer zFacId;
    @ApiModelProperty("Z端数据中心名称")
    private String  zFacName;

    @ApiModelProperty(value = "Z端设备id", example = "0")
    private Integer zDeviceId;
    @ApiModelProperty("Z端设备名称")
    private String  zDeviceName;

    @ApiModelProperty(value = "Z端端口id", example = "0")
    private Integer zPortId;
    @ApiModelProperty("Z端端口名称")
    private String  zPortName;

    @ApiModelProperty(value = "Z端设备id", example = "1", name = "aSideDeviceId")
//    @JsonProperty("zSideDeviceId")
    private Integer zSideDeviceId;

    @ApiModelProperty("Z端设备名称")
//    @JsonProperty("zSideDeviceName")
    private String zSideDeviceName;

    @ApiModelProperty(value = "Z端端口id", example = "1")
//    @JsonProperty("zSidePortId")
    private Integer zSidePortId;

    @ApiModelProperty("Z端端口名称")
//    @JsonProperty("zSidePortName")
    private String zSidePortName;

    @ApiModelProperty(value = "Z端端口类型", example = "0")
    private String zPortTypeCode;
    @ApiModelProperty("Z端端口类型名称")
    private String  zPortTypeName;

    @ApiModelProperty("Zenlayer 资源编号")
    private String  zenResNo;
    @ApiModelProperty("Vendor 资源编号")
    private String  vendorResNo;
    @ApiModelProperty("合同编号 Business Resource ID")
    private String  contractNo;
    @ApiModelProperty(value = "供应商id", example = "0")
    private Integer vendorId;
    @ApiModelProperty("供应商名称")
    private String  vendorName;
    @ApiModelProperty(value = "归属类型 0:Direct line-层峰 1:  Lease line-供应商", example = "0")
    private Integer  type;
    @ApiModelProperty(value = "来源0-页面新增，1-PW流程新增", example = "1")
    private Integer  source;

    /**
     * 状态 0:pre-purchase 1:active 2: in use 3: inactive
     */
    @ApiModelProperty("状态 0:pre-purchase 1:active 2: in use 3: inactive")
    private Integer status;

    @ApiModelProperty(value = "关联的PrivateLine A端设备id", example = "0")
    private Integer deviceIdApl;
    @ApiModelProperty("关联的PrivateLin A端设备名称")
    private String  deviceNameApl;

    @ApiModelProperty(value = "关联的PrivateLine A端端口id", example = "0")
    private Integer portIdApl;
    @ApiModelProperty("关联的PrivateLine A端端口名称")
    private String  portNameApl;

    @ApiModelProperty(value = "关联的PrivateLine Z端设备id", example = "0")
    private Integer deviceIdZpl;
    @ApiModelProperty("关联的PrivateLine Z端设备名称")
    private String  deviceNameZpl;

    @ApiModelProperty(value = "关联的PrivateLine Z端端口id", example = "0")
    private Integer portIdZpl;
    @ApiModelProperty("关联的PrivateLine Z端端口名称")
    private String  portNameZpl;

    @ApiModelProperty("流程状态")
    private Integer instanceStatus;
}

package com.zenlayer.oss.common.query.oss;

import com.zenlayer.oss.sdk.baseline.common.CommonSelectQO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liuwei
 * @description
 * @version $ Id: DevicesQueryRO.java, v 0.1 2020-11-30 19:04:41 liuwei Exp $
 */
@Data
@ApiModel(description = "设备列表筛选参数")
public class DevicesQueryQO extends CommonSelectQO {

    @ApiModelProperty("大类id")
    private Integer categoryId;

    @ApiModelProperty("型号id")
    private Integer typeId;

    @ApiModelProperty("3.0 型号id")
    private Integer oss3DevTypeId;

    @ApiModelProperty("采购类型 0: 买 1: 租")
    private Integer purchaseType;

    @ApiModelProperty("所属者id")
    private Integer owner;

    @ApiModelProperty("客户id")
    private Integer clientId;

    @ApiModelProperty("设备状态 ")
    private Integer status;

    /**
     * 是否保留，1-是，0-否
     */
    @ApiModelProperty("是否保留，1-是，0-否")
    private Integer reserved;

    @ApiModelProperty("机房id")
    private Integer facId;
    @ApiModelProperty("设备报废流程： 1。其他查询不需要参数")
    private  Integer queryType;
    @ApiModelProperty("设备ID List")
    private List<Integer> deviceIds;
    @ApiModelProperty("设备SN List")
    private List<String> snList;
    @ApiModelProperty("设备Name List")
    private List<String> nameList;
    @ApiModelProperty("pda搜索使用")
    private String pdaSearchValue;
    @ApiModelProperty("storageID")
    private Integer storageId;

    @ApiModelProperty("内部工单号")
    private String instanceCode;
    @ApiModelProperty("设备ID")
    private Integer devId;
    @ApiModelProperty("设备rfid")
    private String rfidNo;
    @ApiModelProperty("设备SN")
    private String sn;
    @ApiModelProperty("设备状态集合")
    private List<Integer> statusList;
    @ApiModelProperty("所属者id")
    private List<Integer> owners;
    @ApiModelProperty("2.0 型号id")
    private List<Integer> typeIds;


}

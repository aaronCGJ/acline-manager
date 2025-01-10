package com.zenlayer.oss.web.oss.device.request;

import com.zenlayer.oss.sdk.baseline.common.CommonQueryRO;
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
public class DevicesQueryRO extends CommonQueryRO {

    @ApiModelProperty("大类id, 数据来自tb_device_catalog 表")
    private Integer categoryId;

    @ApiModelProperty("2.0 型号id")
    private Integer typeId;

    @ApiModelProperty("3.0 型号id")
    private Integer oss3DevTypeId;

    @ApiModelProperty("采购类型 0: 买 1: 租")
    private Integer purchaseType;

    @ApiModelProperty("所属者id")
    private Integer owner;

    @ApiModelProperty("客户id")
    private Integer clientId;

    @ApiModelProperty("设备状态 0-下架，1-空闲，2-仓库，3-使用中，4-预占，8-待激活，9-采购中，11-取消中，12-在途，13-维修，14-POC测试")
    private Integer status;

    @ApiModelProperty("机房id")
    private Integer facId;
    @ApiModelProperty("设备报废流程： 1。其他查询不需要参数")
    private  Integer queryType;
    @ApiModelProperty("pda搜索使用")
    private String pdaSearchValue;
    @ApiModelProperty("仓库ID")
    private Integer storageId;
    @ApiModelProperty("内部工单号")
    private String instanceCode;
    @ApiModelProperty("设备rfid")
    private String rfidNo;
    @ApiModelProperty("设备状态集合")
    private List<Integer> statusList;
    @ApiModelProperty("所属者id")
    private List<Integer> owners;
    @ApiModelProperty("2.0 型号id")
    private List<Integer> typeIds;


}

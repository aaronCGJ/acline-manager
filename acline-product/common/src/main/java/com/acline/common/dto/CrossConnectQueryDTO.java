package com.acline.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author liuwei
 * @description
 * @version $ Id: CrossConnectQueryRequest.java, v 0.1 2019-12-23 19:15:14 liuwei Exp $
 */
@Data
@ApiModel(value = "CrossConnectQueryDTO", description = "跳线资源查询请求参数")
public class CrossConnectQueryDTO{

    @ApiModelProperty("id(供专线选择跳线的时候排除自己)")
    private Integer privateLineId;

    @ApiModelProperty("账单开始时间")
    private Date startBillingDate;

    @ApiModelProperty("账单结束时间")
    private Date endBillingDate;

    @ApiModelProperty(value = "数据中心id", example = "0")
    private Integer facId;

    @ApiModelProperty(value = "供应商id", example = "0")
    private Integer vendorId;

    @ApiModelProperty(value = "采购类型 0-买，1-租", example = "0")
    private Integer purchaseType;

    @ApiModelProperty(value = "设备id", example = "0")
    private Integer deviceId;

    /**
     * 状态 0:pre-purchase 1:active 2: in use 3: inactive
     */
    private List<Integer> status;

    @ApiModelProperty(value = "跳线主键id集合")
    private List<Integer> ids;

    private List<String> orderByClauses;

    @ApiModelProperty(value = "绑定PW标识 不传则所有 0:未绑定 1：已绑定")
    private Integer bindPwFlag;

    @ApiModelProperty(value = "PW关联的PO号,在PW资源录入节点为必传")
    private String purchaseQuoteOrderNo;

    @ApiModelProperty(value = "vendorResourceNo")
    private String vendorResourceNo;
    private Integer pageNum;
    private Integer pageSize;
}

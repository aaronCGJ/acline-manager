package com.acline.web.circuit.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @author liuwei
 * @description
 * @version $ Id: CrossConnectQueryRequest.java, v 0.1 2019-12-23 19:15:14 liuwei Exp $
 */
@Data
@ApiModel(value = "CrossConnectQueryRequest", description = "跳线资源查询请求参数")
public class CrossConnectQueryRequest  {

    @ApiModelProperty(value = "账单开始时间",example = "2019-01-01")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startBillingDate;

    @ApiModelProperty(value = "账单结束时间", example = "2019-01-02")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endBillingDate;

    @ApiModelProperty(value = "数据中心id", example = "0")
    private Integer facId;

    @ApiModelProperty(value = "供应商id", example = "0")
    private Integer vendorId;

    @ApiModelProperty(value = "采购类型 0-买，1-租", example = "0")
    @Range(min = 0, max = 1, message = "purchaseType.is.illegal")
    private Integer purchaseType;

    @ApiModelProperty(value = "设备id", example = "0")
    private Integer deviceId;

    @ApiModelProperty(value = "状态 0:pre-purchase 1:active 2: in use 3: inactive", example = "0")
    private String status;

    @ApiModelProperty(value = "跳线主键id集合")
    private List<Integer> ids;

    @ApiModelProperty(value = "绑定PW标识 不传则所有 0:未绑定 1：已绑定")
    private Integer bindPwFlag;

    @ApiModelProperty(value = "PW关联的PO号,在PW资源录入节点为必传")
    private String purchaseQuoteOrderNo;

    @ApiModelProperty(value = "专线ID(供专线选择跳线的时候排除自己)")
    private  Integer privateLineId;

    @ApiModelProperty(value = "vendorResourceNo")
    private String vendorResourceNo;
    private Integer pageNum;
    private Integer pageSize;

}

package com.acline.core.http.response;

import lombok.Data;

/**
 * @author Aaron Chen
 * @date：2025/3/28
 * @Description:
 * @Version 1.0
 */
@Data
public class BssCommonResponse {
    private String code;
    private Integer ret;
    private  String msg;
    private boolean success ;
    private String msgEn;
}

package com.acline.core.http.response;

import lombok.Data;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2025/3/28
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class BssNewInstanceResponse extends BssCommonResponse{
    private List<DataResponse> data;


}

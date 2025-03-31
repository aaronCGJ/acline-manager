package com.acline.core.http;

import com.acline.core.http.response.BssNewInstanceResponse;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.DataVariable;
import com.dtflys.forest.annotation.Get;

@BaseRequest(baseURL ="${ossUrl}",timeout = 30000)
public interface OssHttp {
    @Get("/webthird_api/ltcInstance/searchInstances?searchValue=${searchValue}")
    BssNewInstanceResponse queryBssNewInstance(@DataVariable ("searchValue") String searchValue);
}

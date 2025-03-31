package com.acline.utils;


import com.acline.core.http.OssHttp;
import com.acline.core.http.response.BssNewInstanceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OssHttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(OssHttpUtil.class);
    @Autowired
    private OssHttp ossHttp ;

    public BssNewInstanceResponse queryBssNewInstance(String searchValue){

        try {
            BssNewInstanceResponse bssNewInstanceResponse = ossHttp.queryBssNewInstance(searchValue);
            return bssNewInstanceResponse;
        } catch (Exception e) {
            logger.error("queryBssNewInstance error", e);
            BssNewInstanceResponse bssNewInstanceResponse = new BssNewInstanceResponse();
            bssNewInstanceResponse.setSuccess(false);
            return bssNewInstanceResponse;
        }
    }





}

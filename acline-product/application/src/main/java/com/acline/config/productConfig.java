package com.acline.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aaron Chen
 * @date：2025/3/31
 * @Description:TODO
 * @Version 1.0
 */
//@Configuration
public class productConfig {
//    @Bean
    public HttpMessageConverters customConverters() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        fastJsonHttpMessageConverter.getFastJsonConfig().setSerializerFeatures(SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
        return new HttpMessageConverters(fastJsonHttpMessageConverter);
    }
}

package com.acline.common.webchart;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.platform.commons.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Aaron Chen
 * description:用于资源异常通知
 */
public class ExceptionMessageSender {
    public static final Logger logger = LoggerFactory.getLogger(ExceptionMessageSender.class);

    public static String postMessage2WeChatWork(String webhookURL, String message) {
        if (StringUtils.isBlank(message)) {
            return "{\"success\":false}";
        }
        InetAddress address = null;
        String hostAddress = "";
        try {
            address = InetAddress.getLocalHost();
            hostAddress = address.getHostAddress();
        } catch (UnknownHostException e) {
            logger.info("主机获取失败:{}", e.getMessage());
        }
        message += hostAddress;
        WechatWorkMessage wechatWorkMessage = new WechatWorkMessage(message, true);
        String body = JSON.toJSONString(wechatWorkMessage);
        return postMessage(webhookURL, body);
    }

    public static String postMessage(String webhookUrl, String body) {
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpPost httpPost = new HttpPost(webhookUrl);
            StringEntity stringEntity = new StringEntity(body, "UTF-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    try {
                        result = EntityUtils.toString(resEntity, "UTF-8");
                    } finally {
                        EntityUtils.consume(resEntity);
                    }
                }
            }
        } catch (Exception e) {
            logger.info("postMessage:{}", e.getMessage());
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                logger.info("httpClient:{}", e.getMessage());
            }
        }

        return result;
    }

}

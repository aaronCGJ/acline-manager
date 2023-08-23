package com.acline.web.kafka;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author Aaron Chen
 * @date：2023/8/24
 * @Description:kafuka 监听
 * @Version
 */
public class KafkaConsumer {
    @KafkaListener(topics = "my_topic") // 监听名为“my_topic”的topic
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

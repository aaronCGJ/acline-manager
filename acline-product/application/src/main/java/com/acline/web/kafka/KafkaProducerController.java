package com.acline.web.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron Chen
 * @date：2023/8/24
 * @Description:kafka生产者
 * @Version
 */
@RestController
@RequestMapping(value = "kafka")
public class KafkaProducerController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestParam String message) {
        kafkaTemplate.send("my_topic", message); // 发送消息到名为“my_topic”的topic
    }
}

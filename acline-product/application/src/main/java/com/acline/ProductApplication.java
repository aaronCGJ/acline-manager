package com.acline;
/**
 * @author Aaron Chen
 * @date：2022/11/16 14:00
 * @Description:TODO
 * @Version 1.0
 */

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Aaron Chen
 * @date：2022/11/16 14:00
 * @Description:TODO
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.acline"})
@ForestScan(basePackages = "com.acline.core.http")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}

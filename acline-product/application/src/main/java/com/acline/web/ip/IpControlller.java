package com.acline.web.ip;/**
 * @author Aaron Chen
 * @date：2022/11/16 14:27
 * @Description:TODO
 * @Version 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron Chen
 * @date：2022/11/16 14:27
 * @Description:TODO
 */
@RestController
@RequestMapping(value = "ip")
public class IpControlller {
    @RequestMapping("/ipTest")
    public String ipTest() {
        return "this is ip controller| enjoy!";
    }
}

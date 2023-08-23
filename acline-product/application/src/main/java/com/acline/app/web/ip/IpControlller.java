package com.acline.app.web.ip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ip")
public class IpControlller {
    @RequestMapping("/ipTest")
    public String ipTest() {
        return "this is ip controller| enjoy!";
    }
}

package com.acline.web.test;/**
 * @author Aaron Chen
 * @date：2022/11/16 14:15
 * @Description:TODO
 * @Version 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron Chen
 * @date：2022/11/16 14:15
 * @Description:TODO
 */
@RestController
@RequestMapping(value = "test")
public class TestController {
    @RequestMapping("/testOne")
    public String testOne() {
        return "hellp doctor!\nwelcome acline!\n enjoy it!!";
    }

}

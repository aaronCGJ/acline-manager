package com.acline.web.test;
/**
 * @author Aaron Chen
 * @date：2022/11/16 14:15
 * @Description:TODO
 * @Version 1.0
 */

import com.acline.common.dto.TestDateDTO;
import com.acline.web.test.request.TestRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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

    Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/testOne")
    public String testOne() {
        return "hellp doctor!\nwelcome acline!\n enjoy it!!";
    }
    @RequestMapping("/testDate")
    public void testDate(TestRequest testRequest) {
        TestDateDTO testDateDTO = new TestDateDTO();
        BeanUtils.copyProperties(testRequest,testDateDTO);
        logger.info("{}", testDateDTO);

    }

}

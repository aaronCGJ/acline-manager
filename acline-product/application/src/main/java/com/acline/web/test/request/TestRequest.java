package com.acline.web.test.request;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Aaron Chen
 * @date：2025/3/20
 * @Description:TODO
 * @Version 1.0
 */
@Data
public class TestRequest {
    private String testDate;
    private Date testDate2;

    public void setTestDate2(String testDate2) {
        this.testDate2 = DateUtil.parse(testDate2,"yyyy-MM");
    }

}

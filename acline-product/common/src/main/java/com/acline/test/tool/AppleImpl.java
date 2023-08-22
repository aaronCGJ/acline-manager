package com.acline.test.tool;/**
 * @author Aaron Chen
 * @date：2023/3/14 14:17
 * @Description:TODO
 * @Version 1.0
 */

import java.math.BigDecimal;

/**
 * @author Aaron Chen
 * @date：2023/3/14 14:17
 * @Description:TODO
 */
public class AppleImpl extends ProductParentBiz {
    @Override
    public String productName() {
        return "apple";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(4.556);
    }

    @Override
    public String Vendor() {
        return "六安扛把子";
    }

    @Override
    int storageCount() {
        return 101;
    }

    @Override
    String location() {
        return "六安东洋人";
    }
}

package com.acline.common.test.tool;/**
 * @author Aaron Chen
 * @date：2023/3/14 13:56
 * @Description:TODO
 * @Version 1.0
 */

import java.math.BigDecimal;

/**
 * @author Aaron Chen
 * @date：2023/3/14 13:56
 * @Description:TODO
 */
public class DrinkImpl extends ProductParentBiz {
    @Override
    public String productName() {
        return "饮料";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(10);
    }

    @Override
    public String Vendor() {
        return "上海层峰";
    }

    @Override
    int storageCount() {
        return 100;
    }

    @Override
    String location() {
        return "上海";
    }


}

package com.acline.test.tool;/**
 * @author Aaron Chen
 * @date：2023/3/14 14:18
 * @Description:TODO
 * @Version 1.0
 */

import java.math.BigDecimal;

/**
 * @author Aaron Chen
 * @date：2023/3/14 14:18
 * @Description:TODO
 */
public class JiuShenImpl extends ProductParentBiz {
    @Override
    public String productName() {
        return "迎驾贡酒";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(10000);
    }

    @Override
    public String Vendor() {
        return "木厂金福来斧头帮";
    }

    @Override
    int storageCount() {
        return 1111;
    }

    @Override
    String location() {
        return "六安木厂";
    }
}

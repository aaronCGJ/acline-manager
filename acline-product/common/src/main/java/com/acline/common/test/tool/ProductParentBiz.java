package com.acline.common.test.tool;/**
 * @author Aaron Chen
 * @date：2023/3/14 13:55
 * @Description:TODO
 * @Version 1.0
 */

/**
 * @author Aaron Chen
 */
abstract class ProductParentBiz implements ProductParent {

    abstract int storageCount();

    abstract String location();

    protected String salesMan() {
        return "aaron.chen";
    }
}

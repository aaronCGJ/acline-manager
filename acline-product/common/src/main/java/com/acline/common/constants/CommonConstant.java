package com.acline.common.constants;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
public class CommonConstant {


    //分割字符串-逗号
    public static final String SPLIT_STR_FOR_COMMA = ",";

    public static final String user_SCHEMA = "user";

    public static final String RESOURCE_SCHEMA = "product";
    /**
     * @Description //SQl 头部标识
     **/
    public static final String SQL_LABLE = "Lable";
    /**
     * @Description //SQl 主干标识
     **/
    public static final String SQL_BACNKBONE = "BackBone";
    /**
     * @Description //SQl 条件
     **/
    public static final String SQL_CONDITION = "Condition";

    public static final String LABEL = "label";

    /**
     * 年-月-日 时:分:秒  日期格式化
     */
    public static final String DATETIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String UTC_WITH_ZONE_OFFSET_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";


    /**
     * 年-月-日  日期格式化
     */
    public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";

    /**
     * 年-月-日  日期格式化
     */
    public static final String DATE_FORMAT_PATTERN_ZN = "yyyy年MM月dd日";

    /**
     * 月 日 年  日期格式化
     */
    public static final String DATE_FORMAT_PATTERN_US = "MMM dd yyyy";

    /**
     * 东八区 时区设置
     */
    public static final String TIMEZONE_GMT_8 = "GMT+8";

    /**
     * 邮件
     */
    public static final String MAIL_RECEIVER_ON_TEST
            = "ling.chen@zenlayer.com,nevaeh.zhao@zenlayer.com,gary.guo@zenlayer.com,mona.zhang@zenlayer.com";

    public static final String MAIL_RECEIVER_ON_DEV = "wei.liu@zenlayer.com,Gavin.ye@zenlayer.com";

    public static final Integer DEFAULT_BATCH_GET_LIMIT = 1000;

    public static final Integer DEFAULT_MYSQL_IN_LIMIT = 20;
}

/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.acline.common.utils;

/**
 * 持久化工具
 * @author wanghui
 * @date 2019-12-26 15:36:39
 * @version $ Id: RespositoryUtil.java, v 0.1  wanghui Exp $
 */
public abstract class RepositoryUtil {

    private static final String LIKE_QUERY = "%";

    /**
     * 字段模糊查询处理
     * @date 2019/12/26
     */
    public static String concatLikeQuery(String fieldValue) {
        return "%" + fieldValue + "%";
    }

}

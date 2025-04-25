/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2020 All Rights Reserved.
 */
package com.acline.common.dto.dic;

import lombok.Data;

/**
 * @author wanghui
 * @date 2019-12-26 14:08:22
 * @version $ Id: DicConfigDTO.java, v 0.1  wanghui Exp $
 */
@Data
public class DicConfigDTO  {

    private static final long serialVersionUID = -2522028595115446992L;

    private String parentCode;

    private String code;

    private String nameEn;

    private String nameZh;
}

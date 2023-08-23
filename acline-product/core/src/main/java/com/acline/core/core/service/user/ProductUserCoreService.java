package com.acline.core.core.service.user;

import com.acline.common.dal.dataobject.ProductUserDO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
public interface ProductUserCoreService {
    List<ProductUserDO> selectUserList();
}

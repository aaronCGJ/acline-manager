package com.acline.common.dal.dao.user;

import com.acline.common.dal.base.basedao.BaseDAO;
import com.acline.common.dal.dataobject.ProductUserDO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
public interface ProductUserDao extends BaseDAO<ProductUserDO> {
     List<ProductUserDO> selectUserList();
}

package com.acline.common.dal.dao.impl;

import com.acline.common.dal.base.basedao.impl.BaseDAOImpl;
import com.acline.common.dal.dao.user.ProductUserDao;
import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dal.mapper.ProductUserDOMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
@Repository
public class ProductUserDaoImpl extends BaseDAOImpl<ProductUserDO, ProductUserDOMapper> implements ProductUserDao {


    public List<ProductUserDO> selectUserList() {
        return getMapper().selectUserList();
    }

    @Override
    public boolean delete(ProductUserDO productUserDO) {
        return false;
    }

    @Override
    protected List<String> getDOQueryColumns() {
        return null;
    }
}

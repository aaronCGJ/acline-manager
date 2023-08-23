package com.acline.common.dal.dao.impl;

import com.acline.common.dal.dao.user.ProductUserDao;
import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dal.mapper.ProductUserDOMapper;
import com.acline.common.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
@Repository
public class ProductUserDaoImpl
//        extends BaseDAOImpl<ProductUserDO, ProductUserDOMapper>
        implements ProductUserDao {

    @Autowired
    ProductUserDOMapper productUserDOMapper;

    public List<ProductUserDO> selectUserList() {
        return productUserDOMapper.selectUserList();
    }

    @Override
    public boolean updateUser(UserDTO dto) {
        return productUserDOMapper.updateUser(dto);
    }

//    @Override
//    public boolean delete(ProductUserDO productUserDO) {
//        return false;
//    }
//
//    @Override
//    protected List<String> getDOQueryColumns() {
//        return null;
//    }
}

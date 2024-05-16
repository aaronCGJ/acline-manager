package com.acline.core.service.impl;

import com.acline.common.dal.dao.user.ProductUserDao;
import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dto.UserDTO;
import com.acline.core.poi.UserPoi;
import com.acline.core.service.user.ProductUserCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version 1.0
 */
@Service
public class ProductUserCoreServiceImpl implements ProductUserCoreService {

    @Autowired
    private ProductUserDao productUserDao;
    @UserPoi()
    @Override
    public List<ProductUserDO> selectUserList(UserDTO dto) {
//        int result=9/0;
        return productUserDao.selectUserList();
    }

    public boolean updateUser(UserDTO dto) {
        return productUserDao.updateUser(dto);
    }
}

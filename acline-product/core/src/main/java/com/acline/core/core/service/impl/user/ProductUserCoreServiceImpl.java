package com.acline.core.core.service.impl.user;

import com.acline.common.dal.dao.user.ProductUserDao;
import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.core.core.service.user.ProductUserCoreService;
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

    @Override
    public List<ProductUserDO> selectUserList() {
        return productUserDao.selectUserList();
    }
}

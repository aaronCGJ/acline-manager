package com.acline.common.dal.dao.user;

import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dto.UserDTO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
public interface ProductUserDao
//        extends BaseDAO<ProductUserDO>
{
     List<ProductUserDO> selectUserList();

     boolean updateUser(UserDTO dto);
}

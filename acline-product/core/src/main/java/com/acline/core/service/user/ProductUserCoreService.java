package com.acline.core.service.user;

import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dto.UserDTO;

import java.util.List;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
public interface ProductUserCoreService {
    List<ProductUserDO> selectUserList(UserDTO dto);

    boolean updateUser(UserDTO dto);
}

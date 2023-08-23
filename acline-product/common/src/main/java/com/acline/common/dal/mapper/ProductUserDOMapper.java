package com.acline.common.dal.mapper;

import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dto.UserDTO;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ProductUserDOMapper
//        extends Mapper<ProductUserDO>
{
    List<ProductUserDO> selectUserList();
    @Update({"update product_user set pass_word=#{passWord},user_name=#{userName} where id=#{Id}"})
    boolean updateUser(UserDTO dto);

}
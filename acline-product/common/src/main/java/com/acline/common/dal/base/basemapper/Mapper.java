package com.acline.common.dal.base.basemapper;
/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */

import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.RowBoundsMapper;
import tk.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.delete.DeleteMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;
import tk.mybatis.mapper.common.base.select.*;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeySelectiveMapper;
import tk.mybatis.mapper.common.example.*;

/**
 * @author Aaron Chen
 */
public interface Mapper<T> extends SelectMapper<T>, SelectAllMapper<T>, SelectCountMapper<T>, SelectByPrimaryKeyMapper<T>, ExistsWithPrimaryKeyMapper<T>, InsertSelectiveMapper<T>, UpdateByPrimaryKeyMapper<T>, UpdateByPrimaryKeySelectiveMapper<T>, DeleteMapper<T>, DeleteByPrimaryKeyMapper<T>, SelectByExampleMapper<T>, SelectCountByExampleMapper<T>, DeleteByExampleMapper<T>, UpdateByExampleMapper<T>, UpdateByExampleSelectiveMapper<T>, RowBoundsMapper<T>, Marker {
    @SelectProvider(
            type = MapperProvider.class,
            method = "dynamicSQL"
    )
    T selectOne(T record);

    @SelectProvider(
            type = MapperProvider.class,
            method = "dynamicSQL"
    )
    T selectOneByExample(Object example);
}

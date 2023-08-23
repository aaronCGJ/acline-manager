package com.acline.common.dal.base.basedao;
/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:BaseDAO
 * @Version
 */

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Aaron Chen
 */
public interface BaseDAO<T> {
    List<T> list(String queryValue);

    <E> PageInfo<E> listByPage(String queryValue, int pageNum, int pageSize, Converter<E, T> converter);

    T findById(Integer id);

    boolean insert(T t);

    boolean update(T t);

    boolean delete(T t);
}

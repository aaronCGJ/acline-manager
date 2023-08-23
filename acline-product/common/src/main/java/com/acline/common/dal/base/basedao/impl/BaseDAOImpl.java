package com.acline.common.dal.base.basedao.impl;

import com.acline.common.dal.base.basedao.BaseDAO;
import com.acline.common.dal.base.basedao.Converter;
import com.acline.common.dal.base.basemapper.Mapper;
import com.acline.common.dal.base.util.PageInfoUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
public abstract class BaseDAOImpl<T, D extends Mapper<T>> implements BaseDAO<T> {
    @Autowired
    protected D mapper;

    public BaseDAOImpl() {

    }

    protected Class<T> getDOClass() {
        Class<T> tClass = (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        return tClass;
    }

    protected String getDOIdColumn() {
        return "id";
    }

    protected boolean addWildcard4Query() {
        return true;
    }

    protected abstract List<String> getDOQueryColumns();

    protected D getMapper() {
        return this.mapper;
    }

    public List<T> list(String queryValue) {
        if (StringUtil.isEmpty(queryValue)) {
            return this.mapper.selectAll();
        } else {
            Example example = new Example(this.getDOClass());
            List<String> queryColumns = this.getDOQueryColumns();
            Example.Criteria criteria = example.createCriteria();
            if (queryColumns != null && !queryColumns.isEmpty()) {
                Iterator var5 = queryColumns.iterator();

                while (var5.hasNext()) {
                    String queryColumn = (String) var5.next();
                    criteria.orLike(queryColumn, this.addWildcard4Query() ? String.join("", "%", queryValue, "%") : queryValue);
                }
            }

            return this.mapper.selectByExample(example);
        }
    }

    public <E> PageInfo<E> listByPage(String queryValue, int pageNum, int pageSize, Converter<E, T> converter) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> data = this.list(queryValue);
        PageInfo<T> dataPageInfo = new PageInfo(data);
        Stream var10000 = data.stream();
        converter.getClass();
        List<E> convertedData = (List<E>) var10000.map(data1 -> converter.assemble((T) data1)).collect(Collectors.toList());
        PageInfo<E> convertDataPageInfo = new PageInfo();
        PageInfoUtil.copyPageInfoBasic(dataPageInfo, convertDataPageInfo, convertedData);
        return convertDataPageInfo;
    }

    public T findById(Integer id) {
        Example example = new Example(this.getDOClass());
        example.createCriteria().andEqualTo(this.getDOIdColumn(), id);
        T one = this.mapper.selectOneByExample(example);
        return one;
    }

    public boolean insert(T t) {
        int effectRows = this.mapper.insertSelective(t);
        return effectRows > 0;
    }

    public boolean update(T t) {
        int effectRows = this.mapper.updateByPrimaryKey(t);
        return effectRows > 0;
    }

    public boolean delete(Integer id) {
        int effectRows = this.mapper.deleteByPrimaryKey(id);
        return effectRows > 0;
    }

}

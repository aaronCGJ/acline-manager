package com.acline.common.dal.base.basedao;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */
@FunctionalInterface
public interface Converter<E, T> {
    E assemble(T data);
}

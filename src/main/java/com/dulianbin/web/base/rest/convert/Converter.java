package com.dulianbin.web.base.rest.convert;

/**
 * 数据转换器接口
 * @author dulianbin
 * @date 2020/08/15
 *
 * @param <S>
 * @param <T>
 */
public interface Converter<T> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    T convert(Object source);

}

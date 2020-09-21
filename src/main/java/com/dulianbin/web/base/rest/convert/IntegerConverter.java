package com.dulianbin.web.base.rest.convert;

/**
 * 整数转换器
 * @author dulianbin
 * @date 2020/08/15
 */
final class IntegerConverter implements Converter<Integer> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public Integer convert(Object source) {
        return Integer.parseInt(source.toString());
    }

}

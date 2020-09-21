package com.dulianbin.web.base.rest.convert;

/**
 * 字符串转换器
 * @author dulianbin
 * @date 2020/08/15
 */
final class StringConverter implements Converter<String> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public String convert(Object source) {
        return source.toString();
    }

}

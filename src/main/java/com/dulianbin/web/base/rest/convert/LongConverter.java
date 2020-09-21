package com.dulianbin.web.base.rest.convert;

/**
 * 长整数转换器
 * @author dulianbin
 * @date 2020/08/15
 */
final class LongConverter implements Converter<Long> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public Long convert(Object source) {
        return Long.parseLong(source.toString());
    }

}
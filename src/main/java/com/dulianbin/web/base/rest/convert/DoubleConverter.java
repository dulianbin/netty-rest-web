package com.dulianbin.web.base.rest.convert;

/**
 * 双精度转换器
 * @author dulianbin
 * @date 2020/08/15
 */
final class DoubleConverter implements Converter<Double> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public Double convert(Object source) {
        return Double.parseDouble(source.toString());
    }

}

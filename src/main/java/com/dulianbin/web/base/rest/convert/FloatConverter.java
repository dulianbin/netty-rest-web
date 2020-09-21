package com.dulianbin.web.base.rest.convert;

/**
 * 单精度转换器
 * @author dulianbin
 * @date 2020/08/15
 */
final class FloatConverter implements Converter<Float> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public Float convert(Object source) {
        return Float.parseFloat(source.toString());
    }

}

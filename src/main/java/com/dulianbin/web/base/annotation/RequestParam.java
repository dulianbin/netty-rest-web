package com.dulianbin.web.base.annotation;

import java.lang.annotation.*;

/**
 * Http 请求参数注解
 * @author dulianbin
 * @date 2020/08/15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    
    String value() default "";
    
    boolean required() default true;

}

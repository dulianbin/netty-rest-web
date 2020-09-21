package com.dulianbin.web.base.annotation;

import java.lang.annotation.*;

/**
 * Http 请求头注解
 * @author dulianbin
 * @date 2020/08/15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestHeader {

    String value() default "";
    
    boolean required() default true;
    
}

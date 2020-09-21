package com.dulianbin.web.base.annotation;

import java.lang.annotation.*;

/**
 * Request 请求体注解
 * @author dulianbin
 * @date 2020/08/15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestBody {
    
    String value() default "";

}

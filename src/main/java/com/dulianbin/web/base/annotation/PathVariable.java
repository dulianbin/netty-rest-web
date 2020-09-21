package com.dulianbin.web.base.annotation;

import java.lang.annotation.*;

/**
 * 路径变量注解
 * @author dulianbin
 * @date 2020/08/15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PathVariable {
    
    String value() default "";

}

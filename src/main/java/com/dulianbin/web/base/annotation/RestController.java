package com.dulianbin.web.base.annotation;

import java.lang.annotation.*;

/**
 * REST 控制器注解
 * @author dulianbin
 * @date 2020/08/15
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RestController {
    
    boolean singleton() default true;
    
}

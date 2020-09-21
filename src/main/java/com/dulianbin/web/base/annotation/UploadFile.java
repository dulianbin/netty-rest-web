package com.dulianbin.web.base.annotation;

import java.lang.annotation.*;

/**
 * 上传文件注解
 * @author dulianbin
 * @date 2020/08/15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UploadFile {

}

package com.dulianbin.web.base.rest.handler;

/**
 * 异常处理器
 * @author dulianbin
 * @date 2020/08/15
 */
public interface ExceptionHandler {

    /**
     * 处理异常
     * @param e
     */
    void doHandle(Exception e);
    
}

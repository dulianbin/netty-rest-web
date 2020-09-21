package com.dulianbin.web;

import com.dulianbin.web.base.core.WebServer;
import com.dulianbin.web.web.controller.ExceptionController;
import com.dulianbin.web.web.interceptor.CorsInterceptor;

/**
 * 启动入口类
 *  * @author dulianbin
 *  * @date 2020/08/15
 */
public class WebServerApplication {

    public static void main(String[] args) {
        // 忽略指定url
        WebServer.getIgnoreUrls().add("/favicon.ico");

        // 全局异常处理
        WebServer.setExceptionHandler(new ExceptionController());

        // 设置监听端口号
        WebServer server = new WebServer(8088);

        // 设置Http最大内容长度（默认 为10M）
        server.setMaxContentLength(1024 * 1024 * 50);

        // 设置Controller所在包
        server.setControllerBasePackage("com.dulianbin.web.web.controller");

        // 添加拦截器，按照添加的顺序执行。
        // 跨域拦截器
        server.addInterceptor(new CorsInterceptor(), "/不用拦截的url");

        try {
            server.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

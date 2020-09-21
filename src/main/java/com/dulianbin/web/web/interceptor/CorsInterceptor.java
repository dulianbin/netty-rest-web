package com.dulianbin.web.web.interceptor;

import io.netty.handler.codec.http.FullHttpRequest;
import com.dulianbin.web.base.rest.HttpResponse;
import com.dulianbin.web.base.rest.interceptor.Interceptor;

/**
 * 跨域拦截器
 * @author dulianbin
 * @date 2020/08/15
 */
public final class CorsInterceptor implements Interceptor {

    @Override
    public boolean preHandle(FullHttpRequest request, HttpResponse response) throws Exception {
        response.getHeaders().put("Access-Control-Allow-Origin", "*");
        response.getHeaders().put("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.getHeaders().put("Access-Control-Max-Age", "3600");
        response.getHeaders().put("Access-Control-Allow-Headers", "Content-Type, X-Token");
        return true;
    }

    @Override
    public void postHandle(FullHttpRequest request, HttpResponse response) throws Exception {
    }

    @Override
    public void afterCompletion(FullHttpRequest request, HttpResponse response) {
    }

}

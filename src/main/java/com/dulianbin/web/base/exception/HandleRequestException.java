package com.dulianbin.web.base.exception;

/**
 * 处理请求异常类
 * @author dulianbin
 * @date 2020/08/15
 */
public final class HandleRequestException extends RuntimeException {

    private static final long serialVersionUID = -630225144002649999L;

    public HandleRequestException() {
    }

    public HandleRequestException(String message) {
        super(message);
    }

    public HandleRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandleRequestException(Throwable cause) {
        super(cause);
    }

}

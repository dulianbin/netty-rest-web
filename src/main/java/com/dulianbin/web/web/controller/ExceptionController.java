package com.dulianbin.web.web.controller;

import com.dulianbin.web.base.exception.ResourceNotFoundException;
import com.dulianbin.web.base.rest.HttpContextHolder;
import com.dulianbin.web.base.rest.HttpResponse;
import com.dulianbin.web.base.rest.HttpStatus;
import com.dulianbin.web.base.rest.handler.ExceptionHandler;

public class ExceptionController implements ExceptionHandler {

    /**
     * 处理异常
     * @param e
     */
    @Override
    public void doHandle(Exception e) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if(e instanceof ResourceNotFoundException) {
            status = HttpStatus.NOT_FOUND;
        }
        String errorMessage = e.getCause() == null ? "" : e.getCause().getMessage();
        if(errorMessage == null) {
            errorMessage = e.getMessage();
        }
        HttpResponse response = HttpContextHolder.getResponse();
        response.write(status, errorMessage);
        response.closeChannel();
    }

}

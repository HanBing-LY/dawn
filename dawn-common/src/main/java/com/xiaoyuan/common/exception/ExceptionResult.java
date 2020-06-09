package com.xiaoyuan.common.exception;

public interface ExceptionResult {

    boolean success();

    int code();

    String message();
}
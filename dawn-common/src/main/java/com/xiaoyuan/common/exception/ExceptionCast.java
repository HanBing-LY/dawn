package com.xiaoyuan.common.exception;

public class ExceptionCast {
    public static void cast(ExceptionResult exceptionResult){
        throw new ExceptionToExtends(exceptionResult);
    }
}
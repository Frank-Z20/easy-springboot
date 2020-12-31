package com.chou.easyspringboot.easyspringbootexception.common;

/**
 * @Author: zhouxf
 * @Create: 2020/12/30 18:29
 */
public enum ExceptionCode {
    PARAMETER_EXCEPTION(0000, "参数异常"),
    MSG_CONVERT_EXCEPTION(0001, "消息转换异常");

    private long code;
    private String message;

    private ExceptionCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

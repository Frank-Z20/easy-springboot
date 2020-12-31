package com.chou.easyspringboot.easyspringbootexception.common;

/**
 * @Author: zhouxf
 * @Create: 2020/12/29 22:45
 */
public class CommonExceptionResult {
    private long code;
    private String message;

    public CommonExceptionResult(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

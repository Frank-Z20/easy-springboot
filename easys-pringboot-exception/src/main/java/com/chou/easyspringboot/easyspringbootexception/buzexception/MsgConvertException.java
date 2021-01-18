package com.chou.easyspringboot.easyspringbootexception.buzexception;

import com.chou.easyspringboot.easyspringbootexception.common.ExceptionCode;

/**
 * 自定义消息转换异常
 * @Author: zhouxf
 * @Create: 2020/12/31 9:28
 */
public class MsgConvertException extends RuntimeException {
    private long code;
    private String message;

    public MsgConvertException() {
        this.code = ExceptionCode.MSG_CONVERT_EXCEPTION.getCode();
        this.message = ExceptionCode.MSG_CONVERT_EXCEPTION.getMessage();
    }

    public MsgConvertException(String message) {
        this.code = ExceptionCode.MSG_CONVERT_EXCEPTION.getCode();
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 允许自定义提示信息，不允许自定义状态码
     * */
    public void setMessage(String message) {
        this.message = message;
    }
}

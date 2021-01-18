package com.chou.easyspringboot.easyspringbootexception.handler;

import com.chou.easyspringboot.easyspringbootexception.buzexception.MsgConvertException;
import com.chou.easyspringboot.easyspringbootexception.common.CommonExceptionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhouxf
 * @Create: 2020/12/30 18:38
 */
@ControllerAdvice
@ResponseBody
public class CommonExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

    /**
     * 拦截空指针异常
     * */
    @ExceptionHandler(NullPointerException.class)
    public CommonExceptionResult handleNPLException(NullPointerException ex) {
        logger.error("【空指针异常】：{}", ex.getMessage());
        return new CommonExceptionResult(1234, ex.getMessage());
    }

    /**
     * 拦截自定义的消息转换异常
     * */
    @ExceptionHandler(MsgConvertException.class)
    public CommonExceptionResult handlingMsgConvertException(MsgConvertException ex) {
        logger.error("【参数异常】：{}", ex.getMessage());
        return new CommonExceptionResult(ex.getCode(), ex.getMessage());
    }
}

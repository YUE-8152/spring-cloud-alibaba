package com.yue.spring.cloud.alibaba.common.core;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.yue.spring.cloud.alibaba.common.core.ResultCode.PARAMETERS_ERROR;

/**
 * @ProjectName: spring-cloud-alibaba-common
 * @Package: com.yue.spring.cloud.alibaba.common.core
 * @ClassName: ExceptionAdvice
 * @Author: YUE
 * @Description:
 * @Date: 2021/5/9 13:41
 * @Version: 1.0
 */
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return Result.fail(PARAMETERS_ERROR.code(), objectError.getDefaultMessage());
    }

    @ExceptionHandler(ServiceException.class)
    public Result ServiceExceptionHandler(ServiceException e) {
        return Result.fail(e.getCode(), e.getMessage());
    }

}

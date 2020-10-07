package com.chamking.demo.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/616:11
 * description:
 */
@RestControllerAdvice
public class CommonException {
    //处理公共异常
    @ExceptionHandler
    public JsonResult CommonException(Exception ex)
    {
        return new JsonResult(0,ex.getMessage());
    }



}

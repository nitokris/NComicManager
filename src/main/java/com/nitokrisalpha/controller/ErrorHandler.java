package com.nitokrisalpha.controller;

import com.nitokrisalpha.api.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler({Exception.class})
    public R<Void> handleException(Exception e) {
        return R.error(500, e.getMessage());
    }

}

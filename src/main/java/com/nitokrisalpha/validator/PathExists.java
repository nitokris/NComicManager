package com.nitokrisalpha.validator;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PathExists {
    String message() default "不存在";
}

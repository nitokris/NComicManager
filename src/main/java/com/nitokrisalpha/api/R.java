package com.nitokrisalpha.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    private int code;
    private String message;
    private T data;

    public R(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static R<Void> error(int code, String message) {
        return new R<>(code, message);
    }
}

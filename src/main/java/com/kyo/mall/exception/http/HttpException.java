package com.kyo.mall.exception.http;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HttpException extends RuntimeException {
    protected Integer code;
    protected Integer httpStatusCode = 500;
}

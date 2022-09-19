package com.colibear.framwork.validation.exception;


import com.colibear.framwork.validation.enums.ResponseCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonException extends RuntimeException {
    private ResponseCode responseCode;

    public CommonException(ResponseCode responseCode, String message) {
       super(message);
       this.responseCode = responseCode;
    }
    public CommonException(Class cls, Long idx, ResponseCode responseCode) {
        super(cls.getSimpleName() + ":" + idx + " " + responseCode);
        this.responseCode = responseCode;
    }

    public CommonException(Class cls, ResponseCode responseCode, Object... obj) {
        super(cls.getSimpleName() + " :" + responseCode.getValue() + "(" +
            Arrays.stream(obj)
                .map(m -> String.valueOf(m))
                .collect(Collectors.joining(" or "))
            + ")");
        this.responseCode = responseCode;
    }

    public ResponseCode getCode() {
        return responseCode;
    }
}

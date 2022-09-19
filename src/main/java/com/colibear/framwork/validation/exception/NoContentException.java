package com.colibear.framwork.validation.exception;


import com.colibear.framwork.validation.enums.ResponseCode;

public class NoContentException extends CommonException {
    public NoContentException(Class cls, Long idx) {
        super(cls, idx, ResponseCode.NO_CONTENT);
    }
}

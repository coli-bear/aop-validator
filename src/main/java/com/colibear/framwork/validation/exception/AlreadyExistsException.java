package com.colibear.framwork.validation.exception;


import com.colibear.framwork.validation.enums.ResponseCode;

public class AlreadyExistsException extends CommonException {
    public AlreadyExistsException(Class cls, Long idx) {
        super(cls, idx, ResponseCode.ALREADY_EXISTS);
    }
    public AlreadyExistsException(Class cls, Object ...obj) {
        super(cls, ResponseCode.ALREADY_EXISTS, obj);
    }
}

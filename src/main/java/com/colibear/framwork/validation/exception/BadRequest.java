package com.colibear.framwork.validation.exception;


import com.colibear.framwork.validation.enums.ResponseCode;

import java.util.List;

public class BadRequest extends CommonException {

    private List<String> fields;

    public BadRequest(String message, List<String> fields) {
        super(ResponseCode.BAD_REQUEST, message);
        this.fields = fields;
    }

    public List<String> getField() {
        return this.fields;
    }
}

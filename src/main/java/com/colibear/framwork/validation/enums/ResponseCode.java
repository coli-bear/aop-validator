package com.colibear.framwork.validation.enums;

public enum ResponseCode {
    SUCCESS("success"),
    NO_CONTENT("no_content"),
    ALREADY_EXISTS("already_exists"),
    BAD_REQUEST("bad_request");
    private String value;
    ResponseCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

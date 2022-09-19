package com.colibear.framwork.validation.enums;

public enum ErrorCode {
    NOT_NULL("not null"),
    NOT_BLANK("not blank"),
    NON_EMAIL("non-email type"),
    NOT_EMPTY("not empty"),
    GREAT_THAN_MAX("great than max"),
    LESS_THAN_MIN("less than min"),
    ;

    private String value;
    ErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

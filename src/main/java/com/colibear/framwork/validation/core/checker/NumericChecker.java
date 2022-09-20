package com.colibear.framwork.validation.core.checker;

import com.colibear.framwork.validation.annotation.Payload;

import java.util.List;

public interface NumericChecker {

    static boolean gtMax(String str, int max) {
        if (str.length() > max) {
            return false;
        }

        return true;
    }

    static boolean ltMin(String str, int max) {
        if (str.length() < max) {
            return false;
        }

        return true;
    }

    List<String> numericValidation(Payload payload, int num);
}

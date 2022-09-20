package com.colibear.framwork.validation.core.checker;

import com.colibear.framwork.validation.annotation.Payload;

import java.util.Collection;
import java.util.List;

public interface StringChecker {
    static boolean notBlank(String str) {
        if (!str.isBlank()) {
            return false;
        }

        return true;
    }

    static boolean isNotEmpty(Collection iter) {
        if (iter.isEmpty()) {
            return false;
        }

        return true;
    }

    static boolean hasSpace(String str) {
        if (!str.matches("/(\\s)/g")) {
            return false;
        }

        return true;
    }

    static boolean isUppercase(String str) {
        if (!str.matches("/^[A-Z]+$/g")) {
            return false;
        }

        return true;
    }

    static boolean isLowercase(String str) {
        if (!str.matches("/^[a-z]+$/g")) {
            return false;
        }

        return true;
    }

    List<String> stringValidation(Payload payload, String str);
}

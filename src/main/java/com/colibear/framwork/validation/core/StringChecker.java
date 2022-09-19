package com.colibear.framwork.validation.core;

import java.util.Collection;

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
}

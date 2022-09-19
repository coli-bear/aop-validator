package com.colibear.framwork.validation.core;

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
}

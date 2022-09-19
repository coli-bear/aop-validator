package com.colibear.framwork.validation.core;

public interface NullChecker {
    static boolean isNull(Object obj) {
        return obj == null;
    }
}

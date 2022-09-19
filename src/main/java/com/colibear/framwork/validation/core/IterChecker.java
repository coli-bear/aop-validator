package com.colibear.framwork.validation.core;

import java.util.Collection;

public interface IterChecker {
    static boolean isEmpty(Collection collection) {
        return collection.isEmpty();
    }
}

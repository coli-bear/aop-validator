package com.colibear.framwork.validation.core.checker;

import com.colibear.framwork.validation.annotation.Payload;

import java.util.List;

public interface NullChecker {
    static boolean isNull(Object obj) {
        return obj == null;
    }

    List<String> nullValidation(Payload payload, String email);
}

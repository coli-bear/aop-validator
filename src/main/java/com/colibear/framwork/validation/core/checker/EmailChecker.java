package com.colibear.framwork.validation.core.checker;

import com.colibear.framwork.validation.annotation.Payload;

import java.util.List;

public interface EmailChecker {

    static boolean isMail(String str) {
        if (str == null) {
            return false;
        }

        if (!str.matches("/^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$/g")) {
            return false;
        }

        return true;
    }

    List<String> emailValidation(Payload payload, String email);
}

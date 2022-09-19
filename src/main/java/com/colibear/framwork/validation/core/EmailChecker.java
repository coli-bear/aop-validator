package com.colibear.framwork.validation.core;

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



}

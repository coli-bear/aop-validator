package com.colibear.framwork.validation.core;

import java.lang.reflect.Field;
import java.util.Map;

public interface PayloadValidator {
    Map<String, String> valid(Field[] fields, Object obj);
}

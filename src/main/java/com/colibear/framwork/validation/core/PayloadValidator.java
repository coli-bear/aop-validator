package com.colibear.framwork.validation.core;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public interface PayloadValidator {
    Map<String, List<String>> valid(Field[] fields, Object obj);


}

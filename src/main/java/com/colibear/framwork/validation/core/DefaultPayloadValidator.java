package com.colibear.framwork.validation.core;

import com.colibear.framwork.validation.annotation.Payload;
import com.colibear.framwork.validation.core.checker.AllPayloadChecker;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultPayloadValidator implements PayloadValidator {

    @Autowired
    private AllPayloadChecker allPayloadChecker;

    @Override
    public Map<String, List<String>> valid(Field[] fields, Object obj) {

        Map<String, List<String>> invalidMap = new ConcurrentHashMap<>();

        Arrays.stream(fields).forEach(field -> {
            Payload payload = field.getAnnotation(Payload.class);
            try {
                invalidMap.putAll(validObject(field, obj, payload));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
        return invalidMap;
    }

    private Map<String, List<String>> validObject(Field field, Object obj, Payload payload) throws IllegalAccessException {
        Object o = field.get(obj);

        Map<String, List<String>> invalidsMap = new HashMap<>();
        if (o instanceof Collection) {
            List<String> invalids = allPayloadChecker.collectionValidation(payload, (Collection) field.get(obj));
            invalidsMap.put(field.getName(), invalids);
        }

        return invalidsMap;
    }
}

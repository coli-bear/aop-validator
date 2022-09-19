package com.colibear.framwork.validation.core;

import com.colibear.framwork.validation.annotation.Payload;
import com.colibear.framwork.validation.enums.ErrorCode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AllPayLoadValidator implements PayloadValidator {

    @Override
    public Map<String, String> valid(Field[] fields, Object obj) {

        Map<String, String> invalidMap = new ConcurrentHashMap<>();

        Arrays.stream(fields).forEach(field -> {
            Payload payload = field.getAnnotation(Payload.class);
            try {
                validObject(field, obj, payload);
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
            List<String> invalids = collectionValidation(payload, (Collection) field.get(obj));
            invalidsMap.put(field.getName(), invalids);
        }

        return invalidsMap;
    }

    private List<String> collectionValidation(Payload payload, Collection collection) {
        List<String> invalids = new ArrayList<>();
        if (payload.notnull()) {
            if (NullChecker.isNull(collection)) {
                invalids.add(ErrorCode.NOT_NULL.getValue());
            }
        }

        if (!payload.empty()) {
            if (IterChecker.isEmpty(collection)) {
                invalids.add(ErrorCode.NOT_EMPTY.getValue());
            }
        }

        return invalids;
    }
}

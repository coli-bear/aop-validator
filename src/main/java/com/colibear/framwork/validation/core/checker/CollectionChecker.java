package com.colibear.framwork.validation.core.checker;

import com.colibear.framwork.validation.annotation.Payload;

import java.util.Collection;
import java.util.List;

public interface CollectionChecker {
    static boolean isEmpty(Collection collection) {
        return collection.isEmpty();
    }

    List<String> collectionValidation(Payload payload, Collection collection);
}

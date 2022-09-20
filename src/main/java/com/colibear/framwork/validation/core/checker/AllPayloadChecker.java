package com.colibear.framwork.validation.core.checker;

import com.colibear.framwork.validation.annotation.Payload;
import com.colibear.framwork.validation.enums.ErrorCode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class AllPayloadChecker
    implements EmailChecker, CollectionChecker, NullChecker, NumericChecker, StringChecker {
    @Override
    public List<String> collectionValidation(Payload payload, Collection collection) {
        List<String> invalids = new ArrayList<>();
        if (payload.notnull()) {
            collectionNullCheck(NullChecker.isNull(collection), invalids, ErrorCode.NOT_NULL);
        } else if (payload.notnull() && !payload.empty()) {
            collectionNullCheck(NullChecker.isNull(collection), invalids, ErrorCode.NOT_NULL);

            if (CollectionChecker.isEmpty(collection)) {
                invalids.add(ErrorCode.NOT_EMPTY.getValue());
            }
        }

        return invalids;
    }

    private static void collectionNullCheck(boolean collection, List<String> invalids, ErrorCode notNull) {
        if (collection) {
            invalids.add(notNull.getValue());
        }
    }

    @Override
    public List<String> emailValidation(Payload payload, String email) {
        List<String> invalids = new ArrayList<>();
        if (payload.notnull()) {

        }
        return null;
    }

    @Override
    public List<String> nullValidation(Payload payload, String email) {
        return null;
    }

    @Override
    public List<String> numericValidation(Payload payload, int num) {
        return null;
    }

    @Override
    public List<String> stringValidation(Payload payload, String str) {
        return null;
    }
}

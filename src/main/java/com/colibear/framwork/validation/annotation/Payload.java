package com.colibear.framwork.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Payload {
    boolean notnull() default false;
    boolean email() default false;
    boolean blank() default false;
    boolean empty() default false;
    int max() default 255;
    int min() default 0;
}

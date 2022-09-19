package com.colibear.framwork.validation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Aspect
@Component
public class PayloadValidationAspect {
    @Before("@annotation(PayloadValidation)")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        List<Object> collect = Arrays.stream(args).map(a -> {
            return null;
        }).collect(Collectors.toList());
    }
}

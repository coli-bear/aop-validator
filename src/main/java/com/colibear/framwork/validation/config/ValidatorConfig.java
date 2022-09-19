package com.colibear.framwork.validation.config;

import com.colibear.framwork.validation.core.AllPayLoadValidator;
import com.colibear.framwork.validation.core.PayloadValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatorConfig {

    @Bean
    public PayloadValidator payloadValidator() {
        return new AllPayLoadValidator();
    }
}

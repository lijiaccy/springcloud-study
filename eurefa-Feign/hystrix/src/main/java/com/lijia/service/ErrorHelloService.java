package com.lijia.service;

import org.springframework.stereotype.Component;

@Component
public class ErrorHelloService implements HelloService {
    @Override
    public String callClientOne(String name) {
        return "sorry "+name;
    }
}

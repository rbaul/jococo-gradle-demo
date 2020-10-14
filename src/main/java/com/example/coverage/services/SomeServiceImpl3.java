package com.example.coverage.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SomeServiceImpl3 implements SomeService {
    public void method1() {
        log.info("Method 1");
    }

    public void method2() {
        log.info("Method 2");
    }

    public void method3() {
        log.info("Method 3");
    }
}

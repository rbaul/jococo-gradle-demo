package com.example.coverage;

import com.example.coverage.services.SomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class Initializer implements ApplicationRunner {

    private final List<SomeService> someServices;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        someServices.forEach(SomeService::method1);
        someServices.forEach(SomeService::method2);
        someServices.forEach(SomeService::method3);
    }
}

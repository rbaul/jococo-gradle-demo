package com.example.coverage.services;

public interface SomeService {
    default void method1() {
        System.out.println("Method 1");
    }

    default void method2() {
        System.out.println("Method 2");
    }

    default void method3() {
        System.out.println("Method 3");
    }
}

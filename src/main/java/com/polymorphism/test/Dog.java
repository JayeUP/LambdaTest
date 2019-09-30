package com.polymorphism.test;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Fork {
    @Override
    public void print() {
        System.out.println("我是dog");
    }
}

package com.polymorphism.test;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Fork {
    @Override
    public void print() {
        System.out.println("我是cat");
    }
}

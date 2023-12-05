package com.example.mydemoOne.bean;

import javax.inject.Inject;

public class Cat {
    @Inject
    public Cat() {
    }

    @Override
    public String toString() {
        return "喵星人来了!";
    }
}
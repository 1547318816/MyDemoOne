package com.example.mydemoOne.bean;

import com.example.mydemoOne.MainActivity;

import dagger.Component;

@Component
public interface MainComponent {
    void inject(MainActivity activity);
}
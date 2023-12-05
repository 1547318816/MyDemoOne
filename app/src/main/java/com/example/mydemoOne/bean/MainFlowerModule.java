package com.example.mydemoOne.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class MainFlowerModule {
    @Provides
    public Flower provideRedRose() {
        return new Flower("玫瑰", "红色");
    }
}

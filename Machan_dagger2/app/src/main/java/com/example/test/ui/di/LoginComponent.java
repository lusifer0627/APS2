package com.example.test.ui.di;

import com.example.test.ui.Main.Main;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {LoginModule.class})
public interface LoginComponent {
    void inject(Main main);
}

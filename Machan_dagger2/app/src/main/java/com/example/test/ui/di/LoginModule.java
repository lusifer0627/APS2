package com.example.test.ui.di;

import com.example.test.ui.Login.Login;

import dagger.Module;

@Module
public class LoginModule {
    Login login;
    public LoginModule(Login login){
        this.login = login;
    }
}

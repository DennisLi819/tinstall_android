package com.ilelli.myapplication;

import android.app.Application;

import com.tinstall.tinstall.TInstall;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initTInstall();
    }

    private void initTInstall(){
        TInstall.init(this,"10VB57QR");
        TInstall.setDebug(true);
    }
}

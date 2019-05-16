package com.marlon.retrofitclentdemo.app;

import android.app.Application;

import com.marlon.retrofitclentdemo.base.ActivityCollector;
import com.marlon.retrofitclentdemo.di.component.AppComponent;
import com.marlon.retrofitclentdemo.di.component.DaggerAppComponent;
import com.marlon.retrofitclentdemo.di.module.AppModule;
import com.marlon.retrofitclentdemo.di.module.HttpModule;


/**
 * Created by KangLong on 2017/7/10.
 */

public class App extends Application {
    private static App instance;
    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static synchronized App getInstance() {
        return instance;
    }

    public static AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(instance))
                    .httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }

    public static void exitApp() {
        try {
            ActivityCollector.removeAllActivity();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}

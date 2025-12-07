package com.singleton;

public class AppConfig {
    //private static instance of this class
    private static volatile AppConfig instance;

    private AppConfig(){}

    public static AppConfig getInstance(){
        if(null == instance){
            synchronized (AppConfig.class){
                if(null == instance){
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }
}

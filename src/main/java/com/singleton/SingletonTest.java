package com.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        AppConfig config1 = AppConfig.getInstance();
        System.out.println(config.hashCode());
        System.out.println(config1.hashCode());
        System.out.println(config == config1);
    }
}

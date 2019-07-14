package com.ji.Singleton;/*
    user ji
    data 2019/7/14
    time 10:09 AM
*/

public class SingletonI {
    private SingletonI() {

    }

    private static SingletonI tmp = new SingletonI();

    public static SingletonI SingletonI() {
        
        return tmp;
    }
}

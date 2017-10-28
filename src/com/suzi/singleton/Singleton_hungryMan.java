package com.suzi.singleton;

/**
 * 单例模式：饿汉式
 * 静态初始化的方式，它是类一加载就实例化的对象，所以要提前占用系统资源
 */
public class Singleton_hungryMan {

    //在类的内部实例化一个静态变量singleton
    private static final Singleton_hungryMan shm =new Singleton_hungryMan();

    private Singleton_hungryMan() {
    }

    public static Singleton_hungryMan getShm(){
       return shm;
    }
}

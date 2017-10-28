package com.suzi.singleton;

/**
 *  //单例模式：懒汉式【会面临着多线程访问的安全性问题，需要做双重锁才可以保证安全】
 */
public class Singleton_lazyMan {

    private static Singleton_lazyMan instance;

    private Singleton_lazyMan() { //注意是private 防止其他类new，实例化这个类
    }

    public static  Singleton_lazyMan getInstance(){
        if (instance==null){

            instance=new Singleton_lazyMan();//只允许在本类中实例化一次。
        }
        return instance;
    }
}

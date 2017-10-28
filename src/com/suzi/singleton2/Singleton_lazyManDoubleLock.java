package com.suzi.singleton2;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 多线程下懒汉模式的双重锁定
 */
public class Singleton_lazyManDoubleLock {

    private static Singleton_lazyManDoubleLock instance ;

    private Singleton_lazyManDoubleLock(){}

    public static Singleton_lazyManDoubleLock getInstance(){
        if (instance==null){

            synchronized (instance){

                if (instance==null){

                    instance=new Singleton_lazyManDoubleLock();
                }
            }
        }
        return instance;
    }
}

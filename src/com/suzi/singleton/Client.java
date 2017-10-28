package com.suzi.singleton;

public class Client {

    public static void main(String[] args) {

        //懒汉模式
//        Singleton_lazyMan s1= Singleton_lazyMan.getInstance();
//        Singleton_lazyMan s2= Singleton_lazyMan.getInstance();

        //if(s1==s2){
//            System.out.println("两个对象都是相同的实例。");
//        }
//-----------------------------------------------------------------
        //饿汉模式
        Singleton_hungryMan s3=Singleton_hungryMan.getShm();
        Singleton_hungryMan s4=Singleton_hungryMan.getShm();

        if(s3==s4){
            System.out.println("两个对象都是相同的实例。");
        }
//-----------------------------------------------------------------------

    }
}

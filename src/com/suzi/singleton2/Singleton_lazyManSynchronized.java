package com.suzi.singleton2;

/**多线程下的懒汉模式
 * 当线程B访问这个函数的时候，其他的任何要访问该函数的代码不能执行，直到线程B执行完该函数（这是利用锁实现的）。
 * 这样写东西是真的有点烦人，但是我不得不说这样还是不太好的，
 * 因为多个线程访问同一个函数的时候，那么只能有一个线程能够访问这个函数，这显然效率有点低吧
 */
public class Singleton_lazyManSynchronized {

    private static Singleton_lazyManSynchronized instance;

    private Singleton_lazyManSynchronized(){ }

    public static synchronized Singleton_lazyManSynchronized getInstance(){
        if (instance==null){
            instance=new Singleton_lazyManSynchronized();
        }
        return instance;
    }
}

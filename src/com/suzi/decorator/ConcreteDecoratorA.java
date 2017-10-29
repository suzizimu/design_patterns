package com.suzi.decorator;

public class ConcreteDecoratorA extends  Decorator{
    private String addedState;//本类独有功能，以区别于ConcreteDecoratorB

    @Override
    public void Operation() {
        super.Operation();//首先执行原Component的Operation()
                          // 再执行本类的功能，如addedState,相当于对原Component进行了装饰
        addedState="New State";
        System.out.println("具体修饰对象A的操作");
    }
}

package com.suzi.decorator;

public class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();

        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior(){//本类独有的方法，与区别于ConcreteDecoratorA

    }
}

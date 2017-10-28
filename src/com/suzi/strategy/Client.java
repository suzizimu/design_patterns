package com.suzi.strategy;

public class Client {

    public static void main(String[] args) {
        Context context;

        //由于实例化不同的策略，所以最终在调用context.ContextInterface();时
        //所获得的结果不同
        context=new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context=new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context=new Context(new ConcreteStrategeC());
        context.ContextInterface();

    }
}

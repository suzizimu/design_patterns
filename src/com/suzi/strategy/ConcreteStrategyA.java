package com.suzi.strategy;

/**
 * 封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategyA extends  Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A实现。");
    }
}

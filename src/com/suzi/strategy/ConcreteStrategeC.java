package com.suzi.strategy;

/**
 * 封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategeC extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C实现。");
    }
}

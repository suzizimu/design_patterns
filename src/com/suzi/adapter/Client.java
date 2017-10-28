package com.suzi.adapter;

/**
 * 类适配器
 */
public class Client {
    public static void main(String[] args) {
        Robot robot=new DogAdapter();
        robot.cry();
        robot.move();
    }
}

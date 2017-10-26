package com.suzi.adapter;

public class Client {
    public static void main(String[] args) {
        Robot robot=new DogAdapter();
        robot.cry();
        robot.move();
    }
}

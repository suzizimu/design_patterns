package com.suzi.adapter2;

public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("前锋:"+name+"进攻！");
    }

    @Override
    public void Defense() {
        System.out.println("前锋:"+name+"防守！");
    }
}

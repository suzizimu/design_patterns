package com.suzi.adapter2;

public abstract class Player {

    public String name;//球员名字

    public Player(String name) {
        this.name = name;
    }

    public abstract void Attack();

    public abstract void Defense();
}

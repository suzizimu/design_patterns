package com.suzi.decorator2;

//ConcreteDecorator
public class BigTrouser extends Finery{
    @Override
    public void Show() {
        System.out.println("垮裤");
        super.Show();
    }
}

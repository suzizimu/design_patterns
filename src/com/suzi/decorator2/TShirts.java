package com.suzi.decorator2;

//ConcreteDecorator
public class TShirts extends Finery{

    @Override
    public void Show() {
        System.out.println("大T恤");
        super.Show();
    }
}

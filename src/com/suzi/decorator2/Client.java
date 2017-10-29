package com.suzi.decorator2;

public class Client {
    public static void main(String[] args) {
        Person person=new Person("小菜");
        TShirts tShirts=new TShirts();
        BigTrouser bigTrouser=new BigTrouser();

        tShirts.Decorator(person);
        bigTrouser.Decorator(tShirts);
        bigTrouser.Show();
    }
}

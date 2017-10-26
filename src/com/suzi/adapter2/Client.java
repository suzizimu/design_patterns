package com.suzi.adapter2;

public class Client {

    public static void main(String[] args) {
        Player player=new Forwards("小明");
        player.Attack();

        Player player2=new Adapter("姚明");
        player2.Attack();
    }

}

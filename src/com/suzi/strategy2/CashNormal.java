package com.suzi.strategy2;

//正常收费子类
public class CashNormal extends  CashSuper{

    @Override
    public double accpetCash(Double money) {
        return money;
    }
}

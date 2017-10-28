package com.suzi.strategy2;

public class CashRebate extends CashSuper{

    private Double moneyRebate=1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double accpetCash(Double money) {
        return money*moneyRebate;
    }
}

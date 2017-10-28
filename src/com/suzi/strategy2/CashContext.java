package com.suzi.strategy2;

/**
 * 策略与简单工厂结合
 */
public class CashContext {
    CashSuper cashSuper=null;

    //将实例化具体策略的过程由客户端转移到Context类中。简单工厂的应用
    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper=new CashNormal();
                break;

            case "满300返100":
                cashSuper=new CashReturn("300","100");
                break;

            case "打8折":
                cashSuper=new CashRebate("0.8");
                break;
        }
    }

    public double getResult(Double money){
        return cashSuper.accpetCash(money);
    }

}

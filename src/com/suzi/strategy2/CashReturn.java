package com.suzi.strategy2;

//返利收费子类
public class CashReturn extends CashSuper {

    //返利收费，初始化时必须要输入返利条件和返利值。
    // 【比如满300减100，则moneyCondition为300，monyeReturn为100】
    private Double moneyCondition=0d;
    private Double moneyReturn=100d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double accpetCash(Double money) {

        Double result=money;
        if (money>moneyCondition){
            result=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}

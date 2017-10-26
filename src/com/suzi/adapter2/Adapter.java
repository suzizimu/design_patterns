package com.suzi.adapter2;

public class Adapter extends Player{

    private ForeignCenter wjzf=new ForeignCenter();//因为是 对象适配器模式

    //构造方法 调用父类的属性。
    public Adapter(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void Attack() {
        wjzf.进攻();
    }

    @Override
    public void Defense() {
        wjzf.防守();
    }
}

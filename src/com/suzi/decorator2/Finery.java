package com.suzi.decorator2;

//Decorator
public class Finery extends Person{
    protected Person component;//一种是 Person定义的 component

    public void Decorator(Person component){//一种是 参数传过来的 component
        this.component=component;
    }

    @Override
    public void Show() {
        if (component!=null){
            component.Show();
        }
    }
}

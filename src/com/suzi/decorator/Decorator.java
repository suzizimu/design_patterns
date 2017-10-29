package com.suzi.decorator;

//Decorator,装饰抽象类，继承了Component,从外类来扩展Component类的功能，
//但对于Component来说，是无需知道Decorator的存在在。
public class Decorator extends Component {
    Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {//重写Operation()方法，实际执行的是Component的Operation()
        if (component!=null){
            component.Operation();
        }
    }
}

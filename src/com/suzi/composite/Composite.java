package com.suzi.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    //一个子对象集合用来存储其下属的枝节点和叶节点
    private List<Component> children=new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
      
    }
}

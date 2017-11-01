package com.suzi.composite;

//Leaf在组合中表示叶节点对象，叶节点没有子节点
public class Leaf extends  Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void Display(int depth) {
        String s="";
        for(int i=0;i<depth;i++){
            s=s+"-";
        }
        System.out.println(s+name);
    }
}

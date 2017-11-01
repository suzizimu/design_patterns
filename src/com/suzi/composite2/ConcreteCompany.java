package com.suzi.composite2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{

    private List<Company> children=new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {
        children.add(c);
    }

    @Override
    public void Remove(Company c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        String s="";
        for (int i=0;i<depth;i++){
            s=s+"-";
        }
        System.out.println(s+name);

        for (Company company:children){
            company.Display(depth+2);
        }
    }

    @Override
    public void LineOfDuty() {
        for (Company company:children){
            company.LineOfDuty();
        }
    }
}

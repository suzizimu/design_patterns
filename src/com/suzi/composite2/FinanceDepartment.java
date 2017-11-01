package com.suzi.composite2;

public class FinanceDepartment  extends Company{
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {

    }

    @Override
    public void Remove(Company c) {

    }

    @Override
    public void Display(int depth) {
        String s="";
        for (int i=0;i<depth;i++){
            s=s+"-";
        }
        System.out.println(s+name);
    }

    @Override
    public void LineOfDuty() {
        System.out.println(name+"*****公司财务收支管理");
    }
}

package com.suzi.composite2;

//人力资源部（树叶节点）
public class HRDepartment extends Company{
    public HRDepartment(String name) {
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
        System.out.println(name+"*****员工招聘培训管理");
    }
}

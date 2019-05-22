package com.example.a123.managerhelper;

public class customClass {
    private String name;
    private int empID;
    public customClass(String n,int a){
        name = n;
        empID = a;
    }
    void setName(String ss){
        name = ss;
    }
    void setID(int id){
        empID = id;
    }
    String getName(){
        return name;
    }
    int getempID(){
        return empID;
    }
}

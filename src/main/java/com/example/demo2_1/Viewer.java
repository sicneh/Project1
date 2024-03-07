package com.example.demo2_1;

import java.util.ArrayList;

public class Viewer {
    private String name;
    private int age;
    private int count = this.s.size();
    private ArrayList<Cinema> s;

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getCount(){
        return this.count;
    }
    public void setCount(int count){
        this.count = count;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

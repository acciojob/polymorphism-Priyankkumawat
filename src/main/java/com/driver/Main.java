package com.driver;

class Product{
    public int product(int x,int y){
        return x+y;
    }
    public int product(int x,int y,int z){
    return x+y+z;
    }
    public double product(double x, double y){
        return x+y;
    }
}

public class Main {
    Product p=new Product();
    system.out.println(p.product(3,4));
    system.out.println(p.product(3,4,5));
    system.out.println(p.product(3.5,4.5));
}

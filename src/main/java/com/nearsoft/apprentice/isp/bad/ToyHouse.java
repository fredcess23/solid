package com.nearsoft.apprentice.isp.bad;

class ToyHouse implements Toy{

    double price;
    String color;

    public void setPrice(double price){
        this.price = price;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void move() {

    }

    @Override
    public void fly() {

    }
}

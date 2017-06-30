package com.nearsoft.apprentice.ocp.good;


public class Square extends Shape {

    private int length;
    private int width;

    public Square() {
        this.type = "Square";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {

    }
}

package com.nearsoft.apprentice.ocp.bad;


public class Circle extends Shape{

    private double radius;
    private Point center;

    public Circle() {
        this.type = "Circle";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}

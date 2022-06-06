package com;

public class Circle {
    double x, y, radius, perimeter, area;

    public void setCoordinatsofCenter(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double perimeterCircle() {
        perimeter = Math.PI * 2 * radius;
        return perimeter;
    }

    public double areaCircle() {
        area = Math.PI * radius * radius;
        return area;
    }

    public String GetCircle() {
        String data = "Координати центру кола (" + x + "; " + y + "), радіус = " + radius +
                ", периметр = " + perimeter + ", площа = " + area;
        return data;
    }
}

package ru.mirea.lab41;

public class Circle extends Shape {
    double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return  Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}

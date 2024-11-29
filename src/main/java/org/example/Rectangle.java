package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private String name;

    public Rectangle(double width, double height, String name, Color color) {
        super(color);
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String getName() {
        return name;
    }

}

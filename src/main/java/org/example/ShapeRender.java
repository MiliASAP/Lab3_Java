package org.example;

import java.util.List;

    public class ShapeRender {
        public void renderShapes(List<Shape> shapes) {
            for (Shape shape : shapes) {
                System.out.println("Rendering shape: " + shape.getName());
                System.out.println("Color: " + shape.getColorDescription());
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
                System.out.println(drawShape(shape));
                System.out.println();
            }
        }

        private String drawShape(Shape shape) {
            String name = shape.getName();
            switch (name.toLowerCase()) {
                case "rectangle":
                    return "█████\n█████";
                case "circle":
                    return " ○ ";
                case "triangle":
                    return "  ▲  \n ▲▲▲ ";
                default:
                    return "Unknown shape";
            }
        }
    }
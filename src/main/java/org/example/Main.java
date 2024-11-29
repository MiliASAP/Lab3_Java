package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(4,5,4,6,7,"triangle",new Color(255,123,34,78));
        Shape rectangle = new Rectangle(2,5,"rectangle",new Color(255,255,255));

        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(triangle);
        describer.describe(rectangle);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);


        ShapeRender render = new ShapeRender();
        render.renderShapes(shapes);
    }
}
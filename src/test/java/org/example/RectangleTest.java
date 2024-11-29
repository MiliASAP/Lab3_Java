package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(5, 3,"rectangle", new Color(255, 0, 0, 255));
        assertEquals(15.0, rectangle.getArea(), "Area should be 15.0");
    }

    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 3,"rectangle", new Color(255, 0, 0, 255));
        assertEquals(16.0, rectangle.getPerimeter(), "Perimeter should be 16.0");
    }

    @Test
    void testColorDescription() {
        Rectangle rectangle = new Rectangle(5, 3,"rectangle", new Color(255, 0, 0, 255));
        assertEquals("Red: 255, Green: 0, Blue: 0, Alpha: 255", rectangle.getColorDescription());
    }
}

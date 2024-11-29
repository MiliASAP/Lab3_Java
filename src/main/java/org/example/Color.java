package org.example;
public record Color(int red, int green, int blue, int alpha) {
    public Color {
        if(red < 0 || green < 0 || blue < 0 || alpha < 0 ||
                red > 255 || green > 255 || blue > 255 || alpha > 255) {
            throw new IllegalArgumentException("Invalid color value: Values must be between 0 and 255.");
        }
    }
    public Color(int red,int green, int blue) {
        this(red, green, blue, 0);
    }

}

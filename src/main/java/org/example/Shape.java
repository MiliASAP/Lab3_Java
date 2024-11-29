package org.example;

public abstract class Shape {
   private Color color;
   public Shape(Color color) {
      this.color = color;
   }
   public abstract double getArea();
   public abstract double getPerimeter();
   public abstract String getName();
   public String getColorDescription(){
      return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
              color.red(),color.green(),color.blue(),color.alpha());
   }
}

class Shape { private String color;
public Shape(String color) {
 this.color = color;
 System.out.println("A shape of color " + color + " has been created.");
}
public void displayColor() {
 System.out.println("Color: " + color);
}
}
class Circle extends Shape { private double radius;
public Circle(String color, double radius) {
 super(color);
 this.radius = radius;
 System.out.println("Circle created with radius: " + radius);
}
public void area() {
 double area = Math.PI * radius * radius;
 System.out.println("Area of Circle: " + area);
}
}
class Rectangle extends Shape { private double length; private double width;
public Rectangle(String color, double length, double width) {
 super(color);
 this.length = length;
 this.width = width;
 System.out.println("Rectangle created with length: " + length + " and width: " + 
width);
}
public void area() {
 double area = length * width;
 System.out.println("Area of Rectangle: " + area);
} }
public class ShapeTest { public static void main(String[] args) { Circle circle = new Circle("Red", 5.0); circle.area(); 
circle.displayColor();
 Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
 rectangle.area();
 rectangle.displayColor();
}
}

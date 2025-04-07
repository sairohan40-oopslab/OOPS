abstract class GeometricShape {
 abstract void area();
 abstract void perimeter();
}
class Triangle extends GeometricShape {
 private double base, height, side1, side2, side3;
 public Triangle(double base, double height, double side1, double side2, double side3) {
 this.base = base;
 this.height = height;
 this.side1 = side1;
 this.side2 = side2;
 this.side3 = side3;
 }
 public void area() {
 System.out.println("Triangle Area: " + (0.5 * base * height));
 }
 public void perimeter() {
 System.out.println("Triangle Perimeter: " + (side1 + side2 + side3));
 }
}
class Square extends GeometricShape {
 private double side;
 public Square(double side) {
 this.side = side;
 }
 public void area() {
 System.out.println("Square Area: " + (side * side));
 }
 public void perimeter() {
 System.out.println("Square Perimeter: " + (4 * side));
 }
}
public class Main {
 public static void main(String[] args) {
 GeometricShape triangle = new Triangle(5, 4, 3, 4, 5);
 GeometricShape square = new Square(4);
 triangle.area();
 triangle.perimeter();
 square.area();
 square.perimeter();
 }
}

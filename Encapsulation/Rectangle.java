import java.util.Scanner;
class Rectangle {
 private double length;
 private double width;
 public void setLength(double length) {
 this.length = length;
 }
 public void setWidth(double width) {
 this.width = width;
 }
 public void getLength() {
 System.out.println("Length: " + length);
 }
 public void getWidth() {
 System.out.println("Width: " + width);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Rectangle rectangle = new Rectangle();
 System.out.print("Enter length: ");
 double length = sc.nextDouble();
 rectangle.setLength(length);
 
 System.out.print("Enter width: ");
 double width = sc.nextDouble();
 rectangle.setWidth(width);
 
 rectangle.getLength();
 rectangle.getWidth();
 
 sc.close();
 }
}

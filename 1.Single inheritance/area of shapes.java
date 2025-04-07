import java.util.Scanner;
class Shape{
 public void calculateArea(){
 System.out.println("The area has been calculating");
 }
}
class Rectangle extends Shape{
 int length,breadth;
 Rectangle(int length,int breadth){
 this.length=length;
 this.breadth=breadth;
 }
 public void getArea(){
 System.out.println("The area of rectangle is :"+(length*breadth));
 }
}
public class Main{
 public static void main(String [] args){
 Scanner obj = new Scanner(System.in);
 System.out.println("Enter length :");
 int length=obj.nextInt();
 System.out.println("Enter breadth :");
 int breadth=obj.nextInt();
 Shape myShape=new Shape();
 myShape.calculateArea();
 Rectangle myObj=new Rectangle(length,breadth);
 myObj.getArea();
 
 }}

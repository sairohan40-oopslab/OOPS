import java.util.Scanner;
class Vehicle {
 String make;
 int model, year, distance, maxspeed, efficiency;
 public Vehicle(String make, int model, int year, int distance, int maxspeed) {
 this.make = make;
 this.model = model;
 this.year = year;
 this.distance = distance;
 this.maxspeed = maxspeed;
 }
 public void special() {
 if (maxspeed != 0) { 
 efficiency = (distance / maxspeed) * 100;
 } else {
 efficiency = 0;
 }
 }
}
class Truck extends Vehicle {
 public Truck(String make, int model, int year, int distance, int maxspeed) {
 super(make, model, year, distance, maxspeed); 
 special();
 }
 public void displayTruckInfo() {
 System.out.println("--------@@@@---------");
 System.out.println("Make: " + make);
 System.out.println("Year: " + year);
 System.out.println("Model: " + model);
 System.out.println("The Speed of the Truck is: " + maxspeed);
 System.out.println("The distance travelled by truck is: " + distance);
 System.out.println("The efficiency is: " + efficiency + "%");
 System.out.println("----------------------");
 }
}
class Car extends Vehicle {
 Car(String make, int model, int year, int distance, int maxspeed) {
 super(make, model, year, distance, maxspeed); 
 special();
 }
 public void displayCarInfo() {
 System.out.println("--------@@@@---------");
 System.out.println("Make: " + make);
 System.out.println("Year: " + year);
 System.out.println("Model: " + model);
 System.out.println("The Speed of the Car is: " + maxspeed);
 System.out.println("The distance travelled by Car is: " + distance);
 System.out.println("The efficiency is: " + efficiency + "%");
 System.out.println("----------------------");
 }
}
public class Details {
 public static void main(String[] args) {
 Scanner obj = new Scanner(System.in);
 System.out.println("Enter the make of Truck:");
 String make = obj.nextLine();
 System.out.println("Enter the model of Truck:");
 int model = obj.nextInt();
 System.out.println("Enter the Year of Truck:");
 int year = obj.nextInt();
 System.out.println("Enter the maxspeed of Truck:");
 int maxspeed = obj.nextInt();
 System.out.println("Enter the distance travelled by Truck:");
 int distance = obj.nextInt();
 Truck obj1 = new Truck(make, model, year, distance, maxspeed);
 obj1.displayTruckInfo();
 Car obj2 = new Car(make, model, year, distance, maxspeed);
 obj2.displayCarInfo();
 }
}

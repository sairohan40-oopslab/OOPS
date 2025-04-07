class House {
 private String address;
 private int numberOfRooms;
 private double area;
 public House(String address, int numberOfRooms, double area) {
 this.address = address;
 this.numberOfRooms = numberOfRooms;
 this.area = area;
 }
 public String getAddress() {
 return address;
 }
 public void setAddress(String address) {
 this.address = address;
 }
 public int getNumberOfRooms() {
 return numberOfRooms;
 }
 public void setNumberOfRooms(int numberOfRooms) {
 this.numberOfRooms = numberOfRooms;
 }
 public double getArea() {
 return area;
 }
 public void setArea(double area) {
 this.area = area;
 }
 public double calculatePrice(double pricePerSquareMeter) {
 return area * pricePerSquareMeter;
 }
}
public class Main {
 public static void main(String[] args) {
 House house = new House("123 Main St", 3, 150.0);
 System.out.println("Address: " + house.getAddress());
 System.out.println("Number of Rooms: " + house.getNumberOfRooms());
 System.out.println("Area: " + house.getArea() + " sq. meters");
 double pricePerSquareMeter = 2000.0;
 double price = house.calculatePrice(pricePerSquareMeter);
 System.out.println("Price of the house: $" + price);
 }
}

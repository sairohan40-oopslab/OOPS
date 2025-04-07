class Home {
 public void display() {
 System.out.println("We are in the home ");
 }
}
class Apartment extends Home { public void display() System.out.println("We are in the apartment ") }}class 
Company extends Home { public void display() System.out.println("We are in the Company"); }}public class Room 
{ public static void main(String[] args) Home myHome = new Home() Home myApartment = new Apartment();
 Company myObj=new Company();
 myHome.display();
 myApartment.display();
 myObj.display();
 }}

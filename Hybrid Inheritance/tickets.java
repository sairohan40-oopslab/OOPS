class Ticket {
 protected double price;
 public Ticket(double price) {
 this.price = price;
 }
 public double getPrice() {
 return price;
 }
 public void displayTicketInfo() {
 System.out.println("Ticket Price: $" + price);
 }
}
class TrainTicket extends Ticket {
 private String trainNumber;
 public TrainTicket(double price, String trainNumber) {
 super(price);
 this.trainNumber = trainNumber;
 }
 public void displayTicketInfo() {
 super.displayTicketInfo();
 System.out.println("Train Number: " + trainNumber);
 }
}
class BusTicket extends Ticket {
 private String busNumber;
 public BusTicket(double price, String busNumber) {
 super(price);
 this.busNumber = busNumber;
 }
 public void displayTicketInfo() {
 super.displayTicketInfo();
 System.out.println("Bus Number: " + busNumber);
 }
}
class ACTicket extends TrainTicket {
 public ACTicket(double price, String trainNumber) {
 super(price, trainNumber);
 }
 public void displayTicketInfo() {
 System.out.println("AC Train Ticket:");
 super.displayTicketInfo();
 }
}
class SleeperTicket extends TrainTicket {
 public SleeperTicket(double price, String trainNumber) {
 super(price, trainNumber);
 }
 public void displayTicketInfo() {
 System.out.println("Sleeper Train Ticket:");
 super.displayTicketInfo();
 }
}
class ACBusTicket extends BusTicket {
 public ACBusTicket(double price, String busNumber) {
 super(price, busNumber);
 }
 public void displayTicketInfo() {
 System.out.println("AC Bus Ticket:");
 super.displayTicketInfo();
 }
}
class SleeperBusTicket extends BusTicket {
 public SleeperBusTicket(double price, String busNumber) {
 super(price, busNumber);
 }
 public void displayTicketInfo() {
 System.out.println("Sleeper Bus Ticket:");
 super.displayTicketInfo();
 }
}
public class TicketingSystem {
 public static void main(String[] args) {
 Ticket trainTicket = new TrainTicket(50.0, "12345");
 Ticket busTicket = new BusTicket(30.0, "54321");
 Ticket acTrainTicket = new ACTicket(80.0, "12345");
 Ticket sleeperTrainTicket = new SleeperTicket(60.0, "12345");
 Ticket acBusTicket = new ACBusTicket(40.0, "54321");
 Ticket sleeperBusTicket = new SleeperBusTicket(35.0, "54321");
 trainTicket.displayTicketInfo();
 System.out.println();
 busTicket.displayTicketInfo();
 System.out.println();
 acTrainTicket.displayTicketInfo();
 System.out.println();
 sleeperTrainTicket.displayTicketInfo();
 System.out.println();
 acBusTicket.displayTicketInfo();
 System.out.println();
 sleeperBusTicket.displayTicketInfo();
 }
}

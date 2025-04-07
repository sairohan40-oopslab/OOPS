class Payment {
 private String paymentId;
 private double amount;
 private String paymentMethod;
 private String currency;
 public Payment(String paymentId, double amount, String paymentMethod) {
 this.paymentId = paymentId;
 this.amount = amount;
 this.paymentMethod = paymentMethod;
 this.currency = "USD";
 }
 public Payment(String paymentId, double amount, String paymentMethod, String currency) {
 this.paymentId = paymentId;
 this.amount = amount;
 this.paymentMethod = paymentMethod;
 this.currency = currency;
 }
 public Payment(String paymentId, double amount) {
 this.paymentId = paymentId;
 this.amount = amount;
 this.paymentMethod = "Cash";
 this.currency = "USD";
 }
 public void displayPaymentDetails() {
 System.out.println("Payment ID: " + paymentId);
 System.out.println("Amount: " + amount);
 System.out.println("Payment Method: " + paymentMethod);
 System.out.println("Currency: " + currency);
 System.out.println("---------------------------");
 }
}
public class OnlinePaymentSystem {
 public static void main(String[] args) {
 Payment creditCardPayment = new Payment("CC123", 150.00, "Credit Card");
 creditCardPayment.displayPaymentDetails();
 Payment bankTransferPayment = new Payment("BT456", 200.00, "Bank Transfer", "EUR");
 bankTransferPayment.displayPaymentDetails();
 Payment cashPayment = new Payment("C789", 50.00);
 cashPayment.displayPaymentDetails();
 }
}

class DeliveryItem { 
 private double basePrice; 
 public void setBasePrice(double basePrice) { 
 this.basePrice = basePrice; 
 } 
 public double getBasePrice() { 
 return basePrice; 
 } 
 public void calculatePrice() { 
 System.out.println("Price of Regular Delivery Item: " + basePrice); 
 } 
} 
class ExpressDeliveryItem extends DeliveryItem { 
 private double expressFee; 
 public void setExpressFee(double expressFee) { 
 this.expressFee = expressFee; 
 } 
 public void calculatePrice() { 
 double totalPrice = getBasePrice() + expressFee; 
 System.out.println("Price of Express Delivery Item: " + totalPrice); 
 } 
} 
public class Delivery { 
 public static void main(String[] args) { 
 DeliveryItem regularItem = new DeliveryItem(); 
 regularItem.setBasePrice(100.0); 
 ExpressDeliveryItem expressItem = new ExpressDeliveryItem();
 expressItem.setBasePrice(100.0); 
 expressItem.setExpressFee(20.0); 
 regularItem.calculatePrice(); 
 expressItem.calculatePrice(); 
 } 
}

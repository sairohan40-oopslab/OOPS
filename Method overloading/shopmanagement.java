class Shop {
 public void calculateTotalPrice(double price, int quantity) {
 double total = price * quantity;
 System.out.println("Total Price (without discount): " + total);
 }
 public void calculateTotalPrice(double price, int quantity, double discount) {
 double total = price * quantity;
 total=total- (total * discount / 100);
 System.out.println("Total Price (with discount): " + total);
 }
 public void calculateTotalPrice(double price, int quantity, double discount, double tax) {
 double total = price * quantity;
 total=total- (total * discount / 100);
 total=total+ (total * tax / 100);
 System.out.println("Total Price (with discount and tax): " + total);
 }
}
public class ShopLite {
 public static void main(String[] args) {
 Shop shop = new Shop();
 double price1 = 100.0;
 int quantity1 = 2;
 double discount1 = 10.0;
 double tax1 = 5.0;
 shop.calculateTotalPrice(price1, quantity1);
 shop.calculateTotalPrice(price1, quantity1, discount1);
 shop.calculateTotalPrice(price1, quantity1, discount1, tax1);
 }
}

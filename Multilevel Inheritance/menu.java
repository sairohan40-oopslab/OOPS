class RestaurantItem {
 String name;
 double price;
 public RestaurantItem(String name, double price) {
 this.name = name;
 this.price = price;
 }
 public void display() {
 System.out.println("Item: " + name + ", Price: ₹" + price);
 }
}
class Starters extends RestaurantItem {
 public Starters(String name, double price) {
 super(name, price);
 }
 public void display() {
 System.out.println("----------###----------");
 System.out.println("Starter: " + name + ", Price: ₹" + price);
 System.out.println("-----------------------");
 }
 public static void displayStarters() {
 Starters starter1 = new Starters("Garlic Bread", 120);
 Starters starter2 = new Starters("Bruschetta", 100);
 Starters starter3 = new Starters("Stuffed Mushrooms", 70);
 Starters starter4 = new Starters("Spring Rolls", 90);
 starter1.display();
 starter2.display();
 starter3.display();
 starter4.display();
 }
}
class MainItems extends RestaurantItem {
 public MainItems(String name, double price) {
 super(name, price);
 }
 public void display() {
 System.out.println("----------###----------");
 System.out.println("Main Item: " + name + ", Price: ₹" + price);
 System.out.println("----------------------");
 }
 public static void displayMainItems() {
 MainItems mainItem1 = new MainItems("Grilled Chicken",140);
 MainItems mainItem2 = new MainItems("Pasta Primavera", 210);
 MainItems mainItem3 = new MainItems("Beef Steak", 349);
 MainItems mainItem4 = new MainItems("Vegetable Curry", 100);
 mainItem1.display();
 mainItem2.display();
 mainItem3.display();
 mainItem4.display();
 }
}
class Desserts extends RestaurantItem {
 public Desserts(String name, double price) {
 super(name, price);
 }
 public void display() {
 System.out.println("----------###----------");
 System.out.println("Dessert: " + name + ", Price: ₹" + price);
 System.out.println("-----------------------");
 }
 public static void displayDesserts() {
 Desserts dessert1 = new Desserts("Chocolate Cake", 60);
 Desserts dessert2 = new Desserts("Ice Cream Sundae", 80);
 Desserts dessert3 = new Desserts("Fruit Tart", 30);
 Desserts dessert4 = new Desserts("Cheesecake", 60);
 dessert1.display();
 dessert2.display();
 dessert3.display();
 dessert4.display();
 }
}
class Drinks extends RestaurantItem {
 public Drinks(String name, double price) {
 super(name, price);
 }
 public void display() {
 System.out.println("----------###----------");
 System.out.println("Drink: " + name + ", Price: ₹" + price);
 System.out.println("-----------------------");
}
 public static void displayDrinks() {
 Drinks drink1 = new Drinks("Coke", 76);
 Drinks drink2 = new Drinks("Lemonade", 89);
 Drinks drink3 = new Drinks("Iced Tea", 200);
 Drinks drink4 = new Drinks("Water", 20);
 drink1.display();
 drink2.display();
 drink3.display();
 drink4.display();
 }
}
public class RestaurantMenu {
 public static void main(String[] args) {
 Starters.displayStarters();
 MainItems.displayMainItems();
 Desserts.displayDesserts();
 Drinks.displayDrinks();
 }
}

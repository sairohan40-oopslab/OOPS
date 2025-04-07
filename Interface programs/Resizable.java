interface Resizable {
 void resizeWidth(int width);
 void resizeHeight(int height);
}
class Rectangle implements Resizable {
 private int width;
 private int height;
 public Rectangle(int width, int height) {
 this.width = width;
 this.height = height;
 }
 public void resizeWidth(int width) {
 if (width > 0) {
 this.width = width;
 System.out.println("Width resized to: " + this.width);
 } else {
 System.out.println("Invalid width value");
 }
 }
 public void resizeHeight(int height) {
 if (height > 0) {
 this.height = height;
 System.out.println("Height resized to: " + this.height);
 } else {
 System.out.println("Invalid height value");
 }
 }
 public void display() {
 System.out.println("Rectangle Dimensions: Width = " + width + ", Height = " + height);
 }
 public static void main(String[] args) {
 Rectangle rect = new Rectangle(10, 20);
 rect.display();
 rect.resizeWidth(30);
 rect.resizeHeight(40);
 rect.display();
 }}

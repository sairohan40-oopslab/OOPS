class OddNumberException extends Exception {
 public OddNumberException(String message) {
 super(message);
 }
}
public class Main {
 public static void main(String[] args) {
 try {
 checkNumber(5); 
 } catch (OddNumberException e) {
 System.out.println("Exception caught: " + e.getMessage());
 }
 }
 public static void checkNumber(int number) throws OddNumberException {
 if (number % 2 != 0) {
 throw new OddNumberException("The number " + number + " is odd.");
 } else {
 System.out.println("The number " + number + " is even.");
 }
 }
}

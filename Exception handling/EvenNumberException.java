class EvenNumberException extends Exception {
 public EvenNumberException(String message) {
 super(message);
 }
}
public class Main {
 public static void main(String[] args) {
 try {
 checkNumber(4); // Change this number to test different cases
 } catch (EvenNumberException e) {
 System.out.println("Exception caught: " + e.getMessage());
 }
 }
 public static void checkNumber(int number) throws EvenNumberException {
 if (number % 2 == 0) {
 throw new EvenNumberException("The number " + number + " is divisible by 2.");
 } else {
 System.out.println("The number " + number + " is not divisible by 2.");
 }
 }
}

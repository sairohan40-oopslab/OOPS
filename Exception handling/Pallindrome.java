class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
 super(message);
 }
}
public class Main {
 public static void main(String[] args) {
 String input = "madam"; 
 try {
 checkPalindrome(input);
 System.out.println(input + " is a palindrome.");
 } catch (InvalidInputException e) {
 System.out.println("Exception caught: " + e.getMessage());
 }
 }
 public static void checkPalindrome(String str) throws InvalidInputException {
 if (str == null || str.isEmpty()) {
 throw new InvalidInputException("Input string is null or empty.");
 }
 String reversedStr = new StringBuilder(str).reverse().toString();
 if (!str.equals(reversedStr)) {
 throw new InvalidInputException(str + " is not a palindrome.");
 }
 }
}

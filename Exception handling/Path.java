import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
class NegativeNumberException extends Exception {
 public NegativeNumberException(String message) {
 super(message);
 }
}
public class Main {
 public static void main(String[] args) {
 String filePath = "numbers.txt"; 
 try {
 checkNumbers(filePath);
 System.out.println("All numbers are non-negative.");
 } catch (NegativeNumberException e) {
 System.out.println("Exception caught: " + e.getMessage());
 } catch (IOException e) {
 System.out.println("An error occurred while reading the file: " + e.getMessage());
 }
 }
 public static void checkNumbers(String filePath) throws NegativeNumberException, IOException {
 Path path = Paths.get(filePath);
 
 if (Files.notExists(path)) {
 throw new IOException("File does not exist.");
 }
 List<String> lines = Files.readAllLines(path);
 
 for (String line : lines) {
 try {
 int number = Integer.parseInt(line.trim());
 if (number < 0) {
 throw new NegativeNumberException("Negative number found: " + number);
 }
 } catch (NumberFormatException e) {
 System.out.println("Invalid number format: " + line);
 }
 }
 }}

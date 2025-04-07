import java.io.FileWriter;
import java.io.IOException;
public class Main {
 public static void main(String[] args) {
 try (FileWriter writer = new FileWriter("example.txt")) {
 writer.write("Hello, this is a sample file.\n");
 writer.write("Java File Handling Example.\n");
 System.out.println("File created and written successfully.");
 } catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }
}

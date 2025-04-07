import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
 public static void main(String[] args) {
 String sourceFile = "example.txt";
 String destinationFile = "copy_example.txt";
 try {
 FileReader reader = new FileReader(sourceFile);
 FileWriter writer = new FileWriter(destinationFile);
 int ch;
 while ((ch = reader.read()) != -1) {
 writer.write(ch);
 }
 reader.close();
 writer.close();
 System.out.println("File copied successfully.");
 } catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }
}

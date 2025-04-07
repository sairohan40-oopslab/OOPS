import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 try {
 File file = new File("example.txt");
 Scanner reader = new Scanner(file);
 while (reader.hasNextLine()) {
 System.out.println(reader.nextLine());
 }
 reader.close();
 } catch (FileNotFoundException e) {
 System.out.println("File not found.");
 e.printStackTrace();
 }
 }
}

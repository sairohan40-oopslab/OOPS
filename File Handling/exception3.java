import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 try {
 File file = new File("example.txt");
 Scanner reader = new Scanner(file);
 int wordCount = 0;
 while (reader.hasNextLine()) {
 String line = reader.nextLine();
 String[] words = line.split("\\s+");
 wordCount += words.length;
 }
 reader.close();
 System.out.println("Total words in file: " + wordCount);
 } catch (FileNotFoundException e) {
 System.out.println("File not found.");
 e.printStackTrace();
 }
 }
}

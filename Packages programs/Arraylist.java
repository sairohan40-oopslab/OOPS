import java.util.ArrayList;
public class Main {
 public static void main(String[] args) {
 ArrayList<String> names = new ArrayList<>();
 names.add("Alice");
 names.add("Bob");
 names.add("Charlie");
 System.out.println("Names in the list:");
 for (String name : names) {
 System.out.println(name);
 }
 }
}

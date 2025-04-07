import java.util.Scanner;
public class ReverseMultiplicationTable
{ public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
System.out.print("Enter the range: ");
int range = scanner.nextInt();
System.out.println("Multiplication Table of " + num + " in Reverse Order:");
for (int i = range; i >= 1; i--) {
System.out.println(num + " x " + i + " = " + (num * i));
}
scanner.close();
}
}

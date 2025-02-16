import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid four-digit number.");
        } else {
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;  // Get the last digit
                temp /= 10;        // Remove the last digit
            }
            System.out.println("Sum of digits: " + sum);
        }

        scanner.close();
    }
}

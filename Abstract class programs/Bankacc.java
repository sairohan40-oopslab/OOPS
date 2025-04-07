abstract class BankAccount {
 double balance;
 public BankAccount(double balance) {
 this.balance = balance;
 }
 abstract void deposit(double amount);
 abstract void withdraw(double amount);
 public void displayBalance() {
 System.out.println("Current balance: " + balance);
 }
}
class SavingsAccount extends BankAccount {
 private static final double MIN_BALANCE = 500;
 public SavingsAccount(double balance) {
 super(balance);
 }
 public void deposit(double amount) {
 balance += amount;
 System.out.println("Deposited " + amount + " in Savings Account.");
 }
 public void withdraw(double amount) {
 if (balance - amount >= MIN_BALANCE) {
 balance -= amount;
 System.out.println("Withdrew " + amount + " from Savings Account.");
 } else {
 System.out.println("Insufficient balance. Minimum balance must be maintained.");
 }
 }
}
class CurrentAccount extends BankAccount {
 private static final double OVERDRAFT_LIMIT = 1000;
 public CurrentAccount(double balance) {
 super(balance);
 }
 public void deposit(double amount) {
 balance += amount;
 System.out.println("Deposited " + amount + " in Current Account.");
 }
 public void withdraw(double amount) {
 if (balance - amount >= -OVERDRAFT_LIMIT) {
 balance -= amount;
 System.out.println("Withdrew " + amount + " from Current Account.");
 } else {
 System.out.println("Overdraft limit exceeded. Cannot withdraw.");
 }
 }
}
public class Main {
 public static void main(String[] args) {
 BankAccount savings = new SavingsAccount(1000);
 savings.deposit(500);
 savings.withdraw(800);
 savings.displayBalance();
 BankAccount current = new CurrentAccount(500);
 current.deposit(1000);
 current.withdraw(1800);
 current.displayBalance();
 }
}

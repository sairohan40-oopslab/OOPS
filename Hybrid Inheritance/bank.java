class Bank {
 String bankName;
 public Bank(String bankName) {
 this.bankName = bankName;
 }
 public void displayBankInfo() {
 System.out.println("Bank Name: " + bankName);
 }
}
class SavingsAccount extends Bank {
 double interestRate;
 public SavingsAccount(String bankName, double interestRate) {
 super(bankName);
 this.interestRate = interestRate;
 }
 public void displaySavingsInfo() {
 System.out.println("Savings Account at " + bankName + " with Interest Rate: " + interestRate + "%");
 }
}
class CurrentAccount extends Bank {
 double overdraftLimit;
 public CurrentAccount(String bankName, double overdraftLimit) {
 super(bankName);
 this.overdraftLimit = overdraftLimit;
 }
 public void displayCurrentInfo() {
 System.out.println("Current Account at " + bankName + " with Overdraft Limit: ₹" + overdraftLimit);
 }
}
class LoanAccount extends SavingsAccount {
 double loanAmount;
 public LoanAccount(String bankName, double interestRate, double loanAmount) {
 super(bankName, interestRate);
 this.loanAmount = loanAmount;
 }
 public void displayLoanInfo() {
 System.out.println("Loan Account at " + bankName + " with Loan Amount: ₹" + loanAmount + " and Interest Rate: 
" + interestRate + "%");
 }
}
public class BankTest {
 public static void main(String[] args) {
 SavingsAccount savings = new SavingsAccount("SBI Bank", 4.5);
 savings.displayBankInfo();
 savings.displaySavingsInfo();
 CurrentAccount current = new CurrentAccount("HDFC Bank", 5000);
 current.displayBankInfo();
 current.displayCurrentInfo();
 LoanAccount loan = new LoanAccount("icici Bank", 5.0, 200000);
 loan.displayBankInfo();
 loan.displaySavingsInfo();
 loan.displayLoanInfo();
 }
}

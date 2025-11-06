abstract class Account {
protected String accountNumber;
protected double balance;
public Account(String accountNumber, double initialBalance) {
this.accountNumber = accountNumber;
this.balance = initialBalance;
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited $" + amount + ". New balance is $" + balance);
}
}
public abstract void withdraw(double amount);
public double getBalance() {
return balance;
}
}
class SavingsAccount extends Account {
public SavingsAccount(String accountNumber, double initialBalance) {
super(accountNumber, initialBalance);
}
@Override
public void withdraw(double amount) {
if (amount > 0 && balance >= amount) {
balance -= amount;
System.out.println("SUCCESS: Withdrew $" + amount + " from Savings. New balance: $" + balance);
} else {
System.out.println("FAILED: Insufficient funds in Savings Account.");
}
}
}
class CurrentAccount extends Account {
private double overdraftLimit;
public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
super(accountNumber, initialBalance);
this.overdraftLimit = overdraftLimit;
}
@Override
public void withdraw(double amount) {
if (amount > 0 && balance + overdraftLimit >= amount) {
balance -= amount;
System.out.println("SUCCESS: Withdrew $" + amount + " from Current. New balance: $" + balance);
} else {
System.out.println("FAILED: Overdraft limit exceeded in Current Account.");
}
}
}
public class Prog4 {
public static void main(String[] args) {
Account mySavings = new SavingsAccount("S101", 1000.0);
Account myCurrent = new CurrentAccount("C202", 500.0, 200.0);
System.out.println("--- Starting Balances ---");
System.out.println("Savings Balance: $" + mySavings.getBalance());
System.out.println("Current Balance: $" + myCurrent.getBalance());
System.out.println("------------------------- \n");
System.out.println("--- Attempting to withdraw $800 from each account... ---");
mySavings.withdraw(800);
myCurrent.withdraw(800);
System.out.println("\n--- Attempting to withdraw $600 from the current account... ---");
myCurrent.withdraw(600);
System.out.println("\n--- Final Balances ---");
System.out.println("Savings Balance: $" + mySavings.getBalance());
System.out.println("Current Balance: $" + myCurrent.getBalance());
System.out.println("--------------------");
}
}
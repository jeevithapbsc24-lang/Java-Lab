import java.util.Scanner;

class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance) throw new LowBalanceException("Not enough balance!");
            balance -= amount;
            System.out.println("Withdrawal successful! Balance: " + balance);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
package edu.bank;
interface Loan {
    double calculateInterest();
}

class HomeLoan implements Loan {
    private double principal;
    private double rate;
    private int years;

    public HomeLoan(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Calculating interest for Home Loan...");
        return principal * (rate / 100) * years;
    }
}

class CarLoan implements Loan {
    private double principal;
    private double rate;
    private int years;
    private static final double PROCESSING_FEE = 50.0;

    public CarLoan(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Calculating interest for Car Loan...");
        return (principal * (rate / 100) * years) + PROCESSING_FEE;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Loan System!");

        Loan myHomeLoan = new HomeLoan(50000, 7.5, 20);
        Loan myCarLoan = new CarLoan(15000, 9.0, 5);

        System.out.println("---------------------------------");

        double homeInterest = myHomeLoan.calculateInterest();
        System.out.println("Total interest for Home Loan: $" + homeInterest);

        System.out.println("---------------------------------");

        double carInterest = myCarLoan.calculateInterest();
        System.out.println("Total interest for Car Loan: $" + carInterest);
    }
}
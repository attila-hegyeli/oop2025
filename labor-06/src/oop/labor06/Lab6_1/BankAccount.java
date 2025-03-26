package oop.labor06.Lab6_1;

public class BankAccount {
    public static final String PREFIX = "BT";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts;
    private final String AccountNumber;
    private double balance;

    public BankAccount() {
        ++numAccounts;
        AccountNumber = createAccountNumber();

    }

    private static String createAccountNumber() {
        /// %08d 8 krakter egy reszet
        return PREFIX + String.format("%08d", numAccounts);
    }


    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

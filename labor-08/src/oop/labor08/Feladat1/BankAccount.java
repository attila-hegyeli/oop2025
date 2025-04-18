package oop.labor08.Feladat1;

public class BankAccount {
    public final static String PREFIX="OTP";
    public final static int ACCOUNT_NUMBER_LENGTH=8;
    private static int numAccounts;
    protected final String accountNumber;
    protected double balance;
    protected BankAccount()
    {
        numAccounts++;
        this.accountNumber=createAccountNumber();
        this.balance=0;

    }
    private static String createAccountNumber() {
        /// %08d 8 krakter egy reszet
        return PREFIX + String.format("%08d", numAccounts);
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public boolean withdraw(double amount)
    {
        if(amount>balance)
        {
            return false;
        }
        balance-=amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

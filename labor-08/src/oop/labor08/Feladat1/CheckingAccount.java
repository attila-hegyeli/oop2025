package oop.labor08.Feladat1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;
    public CheckingAccount(double overdraftLimit)
    {
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double amount)
    {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }

}

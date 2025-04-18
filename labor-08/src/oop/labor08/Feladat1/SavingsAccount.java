package oop.labor08.Feladat1;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(double interestRate)
    {
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterest()
    {
        balance= balance+(balance*0.02);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}

package oop.labor06.Lab6_1;

import java.util.ArrayList;

public class Customer {
    private static int numCustomers;
    /// also pont statik
    /// felso pont final
    private final int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts= new ArrayList<>();
    public Customer(String firstName,String lastName){
        id=++numCustomers;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getId() {
        return id;
    }
    public int getNumAccounts() {
        return accounts.size();
    }
    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for (BankAccount account : accounts)
        {
                accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public BankAccount getAccount(String account){
        for (BankAccount acc : accounts){
            if(acc.getAccountNumber().equals(account)){
                return acc;
            }
        }
        return null;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(String account)
    {
        for (BankAccount acc:accounts)
        {
            if(acc.getAccountNumber().equals(account))
            {
                accounts.remove(acc);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}

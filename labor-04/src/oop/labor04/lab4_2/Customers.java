package oop.labor04.lab4_2;

import javax.lang.model.type.MirroredTypeException;
import java.util.ArrayList;

public class Customers {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        for (BankAccount item : accounts)
        {
            if(account.getAccountNumber()==item.getAccountNumber())
            {
                return;
            }
        }
        accounts.add(account);

    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount item : accounts)
        {
            if(item.getAccountNumber()==accountNumber)
            {
                return item;
            }
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber) {
        for(BankAccount items : accounts)
        {
            if(items.getAccountNumber()== accountNumber){
                accounts.remove(items);
                break;
            }
        }
    }



    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (BankAccount items : accounts)
        {
            result.append(accounts.toString()).append("\n");
        }
        return result.toString();
    }
}
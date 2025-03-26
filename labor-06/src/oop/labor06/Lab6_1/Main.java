package oop.labor06.Lab6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1);
        BankAccount account2 = new BankAccount();
        System.out.println(account2);
        Customer customer1=new Customer("Hegyeli","Attila");
        System.out.println(customer1);
        customer1.addAccount(account1);
        System.out.println(customer1);
        account1.deposit(1000);
        System.out.println(customer1);
        Bank bank = new Bank("OTP");
        bank.add
    }
}

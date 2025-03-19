package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customers> customersList = new ArrayList<>();
        Customers currentCustomer = null;

        // Reading from CSV file
        try (Scanner scanner = new Scanner(new File("lab4_2_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split(",");
                String type = items[0].trim(); // Customer or Account

                // Handle Customer line
                if (type.equals("Customer")) {
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    currentCustomer = new Customers(firstName, lastName);
                    customersList.add(currentCustomer);
                }

                // Handle Account line
                if (type.equals("Account") && currentCustomer != null) {
                    String accountNumber = items[1].trim();
                    double balance = Double.parseDouble(items[2].trim());
                    BankAccount bankAccount = new BankAccount(accountNumber, balance);
                    currentCustomer.addAccount(bankAccount);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Display the customers and their accounts
        for (Customers customer : customersList) {
            System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println(customer.toString());
        }

        // Example: Perform account operations
        if (!customersList.isEmpty()) {
            Customers customer = customersList.get(0); // First customer for demonstration
            BankAccount accountToTest = customer.getAccount("OTP1");
            if (accountToTest != null) {
                System.out.println("Found account: " + accountToTest);
                accountToTest.deposit(200.0);
                System.out.println("After deposit: " + accountToTest);
                boolean success = accountToTest.withdraw(500.0);
                if (success) {
                    System.out.println("Withdrawal successful! New balance: " + accountToTest.getBalance());
                } else {
                    System.out.println("Insufficient balance for withdrawal.");
                }
            }
        }
    }
}
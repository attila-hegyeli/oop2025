package oop.labor04.lab4_2;
    public class BankAccount {
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public double getBalance(){
            return balance;
        }
        public String getAccountNumber(){
            return accountNumber;
        }

        public void deposit(double amount){
            if(amount > 0)
            {
                balance += amount;
            }

        }
        public boolean withdraw(double amount){
            if(amount > balance)
            {
                return false;
            }
            balance -= amount;
            return true;
        }
        public String toString(){
            return "Bank: {"+ this.accountNumber +", "+ this.balance+"}";
        }
    }


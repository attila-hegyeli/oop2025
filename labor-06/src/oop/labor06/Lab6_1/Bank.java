package oop.labor06.Lab6_1;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(String name){
        this.name=name;
    }
    public Customer getCustomer(int custome){
        for (Customer cust : customers)
        {
            if(cust.getId()==custome)
            {
                return cust;
            }
        }
        return null;
    }
}

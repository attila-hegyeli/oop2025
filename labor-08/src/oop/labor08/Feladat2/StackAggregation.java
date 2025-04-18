package oop.labor08.Feladat2;

import java.util.ArrayList;
import java.util.Objects;

public class StackAggregation {
    private ArrayList<Object> items;
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>(capacity); /// fix akkora lesz a meret mint a capacity
    }

    public boolean isFull() {
        return this.capacity == items.size();
    }

    public void push(Object object) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {

            items.add(object);
        }
    }
    public boolean isEmpty()
    {
        return items.isEmpty();
    }
    public Object top()
    {
        if (isEmpty()){
            System.out.println("The stack is empty!");
            return null;
        }
        return items.getLast();
    }
    public void pop(){
        if (isEmpty())
        {
            System.out.println("The stack is empty!");
            return;
        }
        items.removeLast();
    }

}
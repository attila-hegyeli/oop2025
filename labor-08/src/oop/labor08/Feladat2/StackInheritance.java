package oop.labor08.Feladat2;


import java.util.ArrayList;

public class StackInheritance  extends ArrayList {
    private final int capacity;
    public StackInheritance(int capacity)
    {
        super(capacity);
        this.capacity= capacity;
    }
    public boolean isFull()
    {
        return this.size()==capacity;
    }
    public boolean isEmpty()
    {
        return super.isEmpty();
    }
    public void push(Object object){
        if(isFull())
        {
            System.out.println("the stack is full");
            return;
        }
        super.add(object);
    }
    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("the stack is empty");
            return;
        }
        super.removeLast();
    }
    public Object top()
    {
        if(isEmpty())
        {
            System.out.println("the stack is full");
            return null;
        }
        return super.getLast();
    }

}

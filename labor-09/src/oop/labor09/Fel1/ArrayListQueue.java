package oop.labor09.Fel1;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {
    private final int capacity;
    private ArrayList<Object> items;

    public ArrayListQueue(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>(capacity);
    }

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.items.size()==capacity;
    }

    @Override
    public void enQueue(Object o) {
        if (this.isFull()){
            System.out.println("A Sor tele van! Nem tudsz hozza adni tobb erteket!");
            return;
        }
        this.items.add(o);
    }

    @Override
    public Object deQueue() {
        if(this.isEmpty()){
            System.out.println("A Sor ures! Nem tudsz tobb elemet kivenni!");
            return null;
        }
        return this.items.removeFirst();
    }

    @Override
    public void printQueue() {
        System.out.print("[");
        for( Object o : this.items)
        {
            System.out.print(o+" ");
        }
        System.out.println("]");
    }
    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof ArrayListQueue)) return false;
        ArrayListQueue q = (ArrayListQueue) o;
        if (q.items.size() != this.items.size()){
            return false;
        }
        for (int i = 0; i < q.items.size(); i++) {
            if (!this.items.get(i).equals(q.items.get(i)))
            {
                return false;
            }
        }
        return true;
    }
}

package oop.labor12.lab12_fel1;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private Map<String, Double> marks = new HashMap<>();
    private double average;

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void addMark(String subject, double mark) {
        marks.put(subject, mark);
    }

    public double getMark(String subject) {
        return marks.getOrDefault(subject,0.0);
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getAverage() {
        return average;
    }

    public void calculateAverage() {
        double sum = 0 ;
        for (double mark : marks.values())
        {
            sum+=mark;
        }
        average =  sum/marks.size();
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", marks=" + marks +
                ", average=" + average +
                '}';
    }


}

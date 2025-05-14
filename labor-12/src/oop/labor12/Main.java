package oop.labor12;

import oop.labor12.lab12_fel1.Bac;
import oop.labor12.lab12_fel1.Student;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student(1,"Hegyeli","Attila");
//        student.addMark("matek",8.90);
//        student.addMark("roman",5.20);
//        student.addMark("tortenelem",6.20);
//        System.out.println(student);
        Bac bac = new Bac();
        int atmeno=0;
        for (Integer i: bac.getStudents().keySet()) {
            Student student =
            student.calculateAverage();
            System.out.println(student);
            if(student.getAverage()>=6 && student.getMark("magyar")>=5 && student.getMark("matek")>=5&& student.getMark("roman")>=5)
            {
                ++atmeno;
            }

        }
        System.out.println("Students passsed out :"+atmeno);


    }
}

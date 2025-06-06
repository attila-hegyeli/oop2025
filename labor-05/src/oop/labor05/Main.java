package oop.labor05;

import oop.labor05.Courses.Course;
import oop.labor05.Student.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /// Main
    public static void main(String[] args) {
        /// egy objektum letrehozasa egy csv fajlnak
        ArrayList<Course> courses = readCourses("courses.csv");
        ///kiiratom a fajl tartalmat
        for (Course c : courses)
        {
            System.out.println(c);
        }
        System.out.println("\n");
        ///egy objektum a diakoknak a csv fajlbol
        ArrayList<Student> students = readStudent("students.csv");
        ///kiiratom a diakokat
        for (Student s : students)
        {
            System.out.println(s);
        }
    }
    /// egy ArrayList ami fajl nevet kap
    private static ArrayList<Course> readCourses(String filename)
    {
        /// objektum
        ArrayList<Course> courses = new ArrayList<>();
        /// Fajl beolvasas!
        try (Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()) {
                /// line lesz a sor
                String line = scanner.nextLine();
                /// sor darabolas
                String[] arr;
                arr = line.split(",");
                ///  egy int szam kezelese a bemenetbol
                int numHours;
                /// a trim kiszedi a szokozoket
                numHours = Integer.parseInt(arr[2].trim());
                /// hozzaadtuk egy sor adatot a tombhoz
                Course course = new Course(arr[0].trim(),arr[1].trim(),numHours);
                courses.add(course);
            }

        }
        catch (FileNotFoundException e) {
            ///ha a fajl nem nyitodna meg
            e.printStackTrace();
        }
        /// visszateriti a sort
        return courses;
    }
    private static ArrayList<Student> readStudent(String filename)
    {
        /// objektum
        ArrayList<Student> students = new ArrayList<>();
        /// Fajl beolvasas!
        try (Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()) {
                /// line lesz a sor
                String line = scanner.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                /// sor darabolas
                String[] arr;
                arr = line.split(",");
                /// hozzaadtuk egy sor adatot a tombhoz
                Student student = new Student(arr[0].trim(),arr[1].trim(),arr[2].trim());
                students.add(student);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /// visszateriti a sort
        return students;
    }

}

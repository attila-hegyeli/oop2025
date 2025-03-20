package oop.labor05;

import oop.labor05.Courses.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for (Course c : courses)
        {
            System.out.println(c);
        }
    }
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
            e.printStackTrace();
        }
        /// visszateriti a sort
        return courses;
    }
}

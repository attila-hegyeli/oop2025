package oop.labor12.lab12_fel1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer, Student> students=new HashMap<>();
    private String[] subjects = {"magyar", "matek", "roman"};

    public Bac() {
            readNames();
            for (String s : subjects)
            {
                readSubject(s);
            }
    }

    private void readNames() {
        try (Scanner scanner = new Scanner(new File("nevek1.txt"))) {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                Student put = students.put(id, new Student(id, items[1].trim(), items[2].trim()));

            }
            System.out.println("Number of students: " + students.size());

        } catch (FileNotFoundException e) {
            System.out.println("A fajl nem letezik");
            //System.exit(1);
            e.printStackTrace();
        }
    }

    private void readSubject(String subject) {
        String filename = subject + ".txt";
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                Double mark = Double.parseDouble(items[1].trim());
                students.get(id).addMark(subject,mark);
            }

        } catch (FileNotFoundException e) {
            System.out.println("A fajl nem letezik");
            //System.exit(1);
            e.printStackTrace();
        }
    }
    public Map<Integer, Student> getStudents() {
        return students;
    }

}

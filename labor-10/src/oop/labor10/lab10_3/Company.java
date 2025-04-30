package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        for (Employee employee1 : employees) {
            if (employee1.getID() == employee.getID()) {
                System.out.println("Mar szerepel! ");
                return;
            }
        }
        employees.add(employee);
        System.out.println("Sikeres felvetel!");
    }
    public void hireAll(String csvFile)
    {
        try (Scanner scanner = new Scanner(new File(csvFile))){
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                String[]array=line.split(",");
                if (array.length < 6) {
                    System.err.println("Hibás sor: " + line);
                    continue;
                }
                String firstName = array[0].trim();
                String lastName = array[1].trim();
                int salary = Integer.parseInt(array[2].trim());
                int year = Integer.parseInt(array[3].trim());
                int month = Integer.parseInt(array[4].trim());
                int day = Integer.parseInt(array[5].trim());
                MyDate birthdate = new MyDate(year,month,day);
                if (array.length==6)
                {
                    Employee employee = new Employee(firstName,lastName,salary,birthdate);
                    employees.add(employee);
                }
                if (array.length == 7)
                {

                }
                if (array.length > 8)
                {
                    System.err.println("Hibás sor: " + line);
                    continue;
                }
            }

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

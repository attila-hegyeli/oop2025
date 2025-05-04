package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TesztVallalat");

        // Kézzel felveszünk néhány dolgozót
        company.hire(new Employee("Janos", "Kovacs", 3000, new MyDate(1985, 5, 15)));
        company.hire(new Manager("Anna", "Nagy", 4500, new MyDate(1980, 3, 10), "IT"));
        company.hire(new Employee("Bela", "Szabo", 2800, new MyDate(1990, 7, 22)));

        // Beolvasás fájlból
        company.hireAll("employees.csv");  // Ügyelj rá, hogy ez a fájl létezzen

        // Rendezés vezetéknév + fizetés szerint
        company.sortByComparator(
                Comparator.comparing(Employee::getLastName)
                        .thenComparing(Employee::getSalary)
        );

        // Kiírás konzolra
        System.out.println("Összes dolgozó:");
        company.printAll(System.out);

        // Csak menedzserek
        System.out.println("\nMenedzserek:");
        company.printManagers(System.out);

//        // Kiírás fájlba
//        try {
//            PrintStream fileOut = new PrintStream("dolgozok_kimenet.txt");
//            company.printAll(fileOut);
//            fileOut.close();
//            System.out.println("\nKiírva a 'dolgozok_kimenet.txt' fájlba.");
//        } catch (FileNotFoundException e) {
//            System.err.println("Hiba a fájl kiírásakor: " + e.getMessage());
//        }

        // Kirúgunk egy dolgozót (pl. ID = 2)
        company.fire(2);
        System.out.println("\nAz ID=2 azonosítójú dolgozó törölve.");
    }
}

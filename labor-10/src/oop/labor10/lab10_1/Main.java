package oop.labor10.lab10_1;

public class Main {
    public static void main(String[] args) {
        SortingDemo demo = new SortingDemo("fruits.txt");
        System.out.println("Originial Data: ");
        demo.printFruits();
        System.out.println("alphabetically sorted data");
        demo.sortAlphabetically();
        demo.printFruits();
        System.out.println("alphabetically reverse sorted data");
        demo.sortReversedAlphabetically();
        demo.printFruits();
    }

}


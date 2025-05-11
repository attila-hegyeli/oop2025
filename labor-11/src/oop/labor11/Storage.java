package oop.labor11;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    ArrayList<Product> products = new ArrayList<>();

    public Storage(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] data = line.split(" ");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int amount = Integer.parseInt(data[2].trim());
                int price = Integer.parseInt(data[3].trim());
                products.add(new Product(id, name, amount, price));
            }
            Collections.sort(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int Update(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] updateData = line.split(" ");
                int id = Integer.parseInt(updateData[0].trim());
                int newAmount = Integer.parseInt(updateData[1].trim());

                int index = binarySearch(products,0,products.size()-1,id);
                if(index != -1) {
                    products.get(index).increaseAmount(newAmount);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int binarySearch(ArrayList<Product> products, int l, int r, int id) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (products.get(m).getId() == id) {
                return m;
            }
            if (products.get(m).getId() < id) {
                l = m + 1;

            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}

package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  //      System.out.println(checkFile("data10.txt"));
//       System.out.println(doIt("data10.txt","update10.txt"));
        for (int i = 10; i <= 1000000; i*=10) {
            String dataFile="data"+i+".txt";
            for (int j = 10; j <= 10000000; j*=10) {
                String updateFile="update"+j+".txt";
                if(checkFile(dataFile) && checkFile(updateFile))
                {
                    System.out.println("DataFile: "+dataFile+" UpdateFile: "+updateFile+" Time:"+doIt(dataFile,updateFile));
                }
            }
        }

    }

    private static boolean checkFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    private static long doIt(String dataFile, String updateFile) {
        long startMilli = System.currentTimeMillis();
        Storage storage = new Storage(dataFile);
        storage.Update(updateFile);
        long stopMilli = System.currentTimeMillis();
        return stopMilli - startMilli;
    }


}

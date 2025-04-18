package Lab9Fel2;

import oop.labor09.Fel1.ArrayListQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words = new ArrayList<>();

    public ArrayListDictionary() {
        try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE)))
        {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                add(line);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(String word) {
        if (!words.contains(word))
        {
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words,word) >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }
}

package Lab9Fel2;

public interface IDictionary {
    public final String DICTIONARY_FILE="dict.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}

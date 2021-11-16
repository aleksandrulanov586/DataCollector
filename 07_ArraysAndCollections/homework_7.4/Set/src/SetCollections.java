import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollections {
    public String TEXT = ".+";
    Set<String> collectionText = new HashSet<>();


    public void add(String text) {
        boolean w = collectionText.add(text);
        if (w != false) {
            collectionText.add(text);
            System.out.println("Текcт добавлен!");
        } else {
            System.out.println("Такой текст уже есть!");
        }


    }


    public void list() {
        for (String w : collectionText)
            System.out.println(w);


    }
}

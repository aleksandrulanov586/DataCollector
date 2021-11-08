import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetCollections {

    Set<String> collectionText = new HashSet<>();


    public void add(String text) {

        collectionText.add(text);


    }

    public void list() {
        for (String w : collectionText)
            System.out.println(w);


    }
}

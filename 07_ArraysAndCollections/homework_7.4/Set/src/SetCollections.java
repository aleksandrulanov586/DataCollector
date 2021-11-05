import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetCollections {
  public static String TEXT = ".+";
   ArrayList<String> collectionText = new ArrayList<>();


public void add (String text){
  for (String s : collectionText){
    if (s.matches(text) != text.matches(s)){
      collectionText.add(text);

    }else {
      System.out.println("Такой текст уже есть!" ) ;}

  }

}
}

import java.util.ArrayList;
import java.util.List;

public class Raz {
    List<Text> col = new ArrayList<>();

    public void add(Text com) {
        col.add(com);


    }


    public List<Text> getCol(Text text) {

        return text != null ? col : null;
    }
}
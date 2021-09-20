import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    ArrayList<String> emaillist = new ArrayList<>();
    public String text (String text) {

        while (true) {

            Pattern pattern = Pattern.compile("\\w[\\w\\-.]*@\\w[\\w\\-.]*\\.\\w{2,}");
            Matcher matcher = pattern.matcher(text);
            if (text.equals(matcher)) {
               break;

            }else {
                System.out.println("Строка не соответствует");
            }

        }
        return text;
    }

    public void add(String email) {
        // TODO: валидный формат email добавляется

    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return Collections.emptyList();
    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    ArrayList<String> emaillist = new ArrayList<>();


    public void add(String email) {
        // TODO: валидный формат email добавляется


        Pattern pattern = Pattern.compile("\\w[\\w\\-.]*@\\w[\\w\\-.]*\\.\\w{2,}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            emaillist.add(email);
            System.out.println("Вы ввели эл.адрес");
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке

        return emaillist;
    }

}

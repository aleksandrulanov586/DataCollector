import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> emaillist = new TreeSet<>();


    public void add(String email) {
        // TODO: валидный формат email добавляется


        Pattern pattern = Pattern.compile("\\w[\\w\\-.]*@\\w[\\w\\-.]*\\.\\w{2,}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
             email.toLowerCase();
            emaillist.add(email);
            System.out.println("Вы ввели эл.адрес");
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public TreeSet<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке

        return emaillist;
    }

}

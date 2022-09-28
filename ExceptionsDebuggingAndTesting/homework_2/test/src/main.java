import jdk.internal.icu.impl.NormalizerImpl;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.sql.DriverManager.println;

public class main {


    public static void main(String[] args) {
        Raz raz = new Raz();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\D+");
        Matcher matcher = pattern.matcher(s);


        while (true) {
            if (matcher.matches()) {
                String[] e = s.split(" ");
                String com1 = e[0];
                String com2 = e[1];
                String com3 = e[2];
                com3 = " ";
                Text text = new Text(com1, com2, com3);
                raz.add(text);


                if (e != null) {
                    List<Text> r = raz.getCol(text);
                    r.stream().forEach(System.out::println);

                } else

                    System.out.println("Ошибка");
            }
            return;
        }
    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emails = new EmailList();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                System.out.println(emails.getSortedEmails());
            } else {
                emails.add(input);
            }


            //TODO: write code here

        }
    }
}

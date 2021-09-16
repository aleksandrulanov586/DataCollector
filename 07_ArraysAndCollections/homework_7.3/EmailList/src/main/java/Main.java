import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
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
        EmailList email = new EmailList();

        while (true) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\w[\\w\\-.]*@\\w[\\w\\-.]*\\.\\w{2,}");
            Matcher matcher = pattern.matcher(input);
            if (input.equals(matcher)) {

                email.add(input);

            }

            //TODO: write code here

        }
    }
}

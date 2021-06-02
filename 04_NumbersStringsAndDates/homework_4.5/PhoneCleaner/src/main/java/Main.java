import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
      Pattern p = Pattern.compile("\\d");

      //  boolean phoneNumber = p.matcher(input).matches();

      String searchСharacters = "\\D+";
      String deletingСharacters = input.replaceAll(searchСharacters, "");

      if (deletingСharacters.length() != 12) {
        System.out.println(deletingСharacters);

      } else {
        System.out.println("Неверный формат номера");
      }
    }
  }
}


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
      Pattern p = Pattern.compile("( +7 | 8 ) - (909|905) -\\d{3} - \\d{2} - \\d \\d");

      boolean phoneNumber = p.matcher(input).matches();
      if (phoneNumber){
        String searchСharacters = "\\D+";
        String deletingСharacters = input.replaceAll(searchСharacters, "");

        System.out.println(deletingСharacters);
      }else {
        System.out.println("Неверный формат номера"); }
    }






    }
  }



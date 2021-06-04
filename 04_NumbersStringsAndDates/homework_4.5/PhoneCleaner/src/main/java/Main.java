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

      String searchСharacters = "\\D+";
      String deletingСharacters = input.replaceAll(searchСharacters, "");

      //Вариант 1
      /** StringBuffer sb = new StringBuffer(deletingСharacters);
      sb.insert(0, "7");
      System.out.println(sb); **/
      //Вариант 2
      char aChar = deletingСharacters.charAt(0);
      int digitSearch = deletingСharacters.indexOf("8");
      if (aChar != digitSearch) {

      }

      if (deletingСharacters.length() > 11 || deletingСharacters.length() < 10 )  {
        System.out.println("Неверный формат номера");
        return;
      }


      if (deletingСharacters.length() == 10) {

        System.out.println("7" + deletingСharacters);
        return;
      }


    }



  }
}



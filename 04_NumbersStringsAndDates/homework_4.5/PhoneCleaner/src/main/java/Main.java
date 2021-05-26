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

      Matcher matcher = p.matcher(input);
      while (matcher.find()){
        System.out.println(matcher);
      }




      }






    }
  }



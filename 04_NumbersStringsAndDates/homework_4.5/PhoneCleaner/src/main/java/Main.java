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

      if (deletingСharacters.length() > 10 || deletingСharacters.length() < 11 )  {
        System.out.println("Неверный формат номера");
       return;
      }
      if (deletingСharacters.length() != 11) {
        System.out.println("Неверный формат номера");
return;
      }

      if (deletingСharacters.length() == 10) {

        System.out.println("7" + deletingСharacters );
        return;
      }



      }



    //  result = pruningStartParenthesis + placeholder + pruningEndParenthesis;



    }
  }
}


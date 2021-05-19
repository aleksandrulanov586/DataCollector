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
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

      Pattern p = Pattern.compile("\\s+");
      String[] fields = p.split(input);

      for (int i = 0; i < fields.length; i++){
        System.out.println("Фамилия:" + fields[i]  );

        System.out.println("Имя:" + fields[i] );

        System.out.println("Отчество:" + fields[i]  );
       continue;
      }






    }
  }

}
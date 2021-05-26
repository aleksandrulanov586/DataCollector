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



      Pattern p = Pattern.compile("[А-Яа-я]+-*[А-Яа-я]*\\s+[А-Яа-я]+\\s+[А-Яа-я]+");
      boolean isFullname = p.matcher(input).matches();

      if (isFullname) {
        String[] fullname = input.split("\\s+");

        System.out.println("Фамилия: " + fullname[0]);
        System.out.println("Имя: " + fullname[1]);
        System.out.println("Отчество: " + fullname[2]);
      } else {
        System.out.println("Введенная строка не является ФИО");
      }



    }
  }


}




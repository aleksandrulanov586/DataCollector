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

      //Pattern p = Pattern.compile("[А-Яа-я]+\\s+[А-Яа-я]+\\s+[А-Яа-я]+");
     // boolean isFullname = p.matcher(input).matches();




      if (input.matches("[А-Яа-я]+\\s+[А-Яа-я]+\\s+[А-Яа-я]+")) {
        int spaceIndex = input.indexOf(' ');
        int spaceIndex2 = input.lastIndexOf(' ');
        System.out.println("Фамилия: " + (input.substring(0, spaceIndex)) + input.trim());
        System.out.println("Имя: " + (input.substring(spaceIndex, spaceIndex2)) + input.trim());
        System.out.println("Отчество: " + (input.substring(spaceIndex2)) + input.trim());
        break;
      } else {
        System.out.println(" Вводимая строка не является ФИО ");
        break;
      }


    }
  }


}



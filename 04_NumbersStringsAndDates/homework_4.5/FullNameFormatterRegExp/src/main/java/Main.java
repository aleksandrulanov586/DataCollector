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

      Pattern.matches(".*\\p{InCyrillic}.*", input);
      Pattern p = Pattern.compile("[А-Яа-я]+\\s+[А-Яа-я]+\\s+[А-Яа-я]+");
      boolean isFullname = p.matcher(input).matches();

      int amountCyrillic = 0;
      for (int i = 0; i < input.length(); i++) {
        if (Character.UnicodeBlock.of(input.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC)) {
          amountCyrillic++;
        }
      }
      if (amountCyrillic == 0) {
        System.out.println(" Введенная строка не является ФИО");
        continue;
      }

      if (input.matches("([А-Я][а-я]+(-[А-Я][а-я]+)?\\s){2}[А-Я][а-я]+(\\s[а-я]+)?")) {
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



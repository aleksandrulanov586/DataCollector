import java.util.Scanner;

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

      int startSpace = input.indexOf(' ');
      int endSpace = input.lastIndexOf(' ');


      int spacesCount = 0;
      for (char e : input.toCharArray()) {
        if (e == ' ') {
          spacesCount++;
        }
      }
      if (spacesCount != 2) {
        System.out.println("Неверный формат имени");
        System.out.println("Пробелов: " + spacesCount);
        continue;
      }

      String name = input.substring(0,startSpace);
      String patronymic = input.substring(endSpace);
      String surname = input.substring(startSpace, endSpace);
      System.out.println("Имя: " + name);
      System.out.println("Фамилия: " + surname);
      System.out.println("Отчество: " + patronymic);


    }
  }

}
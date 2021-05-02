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
      String f = "Фамилия:";
      String i = "Имя:";
      String o = "Отчество:";

      do {
        System.out.println("Введите ФИО:");
        System.out.println(f+ input + "\n" + i + input + "\n" + o + input );


      }while (input.equals("ФИО"));
     continue;


    }
  }

}
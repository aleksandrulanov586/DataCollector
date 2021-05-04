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


      int space = 0;
      for (char e : input.toCharArray()) {
        if (e == ' ') {
          space++;
        }

      }


      int i;
      do {
        i = input.indexOf(0);
        if (i != -1) {
          input = input.substring(0, i) ;
        }
      } while (i != -1);




    }
  }

}
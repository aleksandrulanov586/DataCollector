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
      int f = input.indexOf(" ");
      int q = input.lastIndexOf(" ");

for (char e : input.toCharArray()) {
  if ( input.equals(" "));{
    System.out.println(input + "\n");
  }

}

      do {
        System.out.println("Введите ФИО:");
        System.out.println("Вы ввели" + input );


      }while (input.equals("ФИО"));
     break;


    }
  }

}
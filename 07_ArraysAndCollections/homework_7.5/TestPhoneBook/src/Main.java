import java.util.Scanner;
import java.util.Set;


public class Main {

  public static String PRINT_THE_EXIT = "EXIT";

  public static void main(String[] args) {
    TestPhooneBook phoneBook = new TestPhooneBook();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.matches(phoneBook.PHONE_NUMBER)) {
        phoneBook.getNameByPhone(input);
      } else if (phoneBook.hashMap.containsKey(input)) {
        System.out.println("Введите имя!");

        // записываете номер и имя в тел книгу
      } else {
        System.out.println("Имя введенно не коректно!");

        // печатайте полученный список

      }
      if (input.matches(phoneBook.NAME)) {
        phoneBook.getPhonesByName(input);
      }
      for (String w : phoneBook.hashMap) {

      }else if (phoneBook.hashMap.containsValue(input)) {
        phoneBook.addContact(input, input);
      }

      if (input.equals("LIST")) {
        System.out.println(phoneBook.hashMap);
        continue;
      }
      if (input.matches(PRINT_THE_EXIT)) {
        return;
      }
    }
  }
}



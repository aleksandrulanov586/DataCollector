import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


  public static String PRINT_THE_EXIT = "EXIT";


  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String input = scanner.nextLine();

      if (input.matches(phoneBook.PHONE_NUMBER)) {
        Set<String> phones = phoneBook.getPhonesByName(input);
        for (String phone : phones) {
          if (phone.isEmpty()) {
            System.out.println(phone);
            // записываете номер и имя в тел книгу
          } else {
            System.out.println("Введите имя!");
            String input1 = scanner.nextLine();

            // печатайте полученный список
          }
        }
        else if (input.matches(phoneBook.NAME)) {
          String name = phoneBook.getNameByPhone(input);
          for (String s : name) {

          }
          if (name.isEmpty()) {
            System.out.println(phoneBook);

          } else {

            phoneBook.addContact(input, name);
          }
        }
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


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
                if (phones.isEmpty()) {

                    System.out.println("Введите имя!");
                    String name = scanner.nextLine();
                    phoneBook.addContact(input, name);
                } else {
                    for (String phone : phones) {
                        System.out.println(phone);

                    }
                }
            } else if (input.matches(phoneBook.NAME)) {
                String name = phoneBook.getNameByPhone(input);

                if (name.isEmpty()) {
                    System.out.println("Введите номер!");
                    String number = scanner.nextLine();
                    phoneBook.addContact(number, input);

                } else {
                    System.out.println(phoneBook);
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


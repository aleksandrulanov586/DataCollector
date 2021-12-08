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
                phoneBook.getPhonesByName(input);
                Set<String> phones = phoneBook.getPhonesByName(input);
                if (phones.isEmpty()) {
                    System.out.println("Такого номера нет  в телефонной книге." + "\n" + "Введите имя абонента для номера " + input);
                } else {
                    System.out.println("Неверный формат");


                    // записываете номер и имя в тел книгу


                    // печатайте полученный список

                    if (input.matches(phoneBook.NAME)) {
                        String phoness = phoneBook.getNameByPhone(input);
                        if (phoness.isEmpty()) {
                            phoneBook.addContact(input, input);
                        } else {
                            System.out.println("Неверный формат");
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
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String PRINT_THE_LIST = "LIST";
    public static String PRINT_THE_EXIT = "EXIT";


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.matches(phoneBook.NAME)) {
                String[] componentTeam = input.split(phoneBook.NAME, 1);
                String indexText = componentTeam[0];
                phoneBook.getPhonesByName(indexText);
            } else {
                System.out.println("Введите номер телефона");
            }
            if (input.matches(phoneBook.PHONE_NUMBER)) {

                String[] componentTeam = input.split(phoneBook.PHONE_NUMBER, 1);
                String indexText = componentTeam[1];
                phoneBook.getNameByPhone(indexText);
            } else {
                phoneBook.addContact(input, input);

                if (input.matches(phoneBook.PHONES_BY_NAME)) {
                    phoneBook.getPhonesByName(input);
                }

                if (input.matches(PRINT_THE_LIST)) {
                    System.out.println(phoneBook.hashMap);
                }
                if (input.matches(PRINT_THE_EXIT)) {
                    return;
                }

            }
        }
    }
}
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
            if (input.matches((input.matches(phoneBook.NAME) && input.matches(phoneBook.PHONE_NUMBER)))) {
                phoneBook.addContact(input, input);
            }

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
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            Pattern exitpattern = Pattern.compile("EXIT");
            Matcher exit = exitpattern.matcher(input);
            Pattern listpattern = Pattern.compile("LIST");
            Matcher list = listpattern.matcher(input);

            if (list.matches()) {
                phoneBook.addContact(input, input);
            } else {
                System.out.println(phoneBook.getAllContacts());//
            }
            if (exit.matches()) {
                return;
            }
        }
    }
}
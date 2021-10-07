import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
            } else {
                phoneBook.addContact(input);
            }
    }
}

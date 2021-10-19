import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(phoneBook.PRINT_THE_LIST)) {
                phoneBook.addContact(input);
            } else {
                System.out.println(phoneBook.getAllContacts());//
            }
        }
    }
}
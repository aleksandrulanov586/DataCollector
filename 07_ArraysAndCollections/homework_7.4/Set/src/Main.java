import java.util.Scanner;

public class Main {
    public static String TEXT = ".+";
    public static String PRINT_THE_LIST = "LIST";
    public static SetCollections classCollections = new SetCollections();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(TEXT)) {
                classCollections.add(input);
            }
            if (input.matches(PRINT_THE_LIST)) {
                classCollections.list();
            }
        }

    }

}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputText = scanner.nextLine();

        String nonSecretText = searchAndReplaceDiamonds(userInputText, "<>");


        System.out.println(nonSecretText);
    }


    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений


      String textWithDiscount = text.replaceAll("\\(.+\\)", text);
     // String result = "";

        while (true) {

           int indexStartParenthesis = textWithDiscount.indexOf("<");
           int indexEndParenthesis = textWithDiscount.indexOf(">");

            if (indexEndParenthesis < 0 || indexStartParenthesis < 0) {
                return text;
            }

            String pruningStartParenthesis = textWithDiscount.substring(0, indexStartParenthesis);
            String pruningEndParenthesis = textWithDiscount.substring(indexEndParenthesis + 1);

            textWithDiscount = pruningStartParenthesis + placeholder + pruningEndParenthesis;
        }
    }
}
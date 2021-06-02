import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputText = scanner.nextLine();

        String nonSecretText = searchAndReplaceDiamonds(userInputText, "***");
        String nonSecretText2 = searchAndReplaceDiamonds(userInputText, "***");

        System.out.println(nonSecretText + nonSecretText2);
    }


    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

        Pattern pattern = Pattern.compile()
        Pattern pattern = Pattern.compile(digitsRegex);
        Matcher matcher = pattern.matcher(text);
        String result = text;

        while (true) {

            int indexStartParenthesis = result.indexOf("<");
            int indexEndParenthesis = result.indexOf(">");

            if (indexEndParenthesis < 0 || indexStartParenthesis < 0) {
                return result;
            }

            String pruningStartParenthesis = result.substring(0, indexStartParenthesis);
            String pruningEndParenthesis = result.substring(indexEndParenthesis + 1);

            result = pruningStartParenthesis + placeholder + pruningEndParenthesis;
        }
    }
}
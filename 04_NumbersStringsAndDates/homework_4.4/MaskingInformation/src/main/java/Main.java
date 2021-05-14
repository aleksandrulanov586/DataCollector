import java.util.Scanner;

public class Main {



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInputText = scanner.nextLine();

    String nonSecretText = searchAndReplaceDiamonds(userInputText, "***");
    System.out.println(nonSecretText);
  }
    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений




      int indexStartParenthesis = text.indexOf("<");
      int indexEndParenthesis = text.lastIndexOf(">");





String pruningStartParenthesis = text.substring(0,indexStartParenthesis);
String pruningEndParenthesis = text.substring(indexEndParenthesis);


        return text;
    }

}
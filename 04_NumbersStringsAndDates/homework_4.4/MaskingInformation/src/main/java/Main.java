import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInputText = scanner.nextLine();

    String nonSecretText = searchAndReplaceDiamonds(userInputText, "***"   );

    System.out.println(nonSecretText );


  }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {
    // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

    int indexStartParenthesis = text.indexOf("<");
    int indexEndParenthesis = text.indexOf(">");
    if (indexEndParenthesis < 0 || indexStartParenthesis < 0) {
      return text;
    }
    int indexSecondStartParenthesis = text.lastIndexOf(">");
    int indexSecondEndParenthesis = text.lastIndexOf("<");
    if (indexSecondStartParenthesis < 0 || indexSecondEndParenthesis < 0) {
      return text;
    }

    String pruningSecondStartParenthesis = text.substring(0, indexSecondStartParenthesis);
    String pruningSecondEndParenthesis = text.substring(indexSecondEndParenthesis + 1);

    String pruningStartParenthesis = text.substring(0, indexStartParenthesis);
    String pruningEndParenthesis = text.substring(indexEndParenthesis + 1);

    System.out.println(pruningStartParenthesis + placeholder + pruningEndParenthesis);
    System.out.println(pruningSecondStartParenthesis + placeholder + pruningSecondEndParenthesis);

    if (indexStartParenthesis != 0 ){
       return  pruningSecondStartParenthesis + placeholder + pruningSecondEndParenthesis ;
    }


    return text;
  }

}
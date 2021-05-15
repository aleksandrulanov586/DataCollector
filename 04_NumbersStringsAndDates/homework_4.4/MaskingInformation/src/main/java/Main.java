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
      text = "<>";
      placeholder = "<>";
      int indexStartParenthesis = text.indexOf("<");
      int indexEndParenthesis = text.lastIndexOf(">");


int bracketsCount = 0;
      for (int e = 0; e < text.length(); e++) {
        if (text.equals("<")) {
          bracketsCount ++;
        }
      }

      String pruningStartParenthesis = text.substring(0,indexStartParenthesis);
      String pruningEndParenthesis = text.substring(indexEndParenthesis);
      System.out.println(pruningStartParenthesis);
      System.out.println(pruningEndParenthesis);


        return text;
    }

}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInputText = scanner.nextLine();

    String nonSecretText = searchAndReplaceDiamonds(userInputText, "***");

    System.out.println(nonSecretText);
  }


  public static String searchAndReplaceDiamonds(String text, String placeholder) {
    String regex = "<.+?>";

    Pattern pattern = Pattern.compile(regex);

    while (true) {
      Matcher matcher = pattern.matcher(text);
      if (!matcher.find()) {
        break;
      }
      text = text.replaceFirst(regex, placeholder);
    }
    return text;
  }

}

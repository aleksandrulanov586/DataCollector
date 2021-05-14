import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String text = "Вася заработао 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String digitsRegex = "\\d+";

    Pattern pattern = Pattern.compile(digitsRegex);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      String match = matcher.group();
      System.out.println(match);
    }
Integer vasy = Integer.parseInt(matcher);


  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод




   return -1;
  }

}
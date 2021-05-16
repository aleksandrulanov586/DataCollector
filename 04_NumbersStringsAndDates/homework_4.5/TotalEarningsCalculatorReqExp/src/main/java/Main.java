import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    int text = calculateSalarySum(
        "Вася заработао 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей");

  }

  public static int calculateSalarySum(String text) {
    //TODO: реализуйте метод
    String digitsRegex = "\\d+";

    Pattern pattern = Pattern.compile(digitsRegex);
    Matcher matcher = pattern.matcher(text);

    int sum = 0;
    while (matcher.find()) {
      sum += Integer.parseInt(matcher.group());
    }
    System.out.println("Сумма " + sum);

    return -1;

  }

}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
   String text = "Вася заработао 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String p5000 = "^\\D+(\\d+).*";

    Pattern vasy = Pattern.compile(p5000);
    Matcher v = vasy.matcher(text);
    if (v.find()) {
      System.out.println("Found value: " + v.group(0) );
     System.out.println("Found value: " + v.group(1) );
     System.out.println("Found value: " + v.group(2) );

    }

  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод




   return -1;
  }

}
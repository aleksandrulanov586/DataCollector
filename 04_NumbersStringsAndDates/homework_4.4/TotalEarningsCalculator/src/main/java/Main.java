public class Main {

  public static void main(String[] args) {

    String text = "     Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    String textTrim = text.trim();

    String text3 = text.substring(15);
    int text500 = text.indexOf(("5000"));
    int text2500 = text.lastIndexOf("5000");
    int text30000 = text.indexOf(("30000"));
    int text7563 = text.indexOf(("7563"));
   // int sum =  text500 + text30000 + text7563;
   String sum = String.valueOf(text500 + text30000 + text7563);
    Integer q = Integer.parseInt(sum);
    System.out.println(q);
System.out.println(text7563+ "\n" + text500 + "\n" + text30000);
    System.out.println(textTrim);
  //  System.out.println(text3);

  }

}
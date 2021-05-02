public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    String textTrim = text.trim();

    String text3 = text.substring(15,19);
    String text4 = text.substring(35,39);
    String text5 = text.substring(56,61);

   Integer parsText3 = Integer.parseInt(text3);
    Integer parsText4 = Integer.parseInt(text4);
    Integer parsText5 = Integer.parseInt(text5);

    Integer sum = parsText3 + parsText4 + parsText5;
    System.out.println(sum);



  }

}
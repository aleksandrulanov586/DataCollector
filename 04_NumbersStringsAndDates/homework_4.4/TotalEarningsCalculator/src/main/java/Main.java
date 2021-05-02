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
  /**  int text500 = text.indexOf(("5000"));
    int text2500 = text.lastIndexOf("5000");
    int text30000 = text.indexOf(("30000"));
    int text7563 = text.indexOf(("7563"));
   // int sum =  text500 + text30000 + text7563;
 //  String sum = String.valueOf(text500 + text30000 + text7563);
  //  Integer q = Integer.parseInt(sum);
  //  System.out.println(text30000);
//System.out.println(text7563+ "\n" + text500 + "\n" + text30000);
 //   System.out.println(textTrim);
  //  System.out.println(text3);**/
 //   System.out.println(text3 + "\n" +  text4 + "\n" + text5);
    System.out.println(sum);


  }

}
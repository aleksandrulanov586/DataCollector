public class Main {


  private static Integer amount;


  public static void main(String[] args) {

// метод получения int из char

//    String string = "15";
//    int i = 15;
//    Integer digit = Integer.parseInt(String.valueOf(string.charAt(i)));
//    System.out.println(digit);
//======================================================================================================================
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(7843);

    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {


String s = number.toString();
Character character = s.charAt(2);
System.out.println(character);
String r = character.toString();
Integer q = Integer.parseInt(r);




  /**  if (number != 0){


      return - 1;
    }

    while (number != 0){
      Integer q = ( 7 + 1) / 4;

      return q;

    } **/

    //  char x = 55528;
    //   char y = 0;
    //   Character.valueOf(x).compareTo(Character.valueOf(y));

    // приобразую number - Integer в String




 //  String integerString = number.toString();

    //System.out.printf("значение %s - %s%n", integerString, integerString.getClass());

  //  String getNumericValue = number.toString();
    //  System.out.printf("значение %s - %s%n", getNumericValue, getNumericValue.getClass());


// for (int i = 0; i < integerString.length(); i++);
 //   for (int i = 0; i < integerString.length(); i++);
 //  for (int i = 0; i < integerString.length(); i++);
 //  int char1 = integerString.charAt(0);
 //   int char3 = integerString.charAt(0);
 // int sum = char1;

  //  int char2 = integerString.charAt(0);
   // int sum = char2;


  //  int sum = char3;
 //   int sum = char1;
     // for (int q = 0; q > 7; Character.getNumericValue(q++))
     //   for (int w = 0; w > 22; Character.getNumericValue(w++))


    //  System.out.println(Character.getNumericValue(sum));
    //  System.out.println(Character.getNumericValue(q));
    //  System.out.println(Character.getNumericValue(w));

   //   int char1 = Character.getNumericValue(number);
    //  int sum = char1;

      //    Character char1 = integerString.charAt(0);
      //    Character char2 = integerString.charAt(1);
      //     Character char3 = integerString.charAt(2);
      //     Character char4 = integerString.charAt(3);
      // тут по логике приобразованный индекс в инт должен был сложится и готовый результат вернуть

    return 0;
  }


}


//   String integerString = Integer.toString(number);
//   System.out.printf("значение %s - %s%n", integerString, integerString.getClass());

// String i = Integer.toString(number);

//   int i1 = Character.getNumericValue(chars[5]);
//   int i2 = Character.getNumericValue(chars[3]);
//   int i3 = Character.getNumericValue(chars[4]);
//   int i4 = Character.getNumericValue(chars[9]);

//   int sum = i1 + i2 + i3 + i4;

  


  



  
        

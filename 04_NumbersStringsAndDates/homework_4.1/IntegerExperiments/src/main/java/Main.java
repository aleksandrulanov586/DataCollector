public class Main {

  private static Integer amount;

  public static void main(String[] args) {
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

    // number которая уже имеет значение Integer
    number = 5489;
// приобразую number - Integer в String
        String integerString = number.toString();
        System.out.printf("значение %s - %s%n", integerString, integerString.getClass());
        // с помощью цикла выделаю длину строки number которая уже из int приобразовалась в строку
    // ради любопытство решил посмотреть что получится
    for (int i = 0; i < integerString.length(); i++) {
      System.out.println(integerString.charAt(i));
      //выверяю индкс строки
      Character char1 = integerString.charAt(0);
      Character char2 = integerString.charAt(1);
      Character char3 = integerString.charAt(2);
      Character char4 = integerString.charAt(3);
      // тут по логике приобразованный индекс в инт должен был сложится и готовый результат вернуть
      int sum = char1 + char2 + char3 + char4 ;



return sum;
      
    }



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

  


  



  
        

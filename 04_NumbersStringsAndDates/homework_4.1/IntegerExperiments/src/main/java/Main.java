public class Main {

  private static java.lang.Integer;

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

  public static Integer sumDigits(Integer number) {
    String i = Integer.toString(number);
    char[] chars = i.toCharArray();
    int i1 = Character.getNumericValue(chars[5]);
    int i2 = Character.getNumericValue(chars[3]);
    int i3 = Character.getNumericValue(chars[4]);
    int i4 = Character.getNumericValue(chars[9]);

    int sum = i1 + i2 + i3 + i4;

    return sum;


  }

}

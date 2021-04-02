import java.util.Scanner;

public class Arithmetic {


  public int a;
  public int b;

 // public int productsnumbers = 20;
//  public double averagenumbers = 20;
 // public double maximumtwonumbers = 20;
 // public double minimumtwonumbers = 20;



  public Arithmetic(int int1, int int2) {
    a = int1;
    b = int2;
  }

 public Arithmetic() {
   this.a = a;
   this.b = b;
  }
  // сумму чисел
  public String info(){
    String result = "a = " + a + ", b=" + b;
    return result;
  }
  // разность чисел
  public Integer difference(){
    Integer i = a - b;
    return i;
  }
  //произведения чисел
  public Integer works(){
    Integer i = a * b;
    return i;
  }
  //среднее значение этих чисел
  public double average (){
    double i = (a + b) / 2;
    return i;
  }
//максимальное из двух чисел
  public Integer max(){
    if(a > b) {
      return a;
    } else {
      return b;
    }
  }
  // минимальное из двух чисел
  public Integer min(){
    if(a < b) {
      return a;
    } else {
      return b;
    }
  }
  public static void main(String[] args) {
    Arithmetic arithmetic = new Arithmetic(1,2);
    System.out.println(arithmetic.info());
    System.out.println(arithmetic.difference());
    System.out.println(arithmetic.works());
    System.out.println(arithmetic.average());
    System.out.println(arithmetic.max());
    System.out.println(arithmetic.min());

   // Arithmetic arithmetic = new Arithmetic();
  //  System.out.println(arithmetic.a + arithmetic.b);


  }




}




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
  public String info(){
    String result = "a = " + a + ", b=" + b;
    return result;
  }


  public static void main(String[] args) {
    Arithmetic arithmetic = new Arithmetic(1,2);
    System.out.println(arithmetic.info());
   // Arithmetic arithmetic = new Arithmetic();
  //  System.out.println(arithmetic.a + arithmetic.b);


  }





  }




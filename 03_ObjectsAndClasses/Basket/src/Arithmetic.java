import java.util.Scanner;

public class Arithmetic {


  public int a;
  public int b;

 // public int productsnumbers = 20;
//  public double averagenumbers = 20;
 // public double maximumtwonumbers = 20;
 // public double minimumtwonumbers = 20;

  public Arithmetic(int int1, int int2) {
 //   this.sumnumbers = sumnumbers;
//    this.differencenumbers = differencenumbers;
    a = int1;
    b = int2;



  }

  public static void main(String[] args) {


  }

  public int sumnumbers;

  {
   Scanner sumnumbers = new Scanner(System.in);
   int a, b;
   System.out.println("Введите число А = ");
   a = sumnumbers.nextInt();

   System.out.println("Введите число В = ");
   b = sumnumbers.nextInt();
   System.out.println("Сумма = " + (a+b));

  }



  }




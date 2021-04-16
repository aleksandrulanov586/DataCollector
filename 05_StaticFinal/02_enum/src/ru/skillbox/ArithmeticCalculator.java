package ru.skillbox;

public class ArithmeticCalculator {
  int a = 0;
  int b = 0;


  public ArithmeticCalculator(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }


  public int calculate (Operation operation) {

    if (operation == Operation.ADD) {

    }


    //  if (operation == Operation.MULTIPLY){
    //     result w = a - b;
    //  }
    //  if (operation == Operation.SUBTRACT){
    //     double e = a + b;
    //   }

    return a + b;
  }


}

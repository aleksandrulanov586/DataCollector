public class Main {

  public static void main(String[] args) {
//==================================================================================================
    //      Arithmetic arithmetic = new Arithmetic(1,2);
    //      System.out.println(arithmetic.info());
//==================================================================================================

    Basket basket = new Basket();

    basket.add("Кефир", 60);
    basket.add("Бетон", 100, 2);
    basket.add("Бетон", 100, 2, 200.0);
    int a = basket.getTotalPrice() / basket.items;
    System.out.println(basket.getTotalPrice());
//==================================================================================================
    //  Printer printer = new Printer();

    //   printer.append("Text");
    //  printer.append("Text",1,"Text");
    //   printer.append("Text","Text");
    //   printer.print("Распечатаны документы:");

  }
}

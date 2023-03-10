import java.time.Period;


public class Basket {

  public String items = " ";
  private int totalPrice = 0;
  private int limit;
  // обшая стоимость всех товаров
  public static int totalcost = 0;
  //общее количество всех товаров
  public static int quantitiesAllGoods = 0;
  public double massaallgoods = 0;
  public double weight = 0;
  public static int count = 0;

  public double getMassaallgoods() {
    return massaallgoods;
  }

  public Basket() {

    increaseCount(1);
    items = "Список товаров:";
    this.limit = 1000000;
  }

  public Basket(int limit) {
    this();
    this.limit = limit;
  }

  public Basket(String items, int totalPrice) {

    this();

    this.items = this.items + items;
    this.totalPrice = totalPrice;
    addAllCostAllGoods(1, 1);
  }

  public static void addAllCostAllGoods(int totalcost, int quantitiesAllGoods) {

    Basket.totalcost = Basket.totalcost + totalcost;
    Basket.quantitiesAllGoods = Basket.quantitiesAllGoods + quantitiesAllGoods;
  }

  public static int getCount() {
    return count;
  }

  public static void increaseCount(int count) {
    Basket.count = Basket.count + count;
  }
//==================================================================================================

  public void add(int price, String name, double weight) {

    massaallgoods = massaallgoods + count * weight;
    add(name, price, 1, weight);


  }


  public void add(String name, int price, int count, double weight) {
    double currentWeight = count * weight;
    massaallgoods = massaallgoods + currentWeight;

    add(name, price, count);
  }

  //================================================================================================
  public void add ( int totalPrice, int count, String name){
    int w = totalcost + totalPrice * count;
    int e = quantitiesAllGoods * count;
  }

  public static int getAverageCost(){
    if (quantitiesAllGoods == 0){
      return 0;
    }
   int q = (totalcost / quantitiesAllGoods );

    return  q;
  }

  public void add(String name, int price) {
    add(name, price, 1);
  }

  public void add(String name, int price, int count) {

    boolean error = false;
    if (contains(name)) {
      error = true;
    }
    if (totalPrice + count * price >= limit) {
      error = true;
    }
    if (error) {
      System.out.println("Error occured :(");
      return;
    }
    items = items + "\n" + name + " - " +
        count + " шт. - " + price;
    totalPrice = totalPrice + count * price;
    quantitiesAllGoods++;
  }

  public void clear() {
    items = "";
    totalPrice = 0;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  public boolean contains(String name) {
    return items.contains(name);
  }

  public void print(String title) {
    System.out.println(title);
    if (items.isEmpty()) {
      System.out.println("Корзина пуста");
    } else {
      System.out.println(items);
    }
  }


}

import java.time.Period;


public class Basket {
   public String items = " ";
    private int totalPrice = 0;
    private int limit;


  public double getMassaallgoods() {
    return massaallgoods;
  }

  public double massaallgoods = 0;
    public double weight = 0;

    public static int count = 0;

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
    }




    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
//==================================================================================================

    public void add(double massaallgoods, int price, String name, double weight) {


      massaallgoods  = massaallgoods  + count * weight;
add(weight,count);


    }
public double add(double weight,int count )
{
  add(weight,count);


  return massaallgoods;
}
    public void add(String name, int price, int count, double weight) {
      double currentWeight = count * weight;
      massaallgoods = massaallgoods + currentWeight;


     add(name,price,count);
    }
//==================================================================================================
    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {

        boolean error = false;
        if(contains(name)) {
            error = true;
        }
        if(totalPrice + count * price >= limit) {
            error = true;
        }
        if(error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
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
        if(items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }



}

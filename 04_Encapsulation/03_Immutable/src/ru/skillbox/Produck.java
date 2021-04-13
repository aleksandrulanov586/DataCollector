package ru.skillbox;

public class Produck {
  private final String name;
  public int price;
  private final int barCode ;

  public Produck(String name, int barCode) {
    this.name = name;
    this.barCode = barCode;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public int getBarCode() {
    return barCode;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}

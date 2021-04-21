package ru.skillbox;

public class Computer {

  private final Storage storage;
  private String name;
  //производитель
  private String vendor;
private double totalWiight = 0;

private Keyboard keyboard;




  public Storage getStorage() {
    return storage;
  }

  public String getName() {
    return name;
  }

  public String getVendor() {
    return vendor;
  }

  public double getTotalWiight() {
    return totalWiight;
  }

  public Keyboard getKeyboard() {
    return keyboard;
  }

  public Computer(Storage storage, String name, String vendor, double totalWiight,
      Keyboard keyboard) {
    this.storage = storage;
    this.name = name;
    this.vendor = vendor;
    this.totalWiight = totalWiight;
    this.keyboard = keyboard;
  }

  public double  Calculationmass(){

    

return
  }
public String toString (){


    return
}


}

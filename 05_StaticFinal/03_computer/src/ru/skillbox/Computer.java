package ru.skillbox;

public class Computer {
  private String name;
  //производитель
  private String vendor;
private double totalWiight = 0;

  public double getTotalWiight() {
    return totalWiight;
  }

  public void setTotalWiight(double totalWiight) {
    this.totalWiight = totalWiight;
  }

  public Storage getStorage() {
    return storage;
  }

  public void setStorage(Storage storage) {
    this.storage = storage;
  }

  private Storage storage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public Computer (String name, String vendor,Storage storage) {
    this.name = name;
    this.vendor = vendor;
    this.storage = storage;
  }

  public double  Calculationmass(){

    

return
  }
public String toString (){


    return
}


}

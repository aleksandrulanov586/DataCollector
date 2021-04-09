package ru.skillbox;

public class Country {

//Название.
  private  String name;
 //Численность населения.
  private int numberPeople;
// Площадь в квадратных километрах.
  private double AreaInSquareKilometers;
  //Название столицы.
  private String CapitalName;
  // Наличие выхода к морю.
 private int Landlocked;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberPeople() {
    return numberPeople;
  }

  public void setNumberPeople(int numberPeople) {
    this.numberPeople = numberPeople;
  }

  public double getAreaInSquareKilometers() {
    return AreaInSquareKilometers;
  }

  public void setAreaInSquareKilometers(double areaInSquareKilometers) {
    AreaInSquareKilometers = areaInSquareKilometers;
  }

  public String getCapitalName() {
    return CapitalName;
  }

  public void setCapitalName(String capitalName) {
    CapitalName = capitalName;
  }

  public int getLandlocked() {
    return Landlocked;
  }

  public void setLandlocked(int landlocked) {
    Landlocked = landlocked;
  }

  public Country(String name) {
    this.name = name;
  }
//==================================================================================================







}

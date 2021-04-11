package ru.skillbox;

public class Country {
  //Название.
  private  String name;
  //Численность населения.
  private int numberPeople;
  // Площадь в квадратных километрах.
  private double areaInSquareKilometers ;
  //Название столицы.
  private String capitalName;
  // Наличие выхода к морю.
  private int landlocked;

  public Country(String name) {
   this.name = name;
  }

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
    return areaInSquareKilometers;
  }

  public void setAreaInSquareKilometers(double areaInSquareKilometers) {
    this.areaInSquareKilometers = areaInSquareKilometers;
  }

  public String getCapitalName() {
    return capitalName;
  }

  public void setCapitalName(String capitalName) {
    this.capitalName = capitalName;
  }

  public int getLandlocked() {
    return landlocked;
  }

  public void setLandlocked(int landlocked) {
    this.landlocked = landlocked;
  }




//==================================================================================================







}

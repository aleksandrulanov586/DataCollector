package ru.skillbox;

public class Processor {
  //частота
  private final double frequency;
  //Количество ядер
  private final int numbercores;
  //Производитель
  private final String manufacturer;
  private final double weight;

  public Processor(double frequency, int numbercores, String manufacturer, double weight) {
    this.frequency = frequency;
    this.numbercores = numbercores;
    this.manufacturer = manufacturer;
    this.weight = weight;
  }

  public double getFrequency() {
    return frequency;
  }

  public int getNumbercores() {
    return numbercores;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public double getWeight() {
    return weight;
  }
}

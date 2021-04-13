package ru.skillbox;

public class Dimensions {
  // адрес доставки
  private final String deliveryAddress;
  // свойство — можно ли переворачивать
  private final String propertyIsItPossibleToFlip;
  //регистрационный номер
  private final String registrationNumber;
  //является ли груз хрупким.
  private final String isTheCargoFragile;
  // габариты
  private final int dimensions;
  //масса
  private final double weight;


  public Dimensions(int dimensions, double weight, String deliveryAddress,
      String propertyIsItPossibleToFlip, String registrationNumber,
      String isTheCargoFragile) {
    this.dimensions = dimensions;
    this.weight = weight;
    this.deliveryAddress = deliveryAddress;
    this.propertyIsItPossibleToFlip = propertyIsItPossibleToFlip;
    this.registrationNumber = registrationNumber;
    this.isTheCargoFragile = isTheCargoFragile;
  }


  public Dimensions setDeliveryAddress(String deliveryAddress) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions);
  }

  public Dimensions setPropertyIsItPossibleToFlip(String propertyIsItPossibleToFlip) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions);
  }

  public Dimensions setRegistrationNumber(String registrationNumber) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions);
  }

  public Dimensions setIsTheCargoFragile(String isTheCargoFragile) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions);
  }

  public Dimensions setWeight(double weight) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions);
  }

  public int getDimensions() {
    return dimensions;
  }

  public void setDimensions(int dimensions) {
    this.dimensions = dimensions;
  }

  public double getWeight() {
    return weight;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public String getPropertyIsItPossibleToFlip() {
    return propertyIsItPossibleToFlip;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public String getIsTheCargoFragile() {
    return isTheCargoFragile;
  }





}

package ru.skillbox;

public class Dimensions {
  // адрес доставки
  private final String deliveryAddress ;
  // свойство — можно ли переворачивать
  private final boolean propertyIsItPossibleToFlip;
  //регистрационный номер
  private final String registrationNumber;
  //является ли груз хрупким.
  private final String isTheCargoFragile;
  // габариты
  private final int dimensions;
  //масса
  private final double weight;


  public Dimensions(String deliveryAddress, boolean propertyIsItPossibleToFlip, String registrationNumber,
      String isTheCargoFragile, int dimensions, double weight) {
    this.dimensions = dimensions ;
    this.weight = weight;
    this.deliveryAddress = deliveryAddress;
    this.propertyIsItPossibleToFlip = propertyIsItPossibleToFlip;
    this.registrationNumber = registrationNumber;
    this.isTheCargoFragile = isTheCargoFragile;
  }




  public Dimensions setDeliveryAddress(String deliveryAddress) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions, weight);
  }

  public Dimensions setPropertyIsItPossibleToFlip(boolean propertyIsItPossibleToFlip) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions, weight);
  }

  public Dimensions setRegistrationNumber(String registrationNumber) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions, weight);
  }

  public Dimensions setIsTheCargoFragile(String isTheCargoFragile) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions, weight);
  }

  public Dimensions setWeight(double weight) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions, weight);
  }
  public Dimensions setDimensions(int dimensions) {
    return new Dimensions (deliveryAddress, propertyIsItPossibleToFlip,registrationNumber,isTheCargoFragile,dimensions, weight);
  }

  public int getDimensions() {
    return dimensions;
  }



  public double getWeight() {
    return weight;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public boolean getPropertyIsItPossibleToFlip() {
    return propertyIsItPossibleToFlip;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public String getIsTheCargoFragile() {
    return isTheCargoFragile;
  }





}

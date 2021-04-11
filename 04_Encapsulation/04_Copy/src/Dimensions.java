public class Dimensions {
  // габариты
private  int dimensions;
//масса
  private final   double weight;
  // адрес доставки
  private final   String deliveryAddress;
  // свойство — можно ли переворачивать
  private final String propertyIsItPossibleToFlip;
  //регистрационный номер
  private final String registrationNumber;
  //является ли груз хрупким.
  private final String isTheCargoFragile;

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





}

package ru.skillbox;



public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(" Tekst ", " можно переворачивать", " 154154", " Tekst", 100, 200.50);
        dimensions.setDimensions(100);
        dimensions.setDeliveryAddress("Tekst");
        dimensions.setIsTheCargoFragile("Tekst");
        dimensions.setRegistrationNumber("154154");
        dimensions.setWeight(200.50);
        dimensions.setPropertyIsItPossibleToFlip("можно переворачивать");
        Dimensions copy = new Dimensions(dimensions.getDimensions(),
                                         dimensions.getWeight(),
                                         dimensions.getDeliveryAddress(),
                                         dimensions.getPropertyIsItPossibleToFlip(),
                                         dimensions.getRegistrationNumber(),
                                         dimensions.getIsTheCargoFragile());


    }
}

package ru.skillbox;



public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions();
        dimensions.setDimensions(100);
        dimensions.setDeliveryAddress("Tekst");
        dimensions.setIsTheCargoFragile("Tekst");
        dimensions.setRegistrationNumber("152854");
        dimensions.setWeight(200);
        dimensions.setPropertyIsItPossibleToFlip("Tekst");
        Dimensions copy = new Dimensions(dimensions.getDimensions(),
            dimensions.getWeight(),
            dimensions.getDeliveryAddress(),
            dimensions.getPropertyIsItPossibleToFlip(),
            dimensions.getRegistrationNumber(),
            dimensions.getIsTheCargoFragile());


    }
}

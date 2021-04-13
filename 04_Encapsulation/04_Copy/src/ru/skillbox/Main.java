package ru.skillbox;



public class Main {

    public static void main(String[] args) {
        Dimensions copy = new Dimensions(copy.getDimensions(),
            copy.getWeight(),
            copy.getDeliveryAddress(),
            copy.getPropertyIsItPossibleToFlip(),
            copy.getRegistrationNumber(),
            copy.getIsTheCargoFragile());


        copy.setDimensions(100);
        copy.setDeliveryAddress("Tekst");
        copy.setIsTheCargoFragile("Tekst");
        copy.setRegistrationNumber("154154");
        copy.setWeight(200.50);
        copy.setPropertyIsItPossibleToFlip(true);



    }
}

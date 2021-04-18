package ru.skillbox;



public class Main {



    public static void main(String[] args) {
        Dimensions copy = new Dimensions("text", true,"text","text",10,10);



Dimensions dimensions = new Dimensions(copy);




System.out.println(copy);
System.out.println(dimensions);


            //copy.getWeight(),
           // copy.getDeliveryAddress(),
           // copy.getPropertyIsItPossibleToFlip(),
          //  copy.getRegistrationNumber(),
          //  copy.getIsTheCargoFragile());


       // copy.setDimensions(100);
       // copy.setDeliveryAddress("Tekst");
      //  copy.setIsTheCargoFragile("Tekst");
      //  copy.setRegistrationNumber("154154");
      //  copy.setWeight(200.50);
      //  copy.setPropertyIsItPossibleToFlip(true);



    }
}

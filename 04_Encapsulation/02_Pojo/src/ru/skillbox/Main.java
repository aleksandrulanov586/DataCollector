package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country country = new Country();

        country.setName("USA");
        country.setCapitalName("Washington");
        country.setLandlocked(2);
        country.setNumberPeople(100000);
        country.setAreaInSquareKilometers(9000000);
        System.out.println(" Название страны " + country.getName()  );
        System.out.println("Столица страны" + country.getCapitalName() );
        System.out.println(country.getLandlocked() );
        System.out.println(country.getNumberPeople() );
        System.out.println(country.getAreaInSquareKilometers() );
    }
}

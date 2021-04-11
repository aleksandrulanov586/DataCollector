package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country country = new Country();

        country.getName();
        country.getCapitalName();
        country.getLandlocked() ;
        country.getNumberPeople();
        country.getAreaInSquareKilometers();
        System.out.println(" Название страны " + country.getName() + "USA" );
        System.out.println("Столица страны" + country.getCapitalName() );
        System.out.println(country.getLandlocked() );
        System.out.println(country.getNumberPeople() );
        System.out.println(country.getAreaInSquareKilometers() );
    }
}

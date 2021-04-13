package ru.skillbox;

public class Main {

    public static void main(String []args) {
Book book = new Book("Tekst", "Tekst",100,200);
System.out.println(book.getName()+ " " + book.getAuthor()+ " " + book.getNumberISBN()+ " " + book.getNumberPages());

        Book book2 = new Book("Tekst2", "Tekst2",200,300);
        System.out.println(book2.getName()+ " " + book2.getAuthor()+ " " + book2.getNumberISBN()+ " " + book2.getNumberPages());

        Produck produck = new Produck("Produck",400);
        produck.setPrice(500);
        System.out.println(produck.getName()+ " " + produck.getPrice()+ " " + produck.getBarCode());

    }
}

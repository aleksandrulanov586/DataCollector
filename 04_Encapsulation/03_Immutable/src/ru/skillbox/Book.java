package ru.skillbox;

public class Book {

  private final String name;
  private final String author;
  private final int numberPages;
  private final int numberISBN;

  public Book(String name,String author,int numberPages,int numberISBN) {
    this.name = name;
    this.author = author;
    this.numberPages = numberPages;
    this.numberISBN = numberISBN;


  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumberPages() {
    return numberPages;
  }

  public int getNumberISBN() {
    return numberISBN;
  }


}

public class Printer
{


  //список документов
public  String stringQueue = "";
// общее количество страниц но ещё не распечатанных
public String pages;
// переменная которая хранит не распечатанные количество страниц
public int pagesInt = 0;
// общее количество документов но ещё не распечатаны
public String documents;
//переменная, в которой  храниться не распечатаны документы
public int documentsint = 0 ;

public int  documentPages = 0;

// свойства документов
  public  String documentText;
  public  String name;
public  int numberOfPages = 0;
  private int limit;

  public Printer () {
    increaseCount(1);
    stringQueue = "Список страниц:";
    this.limit = 1000;
  }
  public Printer (int limit) {
    this();
    this.limit = limit;
  }

  public Printer (String items, int totalPrice) {
    this();
    this.pages = this.pages + pages;
    this.pagesInt = pagesInt ;
  }


// принятие на печать 2 метода
  public  void accepForPrinting1(String stringQueue, String name, String documentText)
  {

 }
  public void accepForPrinting2(String stringQueue, String name, String documentText)
  {

  }
  //очищающий очередь печати (строку String queue).
  public  void  clear()

 {
   stringQueue = "";
   numberOfPages = 0;
 }

  // метод выводящий всю информацию о добавленных в принтер документах в консоль и очищающий очередь печати после этого.
 public void print(String title)

  {
    System.out.println(title);
    if(stringQueue.isEmpty()) {
      System.out.println("Принтер пустой");
    } else {
      System.out.println(stringQueue);
    }

  }

  //возвращающий общее количество страниц, добавленных в принтер, но ещё не распечатанных, а также соответствующую переменную, в которой будет храниться это количество.
 public  String  getPagesCount()

  {
return  stringQueue;

  }
  // возвращающий общее количество документов, которые добавлены в принтер, но ещё не распечатаны, а также соответствующую переменную, в которой будет храниться это количество.
 public  String getDocumentsCount()

  {
return documents;
  }
  // возвращающий общее количество распечатанных документов и страниц
 public  int returnOfDocumentsPages()

  {
return documentPages;
  }
}

public class Printer
{


  //список документов
public  String stringQueue = "";
// общее количество страниц но ещё не распечатанных
public int pages;
// переменная которая хранит не распечатанные количество страниц
public int pagesInt = 0;
// общее количество документов но ещё не распечатаны
public int documents;

  public int getDocumentsint() {
    return documentsint;
  }

  //переменная, в которой  храниться не распечатаны документы
public static int documentsint = 0 ;

public  int  documentPages = 0;

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

  public Printer (int pages, int pagesInt) {
    this();
    this.pages = this.pages + pages;
    this.pagesInt = pagesInt ;
  }

  public static void increaseCount(int documentsint) {
    Printer.documentsint = Printer.documentsint + documentsint;
  }
// принятие на печать 3 метода
  public  void accepForPrinting(String documentText)
  {
    stringQueue = stringQueue + name + documentText + pages ;
 }
  public void accepForPrinting(String name,String documentText)
  {
    stringQueue =  stringQueue + pagesInt;


  }
  public void accepForPrinting(String name, int pages, String documentText)
  {
    stringQueue = stringQueue + documentPages;
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
      clear();
    }

  }

  //возвращающий общее количество страниц, добавленных в принтер, но ещё не распечатанных, а также соответствующую переменную, в которой будет храниться это количество.
 public  int  getPagesCount()

  {
return  pages;


  }
  // возвращающий общее количество документов, которые добавлены в принтер, но ещё не распечатаны, а также соответствующую переменную, в которой будет храниться это количество.
 public  int getDocumentsCount()

  {
return documents;
  }
  // возвращающий общее количество распечатанных документов и страниц
 public  int returnOfDocumentsPages()

  {
return documentPages;
  }
}

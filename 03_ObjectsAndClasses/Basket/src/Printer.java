public class Printer
{
  //список документов
public  String stringQueue = "";

// свойства документов
  public  String documentText;
  public  String name;
public  int numberOfPages = 0;



  public static void main(String[] args)
  {

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
 public String print(String title)

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
//  public static int getDocumentsCount()

  {

  }
  // возвращающий общее количество распечатанных документов и страниц
//  public static int returnOfDocumentsPages()

  {

  }
}

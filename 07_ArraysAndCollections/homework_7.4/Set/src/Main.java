import java.util.Scanner;

public class Main {

  public  static  SetCollections ClassCollections = new SetCollections();
  public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);
    while (true){
      String input = scanner.nextLine();
      if (input.matches(SetCollections.TEXT))
        ClassCollections.add(input);
    }

  }

}

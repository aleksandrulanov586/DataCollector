import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        String lettersAndNumber = "АВЕКМНОРСТУХ" + "0123456789";
        String number = "0123456789";

        CoolNumbers coolNumbers = new CoolNumbers();
        coolNumbers.generateCoolNumbers(lettersAndNumber);
        System.out.println(coolNumbers.generateCoolNumbers());


    }
}

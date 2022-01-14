import java.util.ArrayList;
import java.util.Collections;
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

        CoolNumbers coolNumbers = new CoolNumbers();

        long m = System.currentTimeMillis();
        coolNumbers.bruteForceSearchInList("fdsfdfssf", "12233");
        System.out.println(coolNumbers.bruteForceSearchInList("dfsdfsd", "12151545"));


    }
}

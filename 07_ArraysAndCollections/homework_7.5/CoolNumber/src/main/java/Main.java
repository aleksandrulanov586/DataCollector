import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        CoolNumbers coolNumbers = new CoolNumbers();
        List<String> numbers = CoolNumbers.generateCoolNumbers();
        long start = System.currentTimeMillis();
        CoolNumbers.bruteForceSearchInList(numbers, "А172АА197");
        long result = System.currentTimeMillis() - start; // отнимаем из начала текущее время – получаем время, которое работал метод
        System.out.println("Поиск brute force занял " + result + " мс");

        List<String> numbers1 = CoolNumbers.generateCoolNumbers();
        long start1 = System.currentTimeMillis();
        CoolNumbers.binarySearchInList(numbers1, "А172АА197");
        long result1 = System.currentTimeMillis() - start1; // отнимаем из начала текущее время – получаем время, которое работал метод
        System.out.println("Поиск binary Search занял " + result1 + " мс");


        HashSet<String> numbers2 = CoolNumbers.generateCoolNumbers();
        long start2 = System.currentTimeMillis();
        CoolNumbers.searchInHashSet(new HashSet<>(numbers2), "А172АА197");
        long result2 = System.currentTimeMillis() - start2;
        System.out.println("Поиск searchIn HashSet занял " + result2 + " мс");

        TreeSet<String> numbers3 = CoolNumbers.generateCoolNumbers();
        long start3 = System.currentTimeMillis();
        CoolNumbers.searchInTreeSet(new TreeSet<>(numbers3), "А172АА197");
        long result3 = System.currentTimeMillis() - start3;
        System.out.println("Поиск searchIn TreeSet занял " + result3 + " мс");

    }
}

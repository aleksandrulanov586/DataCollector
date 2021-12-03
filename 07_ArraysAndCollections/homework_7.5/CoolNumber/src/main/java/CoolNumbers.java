import java.util.*;

public class CoolNumbers {
    public static List<String> list = new LinkedList<>();
    String LETTERS = "АВЕКМНОРСТУХ";
    String NUMBER = "0123456789";


    public static List<String> generateCoolNumbers() {
ArrayList<String> arrayList = new ArrayList<>();

        // String NumbersLetters = letters + numbers;
        for (int q = 0; q < 3000; q++) {

            // double GeneratingLetters1 = letters.length() * Math.random();
            for (int w = 0; w < 3000; w++) {
                double GeneratingLetters2 = 3000 * Math.random();
                for (int e = 0; e < 3000; e++) {
                    double GeneratingLetters3 = 3000 * Math.random();
                    for (int numder = 1; numder < 30000; numder++) {
                        //  int generatingNumbers = Integer.parseInt(numbers);
                        for (int GeneratingRegion = 1; GeneratingRegion < 199; GeneratingRegion++) {

                        }
                    }
                }
            }
        }


        return Collections.emptyList();
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        List<String> arrayList = new ArrayList();
        for (String text : arrayList) {
            System.out.println(text);
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return false;
    }

}

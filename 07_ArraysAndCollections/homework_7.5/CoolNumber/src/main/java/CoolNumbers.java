import java.util.*;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        String letters = "АВЕКМНОРСТУХ";
        String numbers = "0123456789";

        String NumbersLetters = letters + numbers;
        for (int q = 0; q < letters.length(); q++) {
            double GeneratingLetters1 = letters.length() * Math.random();
            for (int w = 0; w < letters.length(); w++) {
                double GeneratingLetters2 = letters.length() * Math.random();
                for (int e = 0; e < letters.length(); e++) {
                    double GeneratingLetters3 = letters.length() * Math.random();
                    for (int numder = 1; numder < 20000; numder++) {
                        int GeneratingNumber = (int) (numbers.length() * Math.random());
                        for (int t = 0; t < numbers.length(); t++) {
                            int GeneratingRegion = (int) (numbers.length() * Math.random());
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

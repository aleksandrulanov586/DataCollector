import java.util.*;

public class CoolNumbers {
    public static ArrayList<String> list = new ArrayList<>();
    public static String LETTERS = "АВЕКМНОРСТУХ";
    public static String NUMBER = "0123456789";


    public static List<String> generateCoolNumbers() {


        // String NumbersLetters = letters + numbers;
        for (int generatingLetters = 9; generatingLetters < 199; generatingLetters++) {
            list.add(String.valueOf(generatingLetters));

            for (int generatingLetters2 = 9; generatingLetters2 < 199; generatingLetters2++) {

                for (int generatingLetters3 = 9; generatingLetters3 < 199; generatingLetters3++) {

                    for (int numder = 9; numder < 199; numder++) {

                        for (int generatingRegion = 1; generatingRegion < 199; generatingRegion++) {

                        }
                    }
                }
            }
        }


        return list;
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

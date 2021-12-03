import java.util.*;

public class CoolNumbers {
    public static ArrayList<String> list = new ArrayList<>();
   public static String LETTERS = "АВЕКМНОРСТУХ";
   public static String NUMBER = "0123456789";


    public static List<String> generateCoolNumbers() {


        // String NumbersLetters = letters + numbers;
        for (int generatingLetters = 0; LETTERS.length() < 3000; generatingLetters++) {
            list.add(String.valueOf(generatingLetters));

            for (int generatingLetters2 = 0; LETTERS.length()  < 3000; generatingLetters2 ++) {
                list.add(String.valueOf(generatingLetters2));
                for (int generatingLetters3  = 0; LETTERS.length() < 3000; generatingLetters3++) {
                    list.add(String.valueOf(generatingLetters3));
                    for (int numder = 1; NUMBER.length() < 30000; numder++) {
                        list.add(String.valueOf(numder));
                        for (int generatingRegion = 1; LETTERS.length() < 199; generatingRegion++) {
                            list.add(String.valueOf(generatingRegion));
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

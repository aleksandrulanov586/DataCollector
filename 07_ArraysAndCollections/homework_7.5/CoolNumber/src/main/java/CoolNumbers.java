import java.util.*;

public class CoolNumbers {


    public static String LETTERS = "АВЕКМНОРСТУХ";


    public static List<String> generateCoolNumbers() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (char letter1 : LETTERS.toCharArray()) {
            for (int number = 1; number < 9; number++) {
                for (char letter2 : LETTERS.toCharArray()) {
                    for (char letter3 : LETTERS.toCharArray()) {
                        for (int region = 1; region < 199; region++) {
                            String result = letter1 + String.format("%03d", number) + letter2 + letter3 + region;
                            arrayList.add("" + result);


                        }
                    }
                }
            }
        }

        return arrayList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {

        //Collections.sort(arrayList);

        //Collections.binarySearch(sortedList, number);
        return Collections.binarySearch(sortedList, number) >= 0;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {

        return treeSet.contains(number);
    }

}

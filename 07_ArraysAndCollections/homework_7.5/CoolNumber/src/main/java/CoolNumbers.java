import java.util.*;

public class CoolNumbers {
    public static ArrayList<String> list = new ArrayList<>();
    public static String LETTERS = "АВЕКМНОРСТУХ";
    public static String NUMBER = "0123456789";


    public static List<String> generateCoolNumbers() {


        // String NumbersLetters = letters + numbers;
        for (char letter1 : LETTERS.toCharArray()) {

            for (int number = 1; number < 9; number++) {

                for (char letter2 : LETTERS.toCharArray()) {

                    for (char letter3 : LETTERS.toCharArray()) {

                        for (int region = 1; region < 199; region++){
                            list.add(String.valueOf(region));
                            list.add(String.valueOf(letter1));
                            list.add(String.valueOf(number));
                            list.add(String.valueOf(letter2));
                            list.add(String.valueOf(letter3));
                        }
                    }
                }
            }
        }




        return list;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        List<String> arrayList = new ArrayList();
        for (String s : arrayList) {
           if (arrayList.contains(number)){
               System.out.println(s);
           }

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

import java.util.*;

public class CoolNumbers {

  public static ArrayList<String> arrayList = new ArrayList<>();
  public static String LETTERS = "АВЕКМНОРСТУХ";
  public static String NUMBER = "0123456789";


  public static List<String> generateCoolNumbers() {

    for (char letter1 : LETTERS.toCharArray()) {

      for (int number = 1; number < 9; number++) {

        for (char letter2 : LETTERS.toCharArray()) {

          for (char letter3 : LETTERS.toCharArray()) {

            for (int region = 1; region < 199; region++) {
              arrayList.add(String.valueOf(letter1 + number + letter2 + letter3 + region));

            }
          }
        }
      }
    }

    return arrayList;
  }

  public static boolean bruteForceSearchInList(List<String> list, String number) {

    if (arrayList.contains(number)) {
      System.out.println(arrayList);
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

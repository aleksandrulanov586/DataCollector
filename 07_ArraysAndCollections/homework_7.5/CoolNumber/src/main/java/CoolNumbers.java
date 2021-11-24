import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        String AlphaNumericString = "А В Е К М Н О Р С Т У Х"

                + "0123456789";


        StringBuilder sb = new StringBuilder(n);


        for (int i = 0; i < AlphaNumericString.length(); i++) {


            int index = (int) (AlphaNumericString.length() * Math.random());


            // добавляем символ один за другим в конец sb

            sb.append(AlphaNumericString

                    .charAt(index));
            return Collections.emptyList();
        }
    }
        public static boolean bruteForceSearchInList (List < String > list, String number){
            return false;
        }

        public static boolean binarySearchInList (List < String > sortedList, String number){
            return false;
        }


        public static boolean searchInHashSet (HashSet < String > hashSet, String number){
            return false;
        }

        public static boolean searchInTreeSet (TreeSet < String > treeSet, String number){
            return false;
        }

    }

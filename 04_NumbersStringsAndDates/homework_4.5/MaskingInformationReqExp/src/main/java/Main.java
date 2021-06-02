public class Main {

    public static void main(String[] args) {

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений



        String searchNumbers = "\\d";
        String deletingNumbers = text.replaceAll(searchNumbers, " ");
        String searchForLost = "[,.\\-;]";
        String removeСommas = deletingNumbers.replaceAll(searchForLost, " ");
        String removeСommasw = removeСommas.replaceAll(searchForLost, " ");

        String[] words = removeСommas.split("\\s+");

        String result = "";

        for (String word : words) {

            result += word +  System.lineSeparator();


        }

        return result.trim();

        return text;
    }

}
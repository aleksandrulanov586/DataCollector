import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  }
  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String wordsText = "";
    String[] words = wordsText.split("\\s+");


    for (String word : words) {
      wordsText = "Alice was beginning to get very tired of sitting by her sister on the bank, \"\n"
          + "        + \"and of having nothing to do: once or twice she had peeped into the book her sister was reading, \"\n"
          + "        + \"but it had no pictures or conversations in it, and where is the use of a book, \"\n"
          + "        + \"thought Alice, without pictures or conversations? \"\n"
          + "        + \"So she was considering in her own mind, (as well as she could, for the hot day made her feel very sleepy and stupid,) \"\n"
          + "        + \"whether the pleasure of making a daisy-chain was worth the trouble of getting up and picking the daisies, \"\n"
          + "        + \"when a white rabbit with pink eyes ran close by her.\\n\"\n"
          + "        + \"There was nothing very remarkable in that, nor did Alice think it so very much out of the way to hear the rabbit say to itself\"\n"
          + "        + \" \\\"dear, dear! I shall be too late!\\\" (when she thought it over afterwards, it occurred to her that she ought to have wondered at this,\"\n"
          + "        + \" but at the time it all seemed quite natural); but when the rabbit actually took a watch out of its waistcoat-pocket, \"\n"
          + "        + \"looked at it, and then hurried on, Alice started to her feet, for it flashed across her mind\"\n"
          + "        + \" that she had never before seen a rabbit with either a waistcoat-pocket or a watch to take out of it, and, \"\n"
          + "        + \"full of curiosity, she hurried across the field after it, and was just in time to see it pop down a large rabbit-hole under the hedge. \"\n"
          + "        + \"In a moment down went Alice after it, never once considering how in the world she was to get out again." ;


      wordsText += word + System.lineSeparator();

    }
if (wordsText.equals(wordsText)){
  return wordsText;

}

    return "";
  }

}
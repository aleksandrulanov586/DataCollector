import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {

    int day = 31;
    int month = 12;
    int year = 1990;

    System.out.println(collectBirthdays(year, month, day));

  }

  public static String collectBirthdays(int year, int month, int day) {

    //TODO реализуйте метод для построения строки в следующем виде
    //0 - 31.12.1990 - Mon
    //1 - 31.12.1991 - Tue
    month--;

    SimpleDateFormat format = new SimpleDateFormat("- dd.MM.yyyy - EE", Locale.ENGLISH);
    Calendar birthday = new GregorianCalendar(year, month, day, 0, 0, 0);
    Calendar today = new GregorianCalendar();

    System.out.println(birthday.getTime());
    System.out.println(today.getTime());
    if (today.getTimeInMillis() == birthday.getTimeInMillis()) {
      birthday.after(today);

      return birthday.toString();
    }
    String result = "";
    for (int i = 0; birthday.getTimeInMillis() <= today.getTimeInMillis(); i++) {
      result = result +  i + " " + format.format(birthday.getTime()) + "\n";
      birthday.after(today);
      birthday.add(Calendar.YEAR, 1);
    }
    return result;

  }
}


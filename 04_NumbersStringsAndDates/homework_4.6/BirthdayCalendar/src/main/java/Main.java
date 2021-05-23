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

      StringBuilder builder = new StringBuilder();
      SimpleDateFormat format = new SimpleDateFormat("0 - dd.hh.yyyy - EE", Locale.ENGLISH);
      Calendar calendar = new GregorianCalendar(year, month, day, 0, 0, 0);
      Calendar calendar2 = new GregorianCalendar();
      month--;
      if (month == -1) {
        month = 0;
      }
      System.out.println(calendar.getTime());
      System.out.println(calendar2.getTime());
      if (calendar2.getTimeInMillis() == calendar.getTimeInMillis()) {
        builder.append(format.format(calendar.getTime())).append("\n");
        return builder.toString();
      }


      for (int i = 0; calendar.getTimeInMillis() <= calendar2.getTimeInMillis(); i++) {
        builder.append(format.format(calendar.getTime())).append("\n");
        calendar.add(Calendar.YEAR, 1);
      }
      return builder.toString();
    }
    }


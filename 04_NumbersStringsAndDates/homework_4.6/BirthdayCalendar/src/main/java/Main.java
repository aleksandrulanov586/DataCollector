import java.text.SimpleDateFormat;
import java.util.Date;

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
     Date d = new Date();
      SimpleDateFormat format1;
      SimpleDateFormat format2;
      format1 = new SimpleDateFormat(
          "dd.MM.yyyy hh:mm");
      format2 = new SimpleDateFormat(
          "День dd Месяц MM Год yyyy Время hh:mm");
      System.out.println(
          format1.format(d)  // 25.02.2013 09:03
      );
      System.out.println(
          format2.format(d)
          // День 25 Месяц 02 Год 2013 Время 09:03
      );
        return "";
    }
}

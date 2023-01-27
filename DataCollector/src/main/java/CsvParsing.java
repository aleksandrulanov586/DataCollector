import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CsvParsing {

    public static Set<Date> getDatesListFromFile(String dataFile) {

        Set<Date> datesList = new HashSet<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataFile));
            for (int i = 0; i < lines.size(); i++) {
                if (i == 0) {
                    continue;
                }
                String[] fragments = lines.get(i).split(",");
                if (fragments.length != 2) {
                    System.out.println("Wrong line: " + i);
                    continue;
                }

                String stationName = fragments[0];
                String date = fragments[1];
                Date dates = new Date(stationName, date);
                datesList.add(dates);


            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return datesList;
    }
}

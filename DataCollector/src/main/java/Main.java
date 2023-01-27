import org.json.simple.JSONObject;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {

//      Парсинг веб-страницы:
    String url = "https://skillbox-java.github.io/";

//      - получение HTML-кода:
    WebParsing.getHTMLCode(url);

//      - получение списка линий и станций:
    List<Line> lineList = WebParsing.getLinesList();
    List<Station> stationList = WebParsing.getStationsList();

//      Поиск файлов в папках, получение списков файлов:
    Path path = Paths.get("src/main/resources/data");
    List<String> csvFiles = FindFiles.findCsvFiles(path);
    List<String> jsonFiles = FindFiles.findJsonFiles(path);

//      Парсинг JSON файлов:
    HashSet<Depth> depthsList = new HashSet<>();
    for (String json : jsonFiles) {
      depthsList.addAll(JsonParsing.parseDepthsList(json));
    }

    depthsList.forEach(depth -> {
      String d = depth.getDepth();
      d = d.replace(',', '.');
      d = d.replace('−', '-');
      depth.setDepth(d);
    });

//      Парсинг CSV файлов:
    HashSet<Date> datesList = new HashSet<>();
    for (String csv : csvFiles) {
      datesList.addAll(CsvParsing.getDatesListFromFile(csv));
    }

    addDateToStation(stationList, datesList);
    addDepthToStation(stationList, depthsList);
    addLineToStation(stationList, lineList);

    MetroMsk metroMsk = new MetroMsk(stationList);

    JSONObject mapMskMetro = WriteToJsonFile.buildMapMskMetroJson(stationList, lineList);
    WriteToJsonFile.writeFiles("src/main/resources/map.json", mapMskMetro);

    WriteToJsonFile.createJsonMetroFile("src/main/resources/", metroMsk);

  }

  public static void addDateToStation(List<Station> stationList, HashSet<Date> datesList) {

    for (Station station : stationList) {

      String sn = station.getStationName();
      Iterator<Date> iterator = datesList.iterator();

      while (iterator.hasNext()) {
        Date date = iterator.next();
        String dn = date.getStationName();
        if (dn.contains("ё") || sn.contains("ё")) {
          dn = dn.replace("ё", "е");
          sn = sn.replace("ё", "е");
        }
        if (dn.equalsIgnoreCase(sn)) {
          station.setDate(date.getDate());
          iterator.remove();
          break;
        }
      }
    }
  }


  public static void addDepthToStation(List<Station> stationList, HashSet<Depth> depthsList) {

    for (Station station : stationList) {

      String sn = station.getStationName();
      Iterator<Depth> iterator = depthsList.iterator();

      while (iterator.hasNext()) {
        Depth depth = iterator.next();
        String dn = depth.getStationName();
        if (dn.contains("ё") || sn.contains("ё")) {
          dn = dn.replace("ё", "е");
          sn = sn.replace("ё", "е");
        }
        if (dn.equalsIgnoreCase(sn)) {
          if (!depth.getDepth().equals("?")) {
            station.setDepth(Float.parseFloat(depth.getDepth()));
          }
          iterator.remove();
          break;
        }
      }

    }

    for (Depth depth : depthsList) {
      for (Station station : stationList) {
        if (depth.getStationName().equalsIgnoreCase(station.getStationName())) {
          if (station.getDepth() > Float.parseFloat(depth.getDepth())) {
            station.setDepth(Float.parseFloat(depth.getDepth()));
          }
        }
      }


    }
  }


  public static void addLineToStation(List<Station> stationList, List<Line> lineList) {

    stationList.forEach(station ->
        lineList.forEach(line -> {
          if (station.getLineNumber().equals(line.getLineNumber())) {
            station.setLine(line);
          }
        }));
  }

}

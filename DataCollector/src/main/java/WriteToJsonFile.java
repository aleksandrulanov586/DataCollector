import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class WriteToJsonFile {

  private final static String baseFile = "stations.json";

  //  записываем объекты в файл
  public static void writeFiles(String path, JSONObject jsonObject) {

    try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
      out.write(jsonObject.toJSONString());
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  //  map.json

  // создаем объект метро с ключами станции, линии
  public static JSONObject buildMapMskMetroJson(List<Station> stationsList, List<Line> linesList) {
    JSONObject MapMskMetro = new JSONObject();

    MapMskMetro.put("stations", createLineAndStationsArr(stationsList));
    MapMskMetro.put("lines", createLinesArray(linesList));

    return MapMskMetro;
  }

//   создаем у станций - значение: объект "номер линии - массивы названий станций"

  private static JSONObject createLineAndStationsArr(List<Station> stationsList) {

    JSONObject lineAndStationsArr = new JSONObject();
    JSONArray stationsArr = new JSONArray();
    String n = "";

    for (Station stations : stationsList) {

      if (stations.getLineNumber().equals(n)) {
        stationsArr.add(stations.getStationName());
      } else {
        stationsArr = new JSONArray();
        n = stations.getLineNumber();
        stationsArr.add(stations.getStationName());
        lineAndStationsArr.put(n, stationsArr);

      }

    }
    return lineAndStationsArr;
  }

//     создаем у линий массив из объектов (с номерами и именами линий)

  private static JSONArray createLinesArray(List<Line> linesList) {

    JSONArray linesArray = new JSONArray();

    for (Line lines : linesList) {

      JSONObject lineObj = new JSONObject();
      lineObj.put("number", lines.getLineNumber());
      lineObj.put("name", lines.getLineName());
      linesArray.add(lineObj);
    }

    return linesArray;
  }

//    station.json

  public static void createJsonMetroFile(String path, MetroMsk metroMsk) throws IOException {

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    objectMapper.writeValue(new File(path + baseFile), metroMsk);

  }

}

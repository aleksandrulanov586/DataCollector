import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebParsing {

  private static Document document;

  public static void getHTMLCode(String url) {

    try {
      document = Jsoup.connect(url).get();

    } catch (IOException e) {
      e.printStackTrace();

    }
  }

  public static List<Line> getLinesList() {

    List<Line> linesList = new ArrayList<>();

    Elements lineElements = document.select("span[data-line]");
    lineElements.forEach(lineElement -> {
      String lineNumber = lineElement.attr("data-line");
      String lineName = lineElement.text();
      Line line = new Line(lineNumber, lineName);
      linesList.add(line);
    });
    return linesList;
  }

  public static List<Station> getStationsList() {

    List<Station> stationsList = new ArrayList<>();

    Elements lineElements = document.select("span[data-line]");
    lineElements.forEach(lineElement -> {
      String lineNumber = lineElement.attr("data-line");

      Elements stationElements = document.select("div[data-depend-set = lines-" + lineNumber + "]");
      stationElements.forEach(stationElement -> {

        Elements singleStation = stationElement.select(".single-station");
        singleStation.forEach(ss -> {
          String stationName = ss.select(".name").text();
          List<String> connectionsArr = new ArrayList<>();
          Station station;
          Elements connection = ss.getElementsByAttribute("title");
          boolean hasConnection = connection.size() != 0;
          if (hasConnection) {
            connection.forEach(c -> {
              String connectionInfo = c.attr("title");

              Pattern pattern = Pattern.compile("«(.*?)»");
              Matcher matcher = pattern.matcher(connectionInfo);
              while (matcher.find()) {
                String connectionStation = connectionInfo.substring(matcher.start(1),
                    matcher.end(1));
                connectionsArr.add(connectionStation);
              }
            });
            station = new Station(stationName, lineNumber, true, connectionsArr);
          } else {
            station = new Station(stationName, lineNumber, false);
          }
          stationsList.add(station);
        });


      });
    });
    return stationsList;
  }
}

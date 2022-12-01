

package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static org.example.Line.parseLines;
import static org.example.Station.parseStation;


public class Main {
    private String lineName;
    private String lineNumber;
    static String jsonLines = null;
    String jsonStation = null;
    static Document document;

    static {
        try {
            document = Jsoup.connect("https://skillbox-java.github.io/").get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Element all = document.select("body > div > div > div").first();

    static Element metrodata = all.getElementById("metrodata");
    static List<Station> station = parseStation(metrodata);
    static List<Line> lines = parseLines(metrodata);
    Element dataLine = all.getElementById("data-line");

    public static void main(String[] args) throws IOException {

        assert all != null;


        metrodata.select("div[data-line]")
                .forEach(element -> {
                    String lineNumber = element.attr("data-line");
                    element.select("p.single-station").forEach(
                            singleStationElement -> {
                                String stationOnLineName = singleStationElement.text();

                                stationOnLineName = stationOnLineName.replaceAll("\\d+.", "").trim();
                                for (Line line : lines) {
                                    if (line.getLineNumber().contains(lineNumber)) {
                                        List<String> stations = new ArrayList<>();
                                        element.select("p[single-station]").forEach(
                                                singleStationElement2 -> {
                                                    String stationOnLineName2 = singleStationElement.text();
                                                    stationOnLineName2 = stationOnLineName2.replaceAll("\\d+.", "").trim();
                                                    stations.add(stationOnLineName2);
                                                });
                                    }


                                }
                            }
                    );

                });


       /* lines.stream().map()
        List<Line> lines1 = lines.stream().collect(Collectors.toList());

        for (String r : lines1.toArray().keySet()
             ) {

        }*/

        ObjectMapper objectMapper = new ObjectMapper();
        jsonLines = objectMapper.writeValueAsString(lines);
        //  jsonStation = objectMapper.writeValueAsString(station);

        System.out.println(jsonLines);

       /* document = Jsoup.connect("https://skillbox-java.github.io/").get();

        Element all = document.select("body > div > div > div").first();
        assert all != null;
        Elements station = all.select("p[class=single-station]");

        Elements station1 = document.getElementById("metrodata").select("div[data-depend-set=lines-1]");
        Elements line = document.getElementById("metrodata").select("span[data-line=\"1\"]");
        Elements namber = document.getElementById("metrodata").select("div[class=js-metro-stations t-metrostation-list-table data-line=]");


        String line1 = line.text();
        String stationText = station1.text();
        String namber1 = namber.text();
        System.out.println(namber);
        ObjectMapper mapper = new ObjectMapper();*/


    }

    static void addStation(Station station) {
        for (Line line : lines) {
        metrodata.select("div[data-line]")
                .forEach(element -> {
                    String lineNumber = element.attr("data-line");
                    if(line.getLineNumber().equals(lineNumber)) {
                        element.select("p.single-station").forEach(
                                singleStationElement -> {
                                    String stationOnLineName = singleStationElement.text().replaceAll("\\d+.", "").trim();
                                    Station station = new Station(stationOnLineName);
                                    line.addStation(station);

                                  }
                    }
                        );
                    }
                });



    }
}

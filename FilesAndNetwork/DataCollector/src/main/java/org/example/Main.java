

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


        ObjectMapper objectMapper = new ObjectMapper();
        jsonLines = objectMapper.writeValueAsString(lines);


        System.out.println(jsonLines);


    }


}

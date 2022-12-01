package org.example;

import org.jsoup.nodes.Element;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.Main.lines;
import static org.example.Main.metrodata;

public class Line {

    private static List<Station> stations;
    private String lineName;
    private String lineNumber;

    public Line(String lineName, String lineNumber) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;

    }


    public String getLineName() {
        return lineName;
    }

    public String getLineNumber() {
        return lineNumber;
    }


    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    static List<Line> parseLines(Element metrodata) {
        return metrodata.select("span[data-line]")
                .stream()
                .map(e -> {
                    String lineName = e.text();
                    String lineNumber = e.attr("data-line");


                    return new Line(lineName, lineNumber);
                })
                .collect(Collectors.toList());
    }

    static void addStation(Station station) {
        for (Line line : lines) {
            metrodata.select("div[data-line]")
                    .forEach(element -> {
                        String lineNumber = element.attr("data-line");
                        if (line.getLineNumber().equals(lineNumber)) {
                            element.select("p.single-station").forEach(
                                    singleStationElement -> {
                                        String stationOnLineName = singleStationElement.text().replaceAll("\\d+.", "").trim();
                                        Station station2 = new Station(stationOnLineName);
                                        line.addStation(station2);

                                    }
                            );
                        }
                    });


        }

    }
}
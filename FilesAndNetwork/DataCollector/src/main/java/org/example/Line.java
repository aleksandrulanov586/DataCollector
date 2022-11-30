package org.example;

import org.jsoup.nodes.Element;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Line {


    private String lineName;
    private String lineNumber;

    public Line(String lineName, String lineNumber) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;

    }

    private static List<String> LIN;


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


}

package org.example;

import org.jsoup.nodes.Element;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Line {


    private String lineName;
    private String lineNumber;
    private Map<String, String> LinkedHashMap = new LinkedHashMap<>();

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
        return metrodata.select("div[data-line]")
                .stream()
                .map(e -> {
                    String lineName = e.text();
                    String lineNumber = e.attr("p[single-station]");
                    return new Line(lineName, lineNumber);
                })
                .collect(Collectors.toList());
    }


}

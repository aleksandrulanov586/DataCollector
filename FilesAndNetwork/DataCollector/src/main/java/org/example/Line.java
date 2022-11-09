package org.example;

import org.jsoup.nodes.Element;

import java.util.List;
import java.util.stream.Collectors;

public class Line {
    private String lineName;
    private String lineNumber;

    public String getLineName() {
        return lineName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public Line(String lineName, String lineNumber) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;
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
    static List<Line> parseStation(Element metrodata) {
        return metrodata.select("span[data-line=1]")
                .stream()
                .map(e -> {
                    String lineName = e.text();
                    String lineNumber = e.attr("data-line=1");
                    return new Line(lineName, lineNumber);
                })
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "{" + "\n" +"lineName "+    lineName + "\n" + "{" + "\n"  + "\n" + "lineNumber " +  lineNumber;
    }
}

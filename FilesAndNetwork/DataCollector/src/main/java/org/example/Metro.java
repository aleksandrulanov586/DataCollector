package org.example;

import org.example.Main;
import org.jsoup.nodes.Element;

import java.util.List;
import java.util.stream.Collectors;

public class Metro {
    public String getLineName() {
        return lineName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    private String lineName;

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    private String lineNumber;

    public Metro(String lineName, String lineNumber) {

    }

    static List<Metro> parseLines(Element metrodata) {
        return metrodata.select("span[data-line]")
                .stream()
                .map(e -> {
                    String lineName = e.text();
                    String lineNumber = e.attr("data-line");
                    return new Metro(lineName, lineNumber);
                })
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "{" + "\n" + lineName + "\n" + "{" + "\n" + "lineName" + "\n" + "lineNumber" + "\n" + lineNumber;
    }
}

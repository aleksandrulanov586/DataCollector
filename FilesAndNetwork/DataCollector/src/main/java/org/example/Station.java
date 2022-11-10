package org.example;

import org.jsoup.nodes.Element;

import java.util.List;
import java.util.stream.Collectors;

public class Station {
    private String stationName;
    public Station(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    static List<Station> parseStation(Element metrodata) {
        return metrodata.select("div[data-depend-set=lines-1]")
                .stream()
                .map(e -> {
                    String stationName = e.text();

                    return new Station(stationName);
                })
                .collect(Collectors.toList());
    }




}

package org.example;

import java.io.Serializable;

public class Metro implements Serializable {

    public String getLine() {
        return line;
    }

    public String getStation() {
        return station;
    }

    public String getStations() {
        return stations;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setStations(String stations) {
        this.stations = stations;
    }

    String line;
    String station;

    public Metro(String line, String station, String stations) {
        this.line = line;
        this.station = station;
        this.stations = stations;
    }

    String stations;





    @Override
    public String toString() {
        return "Line{" + line + '\'' + "station" + station + '\''+ '}';

    }
}
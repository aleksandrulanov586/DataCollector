package org.example;

import java.io.Serializable;

public class Metro implements Serializable {

    String line;
    String station;

    public Metro(String line, String station) {
        this.line = line;
        this.station = station;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }




    @Override
    public String toString() {
        return "Line{" + line + '\'' + "station" + station + '\''+ '}';

    }
}
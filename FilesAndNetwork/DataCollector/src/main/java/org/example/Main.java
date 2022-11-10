

package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static org.example.Line.parseLines;
import static org.example.Station.parseStation;


public class Main {
    private String lineName;
    private String lineNumber;


    public static void main(String[] args) throws IOException {
        String jsonLines = null;
        String jsonStation = null;
        Document document = Jsoup.connect("https://skillbox-java.github.io/").get();
        Element all = document.select("body > div > div > div").first();
        assert all != null;
        Element metrodata = all.getElementById("metrodata");
        List<Station> station = parseStation(metrodata);
        List<Line> lines = parseLines(metrodata);
        ObjectMapper objectMapper = new ObjectMapper();
        jsonLines = objectMapper.writeValueAsString(lines);
      //  jsonStation = objectMapper.writeValueAsString(station);
        System.out.println( jsonLines +  jsonStation);

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


}



package org.example;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    private static List<Line> parseLines(Element metrodata) {
        return metrodata.select("span[data-line]")
                .stream()
                .map(e -> {
                    String lineName = e.text();
                    String lineNumber = e.attr("data-line");
                    return new Metro(lineName, lineNumber);
                })
                .collect(Collectors.toList());
    }
    public static void main(String[] args) throws IOException {
        Document document = null;
        Element metrodata = document.getElementById("metrodata");
        List<Line> lines = parseLines(metrodata);

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
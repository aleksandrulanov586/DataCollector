

package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Metro.parseLines;


public class Main {
    private String lineName;
    private String lineNumber;


    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://skillbox-java.github.io/").get();
        Element all = document.select("body > div > div > div").first();
        assert all != null;
        Element metrodata = all.getElementById("metrodata");
        List<Metro> lines = parseLines(metrodata);

        lines.stream().forEach(System.out::println);

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

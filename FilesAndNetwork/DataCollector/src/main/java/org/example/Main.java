

package org.example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://skillbox-java.github.io/").get();

        Element all = document.select("body > div > div > div").first();
        assert all != null;
        Elements station = all.select("p[class=single-station]");

        Elements station1 = document.getElementById("metrodata").select("div[data-depend-set=lines-1]");
        Elements line = document.getElementById("metrodata").select("span[data-line=\"1\"]");
        Elements namber = document.getElementById("metrodata").select("div[data-depend=\"{'toggle-slide':'lines-1'}\"ln-1]");


        String line2 = line.text();
        String stationText = station1.text();

        System.out.println(namber );
        ObjectMapper mapper = new ObjectMapper();




    }
}
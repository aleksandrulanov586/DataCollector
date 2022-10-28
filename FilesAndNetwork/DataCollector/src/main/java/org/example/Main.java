

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
      //  Elements line3 = document.getElementById("metrodata").select("div [class=\"js-toggle-depend s-depend-control-single  s-depend-control-active");
        Elements line = document.getElementById("metrodata").select("span[data-line-1]");
        Elements line = document.getElementById("metrodata").select("span[data-line-1]");
       // String line4 = line3.text();
        String line2 = line.text();
        //Metro metro = new Metro(line4 );
        System.out.println(line2);
       /* ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(metro);
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/


    }
}
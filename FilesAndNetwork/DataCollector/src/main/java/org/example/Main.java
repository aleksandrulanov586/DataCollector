

package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {


        Document document = Jsoup.connect("https://skillbox-java.github.io/").get();

        Element all = document.select("body > div > div > div").first();
        assert all != null;
        Elements station = all.select("p[class=single-station]");

        Elements line = document.getElementById("metrodata").select("span[data-line]");
        ObjectMapper objectMapper = new ObjectMapper();
      //  Metro car = objectMapper.readValue(new File("src/test/resources/json_car.json"), Car.class);
            String ele = String.valueOf(line);

        Pattern pattern = Pattern.compile("[А-яЁ-ё]+");
        Matcher matcher = pattern.matcher(ele);
        System.out.println(ele);
        if (matcher.find()) ;
        {
            System.out.println(matcher.group());


        }
       /* ObjectMapper objectMapper = new ObjectMapper();
        try {
            Post skillbox = objectMapper.readValue(new URL("https://skillbox-java.github.io/ "), Post.class);
            System.out.println(skillbox);
        } catch (IOException e) {

            e.printStackTrace();
        }*/


    }
}

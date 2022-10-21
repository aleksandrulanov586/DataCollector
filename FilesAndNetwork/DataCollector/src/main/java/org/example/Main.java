package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import javax.lang.model.util.Elements;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://skillbox-java.github.io/").get();

        Element all = document.select("body > div > div > div").first();
        assert all != null;
        Elements station = all.select("p[class=single-station]");
        // Elements line= all.select("div[class=js-toggle-depend s-depend-control-single ]");
        Elements line= all.select("div [class=js-toggle-depend s-depend-control-single ] ");


        String text = all.text();
        String text2 = station.text();
        String text3= line.text();
        System.out.println(text3);



        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Post skillbox = objectMapper.readValue(new URL("https://skillbox-java.github.io/ "), Post.class);
            System.out.println(skillbox);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




       /* Element all = document.select("body > div > div > div").first();
        assert all != null;
        Elements station = all.select("p[class=single-station]");
        // Elements line= all.select("div[class=js-toggle-depend s-depend-control-single ]");
        Elements line= all.select("div [class=js-toggle-depend s-depend-control-single  s-depend-control-active] ");


        String text = all.text();
        String text2 = station.text();
        String text3= line.text();
        System.out.println(text3);*/

    }
}

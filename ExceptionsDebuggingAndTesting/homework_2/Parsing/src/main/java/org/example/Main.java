package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

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

    }
}
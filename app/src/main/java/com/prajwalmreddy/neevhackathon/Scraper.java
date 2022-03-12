package com.prajwalmreddy.neevhackathon;

import org.jsoup.Jsoup;

import java.util.ArrayList;

public class Scraper {
    public static ArrayList<String> scrape(String url) {
        ArrayList<String> results = new ArrayList<>();

        try {
            Jsoup.connect(url);
        } catch (Exception error) {
            results.add(error.getMessage());
            return results;
        }

        results.add("Hey There");
        return results;
    }
}

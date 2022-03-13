package com.prajwalmreddy.neevhackathon;

import java.net.HttpURLConnection;
import java.net.URL;

public class Searcher {
    String topic;
    final String url = "https://localhost:5000"; // Hardcode The Server Url For Now

    public Searcher(String topic) {
        this.topic = topic;
    }

    public String search() {
        try {
            URL url = new URL(this.url);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (Exception error) {
            return error.toString();
        }

        return this.topic;
    }
}

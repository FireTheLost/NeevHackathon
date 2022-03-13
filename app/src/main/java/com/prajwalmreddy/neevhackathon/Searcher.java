package com.prajwalmreddy.neevhackathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Searcher {
    protected static String search(String topic) {
        HttpURLConnection conn;
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder("");

        try {
            // Connect To The Server
            URL url = new URL("https://192.168.1.13:5000"); // Hardcode The URL For Now
            // HTTP Request
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            // Get Response
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }

            reader.close();
        } catch (Exception error) {
            return error.toString();
        }

        return topic;
    }
}

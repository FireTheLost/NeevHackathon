package com.prajwalmreddy.neevhackathon;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Searcher extends AsyncTask<String, Void, String> {
    protected String doInBackground(String... strings) {
        String url1 = strings[0];

        HttpURLConnection conn;
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder("");

        try {
            URL url = new URL(url1);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }

            reader.close();
        } catch (Exception error) {
            return error.toString();
        }

        return responseContent.toString();
    }
}

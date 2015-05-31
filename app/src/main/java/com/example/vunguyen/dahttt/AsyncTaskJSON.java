package com.example.vunguyen.dahttt;

import android.os.AsyncTask;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by vunguyen on 5/31/2015.
 */
public class AsyncTaskJSON extends AsyncTask <String , JSONObject, JSONObject> {
    public ArrayList arrayListObject = null;
    public AsyncTaskJSON(ArrayList arrayListObject){
        this.arrayListObject = arrayListObject;
    }
    @Override
    protected JSONObject doInBackground(String... params) {
        JSONObject jsonObj = null;
        String url = params[0];
        Gson gson = new Gson();
        try {
            jsonObj = new JSONObject(readUrl(url));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObj;
    }

    public static String readUrl(String urlString) throws IOException {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}

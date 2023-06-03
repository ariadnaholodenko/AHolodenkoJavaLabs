package edu.ntudp.fit.Lab4;

import com.google.gson.Gson;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        gson = new Gson();
    }

    public String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}



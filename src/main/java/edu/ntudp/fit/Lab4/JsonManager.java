package edu.ntudp.fit.Lab4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public String toJson(Object object) {
        return gson.toJson(object);
    }

    public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }

    public void writeJsonToFile(String json, String filePath) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(json);
        }
    }

    public String readJsonFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }
    }
}




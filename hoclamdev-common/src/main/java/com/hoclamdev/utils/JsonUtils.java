package com.hoclamdev.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.experimental.UtilityClass;

public class JsonUtils {

    private static Gson gson = new Gson();

    private JsonUtils() {}

    public static JsonObject objectToJson(Object data) {
        try {
            return gson.toJsonTree(data).getAsJsonObject();
        } catch (Exception ex) {
            return null;
        }
    }
}

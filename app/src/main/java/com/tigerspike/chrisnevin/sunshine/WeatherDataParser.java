package com.tigerspike.chrisnevin.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chris.nevin on 29/07/2016.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException {
        final String JSON_LIST_KEY = "list";
        final String JSON_TEMP_KEY = "temp";
        final String JSON_MAX_KEY = "max";

        return new JSONObject(weatherJsonStr)
                .getJSONArray(JSON_LIST_KEY)
                .getJSONObject(dayIndex)
                .getJSONObject(JSON_TEMP_KEY)
                .getDouble(JSON_MAX_KEY);
    }

}

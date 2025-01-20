package io;

import java.util.HashMap;
import java.util.Map;

public class CsvFoodHeader {
    public static final Map<String, Integer> fields = new HashMap<>();

    public static void CsvLoadFoodHeader(String header) {
        String[] headers = header.split(",");
        for (int i = 0; i < headers.length; i++) {
            fields.put(headers[i].replaceAll("\"", ""), i);
        }
    }

    public static int getFieldIndex(String name){
        return fields.get(name);
    }
}

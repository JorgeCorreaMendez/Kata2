package io;

import model.Food;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static io.CsvFoodHeader.*;

public class FileFoodLoader implements FoodLoader {
    private final File file;
    private final FoodDeserializer deserializer;

    public FileFoodLoader(File file, FoodDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    @Override
    public List<Food> load() throws IOException {
        List<Food> foods = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            CsvLoadFoodHeader(reader.readLine());
            while(true){
                String line = reader.readLine();
                if(line == null) break;
                foods.add(deserializer.deserialize(line));
            }
        }

        return foods;
    }
}

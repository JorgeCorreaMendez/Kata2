package io;

import model.Food;

import java.io.File;
import java.util.List;

public class FileFoodLoader implements FoodLoader {
    private final File file;
    private final FoodDeserializer deserializer;

    public FileFoodLoader(File file, FoodDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    @Override
    public List<Food> load() {
        return List.of();
    }
}

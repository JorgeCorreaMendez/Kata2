package io;

import model.Food;

public class CsvFoodDeserializer implements FoodDeserializer {
    @Override
    public Food deserialize(String line) {
        return deserialize(line.split(","));
    }

    private Food deserialize(String[] fields) {

    }
}

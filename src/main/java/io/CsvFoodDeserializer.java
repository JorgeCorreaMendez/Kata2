package io;

import model.Food;

import static io.CsvFoodHeader.getFieldIndex;

public class CsvFoodDeserializer implements FoodDeserializer {
    @Override
    public Food deserialize(String line) {
        return deserialize(line.split(","));
    }

    private Food deserialize(String[] fields) {
        return new Food(fields[getFieldIndex("food")],
                parseDouble(fields[getFieldIndex("calories")]),
                parseDouble(fields[getFieldIndex("protein")]),
                parseDouble(fields[getFieldIndex("total_fat")]),
                parseDouble(fields[getFieldIndex("carbohydrates")])
        );
    }

    private Double parseDouble(String value) {
        if(value.equals("NA")) return 0.0;
        return Double.parseDouble(value);

    }
}

package io;

import model.Food;

public interface FoodDeserializer {
    Food deserialize(String line);
}

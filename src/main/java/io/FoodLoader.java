package io;

import model.Food;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FoodLoader {
    List<Food> load() throws FileNotFoundException, IOException;
}

import io.CsvFoodDeserializer;
import io.FileFoodLoader;
import model.Food;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/nutrition.csv");
        try {
            List<Food> foods = new FileFoodLoader(file, new CsvFoodDeserializer()).load();
            for (Food food : foods) {
                System.out.println(food);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}

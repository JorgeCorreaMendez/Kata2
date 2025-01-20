package model;

public record Food(String name, Double calories, Double Protein , Double fat, Double carbohydrates) {
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", calories=" + calories + "kcal" +
                ", Protein=" + Protein + "g" +
                ", fat=" + fat + "g" +
                ", carbohydrates=" + carbohydrates + "g" +
                '}';
    }
}

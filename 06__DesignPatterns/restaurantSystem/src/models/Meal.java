package models;

import java.util.List;

public class Meal {
    private int mealId;
    private List<MealItem> items;

    public boolean addMealItem(MealItem item) {
        return true;
    }
}

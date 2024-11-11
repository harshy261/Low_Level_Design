package models;

import java.util.List;

public class Kitchen {
    private int kitchenId;
    private List<Chef> chefs;

    public boolean addChef(Chef chef) {
        return true;
    }
}

package models;

import java.util.List;

public class Menu {
    private int menuId;
    private String type;
    private List<MenuSection> sections;

    public boolean updateMenuSection(MenuSection section) {
        return true;
    }
}

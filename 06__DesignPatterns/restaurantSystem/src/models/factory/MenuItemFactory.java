package models.factory;

import models.MenuItem;

public class MenuItemFactory {
    public static MenuItem createMenuItem(int menuItemId, String title, String desc, float price) {
        return new MenuItem(menuItemId,title,desc,price);
    }

}

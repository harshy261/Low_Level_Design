package models.factory;

import models.MenuItem;

public class MenuManagement {
    public void addMenuItem(int id, String title, String desc, float price) {
        MenuItem item = MenuItemFactory.createMenuItem(id,title,desc,price);
        //add items to the menu
    }
}

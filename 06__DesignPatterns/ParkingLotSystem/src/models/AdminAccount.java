package models;

import Interface.Account;
import Interface.ParkingSpot;
import constants.AccountStatus;

public class AdminAccount extends Account {

    //khud ki kuch poperties bhi hongi vo add kardo
    public boolean addParkingSpot(ParkingSpot spot) {
        //add your impl here
        return false;
    }
    public boolean addEntrance(Entrance entry) {
        //add your impl here
        return false;
    }

    public boolean addExit(Exit exit) {
        //add your impl here
        return false;
    }

    public boolean addDisplayBoard(DisplayBoard board) {
        //add your impl here
        return false;
    }


    @Override
    public boolean resetPassword() {
        //add your own impl here
        return false;
    }
}

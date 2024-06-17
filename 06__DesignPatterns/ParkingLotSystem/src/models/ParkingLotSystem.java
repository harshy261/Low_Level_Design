package models;

import Interface.ParkingSpot;
import Interface.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotSystem {
    private int id;
    private String name;
    private String address;
    private final int MAX_CAPACTIY = 40000;
    private Map<String, Entrance> entrances;
    private Map<String, Exit> exits;
    private  ParkingRate parkingRate;
    private Map<String, DisplayBoard> displayBoards;
    private Map<String, ParkingTicket> parkingTickets;
    private Map<String, ParkingSpot> parkingSpots;

    //instance
    private static ParkingLotSystem parkingLot = null;
    //singleton design pattern
    private ParkingLotSystem() {
        //add your impl here
    }

    //getInstance
    public static ParkingLotSystem getInstance() {
        //TODO: will this work in multi-threaded env
        if(parkingLot == null) {
            parkingLot = new ParkingLotSystem();
        }
        return parkingLot;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        //add your impl here
        return null;
    }

    public boolean isFull() {
        //add ur logic here
        return false;
    }

    public boolean addEntrance(Entrance entrance) {return false;}
    public boolean addExit(Exit exit) {return false;}
    // add more methods here


}

package models;

import constants.ReservationStatus;
import models.observer.Observer;
import models.observer.Subject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int reservationId;
    private Date reservationTime;
    private int totalCount;
    private ReservationStatus status;
    private String instructions;
    private Customer customer;
    private Table table;

    public ReservationStatus getStatus() {
        return this.status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
        //important hai -> jaise hi status change ho, waise hi sabhi ko
        //remionders/notifications send kardo
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: observers) {
            obs.update();
        }
    }

    @Override
    public void removeObserver(Observer obs) {
        //TODO: add a validation here
        observers.remove(obs);
    }

    @Override
    public void addObserver(Observer obs) {
        if(!observers.contains(obs)) {
            observers.add(obs);
        }
    }



    public boolean updateReservation(int count) {
        return true;
    }

}

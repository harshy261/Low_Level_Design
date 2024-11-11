package models;

import constants.ReservationStatus;
import models.observer.Observer;

import java.util.Date;

public class Notification implements Observer {
    private int notificationId;
    private Date creationTime;
    private String content;
    private Reservation reservation;

    public Notification(Reservation reservation) {
        this.reservation = reservation;
        //important
        this.reservation.addObserver(this);
    }


    public void sendNotification() {}

    @Override
    public void update() {
        //agar mera status confirmed hua hai, toh hi notification send karo
//        if(reservation.getStatus() == ReservationStatus.CONFIRMED) {
//            System.out.println("Aapki Reservation confirm hogyi h dost");
//        }
        System.out.println("Notification send kardo");
    }
}

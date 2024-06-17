package models;

import Interface.Payment;

public class CashPayment extends Payment {

    @Override
    public boolean initiateTransaction() {
        //add your orwn implementaion here
        return false;
    }
}

package models;

import constants.AccountStatus;

public class Account {
    private String accountId;
    private String password;
    private String address;
    private AccountStatus status;


    public boolean resetPassword() {
        //dummy
        return true;
    }
}

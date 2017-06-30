package com.nearsoft.apprentice.srp.bad;


public class Modem implements IModem {

    boolean status;

    public boolean Dial(String phoneNumber) {

        if (phoneNumber != null) {
            System.out.print("Dialing ... " + phoneNumber);
            status = true;
            return status;
        }
        return false;
    }

    public boolean Hangup() {

        if (status == true) {
            status = false;
        }
        return status;
    }

    public boolean SendMsg(String msg) {
        if (msg != null) {
            System.out.print("Sending ... ");
            status = true;
            return status;
        }
        return false;
    }

    public boolean RecieveMsg() {
        System.out.print("Recieved! ");
        return true;
    }
}

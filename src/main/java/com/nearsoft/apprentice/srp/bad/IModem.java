package com.nearsoft.apprentice.srp.bad;

public interface IModem {

    boolean Dial(String phoneNumber);
    boolean Hangup();
    boolean SendMsg(String msg);
    boolean RecieveMsg();

}

package com.nearsoft.apprentice.dip.bad;

public class App {

    public static void main(String...args){

        Player player = new Player();
        player.setName("Messi");
        player.setNumber(10);


        Barcelona barcelona = new Barcelona();
        player.setTeam(barcelona);

    }

}

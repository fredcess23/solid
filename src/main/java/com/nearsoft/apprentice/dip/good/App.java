package com.nearsoft.apprentice.dip.good;

public class App {

    public static void main(String...args){

        Player player = new Player();
        player.setName("Messi");
        player.setNumber(10);


        ITeam barcelona = new Barcelona();
        player.setTeam(barcelona);

    }

}

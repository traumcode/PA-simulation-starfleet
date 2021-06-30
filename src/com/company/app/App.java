package com.company.app;

import com.company.ship.*;

public class App {

    public static void main(String[] args) {
        CommandCenter commandCenter = new CommandCenter();

        Spacestation spacestation1 = new Spacestation("Miramar", 2300, commandCenter);
        Spacestation spacestation2 = new Spacestation("Alpha Centauri", 2150, commandCenter);
        Spacestation spacestation3 = new Spacestation("Proxima", 2243, commandCenter);

        CargoShip cargoShip = new CargoShip("s5452", 2500, commandCenter);



        System.out.println(commandCenter.getListOfAllSpacecrafts());
    }
}

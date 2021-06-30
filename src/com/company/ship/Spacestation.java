package com.company.ship;

import java.util.List;

public class Spacestation  extends Spacecraft{
    private int numberOfDockedShips;
    private List<String> logOfAllDiscoveries;

    public Spacestation(String name, int year, CommandCenter commandCenter) {
        super(name, year, ShipType.SPACESTATION, commandCenter);
    }

    public int getNumberOfDockedShips() {
        return numberOfDockedShips;
    }

    public List<String> getLogOfAllDiscoveries() {
        return logOfAllDiscoveries;
    }

    public void dockShip() {
        this.numberOfDockedShips++;
    }
}

package com.company.ship;

public class Discovery extends MobileVessel{
    public Discovery(String name, int year, CommandCenter commandCenter) {
        super(name, year, ShipType.DISCOVERYSHIP, commandCenter);
    }
}

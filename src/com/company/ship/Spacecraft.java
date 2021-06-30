package com.company.ship;

import java.util.UUID;

public abstract class Spacecraft {
    protected UUID registrationID;
    protected String name;
    protected int year;
    protected ShipType shipType;
    private CommandCenter commandCenter;

    public Spacecraft(String name, int year, ShipType shipType, CommandCenter commandCenter) {
        this.registrationID = UUID.randomUUID();
        this.name = name;
        this.year = year;
        this.shipType = shipType;
        this.commandCenter = commandCenter;
        this.commandCenter.addSpacecraft(this);
    }

    public ShipType getType(Spacecraft spacecraft) {
        return spacecraft.getShipType();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public ShipType getShipType() {
        return shipType;
    }
}

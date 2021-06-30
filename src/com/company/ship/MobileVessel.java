package com.company.ship;

import java.util.ArrayList;
import java.util.List;

public class MobileVessel extends Spacecraft {
    private int maximumSpeed;
    private boolean isDocked;

    public MobileVessel(String name, int year, ShipType shipType,CommandCenter commandCenter) {
        super(name, year, shipType, commandCenter);
        isDocked = false;

        if(shipType.equals(ShipType.CARGO)){
            if(year < 2150) {
                maximumSpeed = 120;
            } else {
                maximumSpeed = 165;
            }
        } else {
            if(year < 2150) {
                maximumSpeed = 420;
            } else {
                maximumSpeed = 465;
            }
        }

    }

    public boolean isDocked() {
        return isDocked;
    }

    public void dock(Spacestation spacestation) {
        if(spacestation.getNumberOfDockedShips() > 1) {
            System.out.println("There are no more free docks on this spacestation.");
        } else {
            spacestation.dockShip();
            isDocked = true;

        }
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }
}

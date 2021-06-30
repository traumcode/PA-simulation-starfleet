package com.company.ship;

import java.util.ArrayList;
import java.util.List;

public class CommandCenter {
    public List<Spacecraft> listOfAllSpacecrafts = new ArrayList<>();

    public List<Spacecraft> getListOfAllSpacecrafts() {
        return listOfAllSpacecrafts;
    }

    public void addSpacecraft(Spacecraft spacecraft) {
        listOfAllSpacecrafts.add(spacecraft);
    }
}

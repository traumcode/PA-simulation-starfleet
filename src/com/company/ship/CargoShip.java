package com.company.ship;

import java.util.List;

public class CargoShip extends MobileVessel{
    private List<Cargo> cargoList;

    public CargoShip(String name, int year, CommandCenter commandCenter) {
        super(name, year, ShipType.CARGO, commandCenter);
    }

    public void putDownCargo(Cargo cargo, int quantity){
        for (Cargo cargo1 : cargoList) {
            if(cargo1 == cargo) {
                cargo.setQuantity(quantity);
                if(cargo.getQuantity() == 0) {
                    cargoList.remove(cargo);
                }
            }
        }
    }

    public void pickUpCargo(Cargo cargo) {
        this.cargoList.add(cargo);
    }


}

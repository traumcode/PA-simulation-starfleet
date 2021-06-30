package com.company.ship;

public class Cargo {
    private int quantity;
    private CargoType cargoType;

    public int getQuantity() {
        return quantity;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }
}

package ru.aston.hometask03.adapter;

public class AdapterUnit extends Unit {

    private AdaptableUnit adaptableUnit;

    public AdapterUnit(AdaptableUnit adaptableUnit) {
        this.adaptableUnit = adaptableUnit;
    }

    public Integer DoubleValue() {
        return adaptableUnit.getAmount() * 2;
    }

}

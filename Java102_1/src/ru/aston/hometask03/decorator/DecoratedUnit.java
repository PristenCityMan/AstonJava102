package ru.aston.hometask03.decorator;

public class DecoratedUnit extends InnerUnit {

    private InnerUnit innerUnit;

    public DecoratedUnit(InnerUnit innerUnit) {
        super(innerUnit.getName());
        this.innerUnit = innerUnit;
    }

    @Override
    public String getName() {
        return "Decor " + innerUnit.getName();
    }
}

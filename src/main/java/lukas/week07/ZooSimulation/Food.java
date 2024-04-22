package lukas.week07.ZooSimulation;

import java.util.Vector;

public class Food {
    private String name;

    private double pricePerUnit;
    private Unit unit;

    public static enum Unit {
        STK,
        STK100,
        GRAMM,
        KILOGRAMM,
        MILLILITER,
        LITER,
        BALLEN,
        PACKUNG

    };

    //---constructor---
    public Food(String name, Unit unit, double pricePerUnit) {
        this.name = name;
        this.unit = unit;
        this.pricePerUnit = pricePerUnit;

    }

    //---get/set
    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public Unit getUnit() {
        return unit;
    }
}

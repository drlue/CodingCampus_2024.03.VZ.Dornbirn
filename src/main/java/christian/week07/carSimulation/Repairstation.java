package christian.week07.carSimulation;

public class Repairstation {
    private String name;

    public Repairstation(String name) {
        this.name = name;
    }
    //==================================================================================================================get=====================

    public String getName() {
        return name;
    }

    //==================================================================================================================set=====================
    //==================================================================================================================methods=================

    public void repairCar(Car car) {
        car.getEngine().repair(car, this.name);
    }

    public void changeEngine(Car car, Engine engine) {
        car.setEngine(engine);
    }

    public void changeTank(Car car, Tank tank) {
        car.setTank(tank);
    }
}

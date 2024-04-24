package christian.week07.carSimulation;

public class GasStation {
    private String name;

    public GasStation(String name){
        this.name = name;
    }
    //==================================================================================================================get======================

    public String getName() {
        return name;
    }

    //==================================================================================================================set======================
    //==================================================================================================================methods==================
    public void refillTank(Car car){
        double amount = car.getTank().getTankCapacity() - car.getTank().getTankLevel();
        car.getTank().setTankLevel(car.getTank().getTankCapacity());
        System.out.printf("%s %ss tank has been refilled with %.2f liters!%n",car.getHersteller(),car.getModell(),amount);
    }
}

package christian.week07.carSimulationRemastered;


import java.util.Random;

public class Main {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        Repairstation repairstation =  new Repairstation("RepairWorkshop");
        GasStation gasStation = new GasStation("Oberscheider Carworld");
        Engine engineV8 = new Engine(120, Engine.DriveType.GASOLINE);
        Tank tank60 = new Tank(60);
        Car car1 = new Car("Toyota","MR2",1000, engineV8,tank60);
        car1.drivingSimulation(400000,gasStation,repairstation);
    }
}

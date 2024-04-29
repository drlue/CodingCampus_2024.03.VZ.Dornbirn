package christian.week07.carSimulation;

import java.util.Random;

public class Main {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        Repairstation repairstation =  new Repairstation("RepairWorkshop");
        GasStation gasStation = new GasStation("Oberscheider Carworld");
        Engine engineV8 = new Engine(8,30, Engine.Antriebsart.BENZIN);
        Tank tank60 = new Tank(60);
        Car car1 = new Car("Toyota","MR2",1000, engineV8,tank60);
        car1.driveByGyula(5000,repairstation,gasStation);
    }

}

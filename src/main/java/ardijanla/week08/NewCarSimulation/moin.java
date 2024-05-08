package ardijanla.week08.NewCarSimulation;

import java.util.Random;

public class moin {
    static Random rnd = new Random();

    public static void main(String[] args) {
        //Erstelle tank
        Tank tank123 = new Tank(100);
        Tank tank156 = new Tank(214);
        Tank tank121 = new Tank(213);




        //erstelle motoren für Repairstation
        Engine n40 = new Engine("n40", Engine.DriveType.DIESEL, 213, 45, "BMW-Werke");
        Engine n35 = new Engine("n35", Engine.DriveType.ELECTRIC, 45, 83, "BMW-Werke");
        Engine n31 = new Engine("n31", Engine.DriveType.GASOLINE, 45, 83, "BMW-Werke");
        //Repairstation
        RepairStation repairStation = new RepairStation();
        repairStation.addEngineToInventory(n40);
        repairStation.addEngineToInventory(n35);
        repairStation.addEngineToInventory(n31);
        repairStation.addTanksToInventory(tank123);
        repairStation.addTanksToInventory(tank156);
        repairStation.addTanksToInventory(tank121);


        //erstelle motoren für die autos
        Engine n55 = new Engine("n55", Engine.DriveType.DIESEL, 420, 81, "BMW-Werke");
        Engine AudiMotor = new Engine("m3Motor", Engine.DriveType.GASOLINE, 420, 81, "Audi-Werke");


        // Erstellung von Car-Objekten
        Car audi = new Car("Audi", "A4",900,AudiMotor,tank123);
        Car tesla = new Car("Tesla", "Model S", 300, n55, tank121);

        // Fahren und Betanken des Audi
        System.out.println("Audi vor dem Fahren:");
        audi.leftCapacity();
        audi.drive(100); // 100 km fahren
        audi.leftCapacity();
        audi.fillCar(20); // 20 Liter Diesel hinzufügen
        audi.leftCapacity();

        // Fahren und Betanken des Tesla
        System.out.println("Tesla vor dem Fahren:");
        tesla.leftCapacity();
        tesla.drive(150); // 150 km fahren
        tesla.leftCapacity();
        tesla.fillCar(12); // 40 kWh Energie hinzufügen
        tesla.leftCapacity();


    }


}

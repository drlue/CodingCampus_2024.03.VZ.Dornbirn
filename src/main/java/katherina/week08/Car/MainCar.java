package katherina.week08.Car;

public class MainCar {
    public static void main(String[] args) {

        Car audiA2 = new Car("Audi", "A2", 66, 42, 1030, Car.Antriebsart.DIESEL);
        Car changLi = new Car("Chang Li", "Freeman", 1.2, 5.5, 323, Car.Antriebsart.STROM);
        Car nissan = new Car("Nissan", "X-Trailer", 130, 80, 1665, Car.Antriebsart.DIESEL);
        Car vw = new Car("VW", "Polo Classic", 77, 45, 950, Car.Antriebsart.BENZIN);
        Car linienbus = new Car("Mercedes Benz", "Citaro G", 240, 197, 28000, Car.Antriebsart.GAS);

        Car drivetestAuto = new Car("Crashtest-Dummy", "Caput Kaputt", 45, 5, 855, Car.Antriebsart.DIESEL);

        int distanz = 120;

        audiA2.drive(distanz);
        changLi.drive(distanz);
        nissan.drive(distanz);
        vw.drive(distanz);
        linienbus.drive(distanz);

//        drivetestAuto.drive(distanz);
    }
//Laut Google hat der Chang Li Freeman eine Reichweite von 40 bis 100km je nach Gelände. Ich habe durch Herumprobieren mit den Werten
    //geguckt, mit welcher "Tankfüllung" das Auto ca. 80km hat und die dann als Wert festgelegt. Eigentlich vergleichen wir hier Äpfel mit Birnen.

}

//Erweitere das vorhergende Beispiel um die Klassen
//
//Engine (Motor)
//Tank
//GasStation
//RepairStation
//Sowohl Tank und Motor sollen in Car als Attribute existieren und durch die RepairStation austauschbar sein.
//
//Eine Engine soll nach einer zufälligen Wahrscheinlichkeit einen Defekt haben und in der RepairStation getauscht werden. Je mehr Kilometer gefahren wurden, desto höher ist die Wahrscheinlichkeit, dass die Engine kaputt geht.
//
//Wenn die Car nicht die gewünschten Kilometer fährt, so ist entweder der Tank leer, oder der Motor kaputt. Erstelle Methoden der Car Klasse die den Tankinhalt und den Zustand des Motors (defekt oder ganz) zurückgeben.
//
//Wird die drive(int kilometers) Methode ausgeführt, so soll nun eine Methode im Motor aufgerufen werden, die diesen startet, und nach den gefahrenen Kilomtern wieder stoppt. Auch der Treibstoffverbrauch soll mit dem Motor zusammenhängen. Vielleicht ist es eine gute Idee beim Starten den Tank an den Motor zu übergeben?
//
//Erstelle folgende Subklassen von Tank
//Battery
//FuelTank

package demian.week09.car;

public class Car {

    //BAUSTELLE
// private DriveType;
    private String manufacturer;
    private String modell;
    private int powerInkW;
    private int fuelAmount;
//BAUSTELLE
//    public enum DriveTypes {PETROL, DIESEL, GAS, ELECTRICITY}

    public String getModell() {
        return modell;
    }

    public int getPowerInkW() {
        return powerInkW;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getWeight() {
        return weight;
    }


    ;
    private int weight;

    // ===== KONSTRUKTOR =====


    public Car(String manufacturer, String modell, int powerInkW, int fuelAmount, int weight) {
        this.manufacturer = manufacturer;
        this.modell = modell;
        this.powerInkW = powerInkW;
        this.fuelAmount = fuelAmount;
        this.weight = weight;
    }

    // ====== GETTER / SETTER ============

    public String getManufacturer() {
        return manufacturer;
    }


    // ====== FUNKTONEN ============

    public int roadtrip(int tripKilometer) {
        // Kraftstoffverbrauch basierend auf dem Gewicht und der Leistung des Autos
        double tripUsage = tripKilometer * (0.000033 * weight + 0.0002 * powerInkW); // Annahme: Gewicht in kg, kW als Leistung
        // Überprüfung ob der Tankinhalt ausreicht
        if (tripUsage <= fuelAmount) {
            fuelAmount -= tripUsage; // Tankinhalt reduzieren
            return tripKilometer; // Strecke erfolgreich zurückgelegt
        } else {
            // Tankinhalt reicht nicht aus, um die gesamte Strecke zurückzulegen
            // Berechne die maximal mögliche Strecke, die mit dem verbleibenden Kraftstoff zurückgelegt werden kann
            int maximalMoeglicheStrecke = (int) (fuelAmount / (0.001 * weight + 0.0015 * powerInkW));
            fuelAmount = 0; // Tank ist leer
            return maximalMoeglicheStrecke; // Gib die maximal mögliche Strecke zurück
        }


    }

    public void refuel(double amount) {
        fuelAmount += amount; // Fülle den Tank um die angegebene Menge Kraftstoff auf
    }
}

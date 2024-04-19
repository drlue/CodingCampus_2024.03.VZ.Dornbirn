package demian.week08.Zoo;

import ardijanla.ConsoleColors;

public class Tier {
    private String name;
    private String gattung;

    // ===== KONSTRUKTOR ======
    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    // ====== GETTER / SETTER =======

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    // ====== toString ======

    @Override
    public String toString() {
        String formatiert = String.format("%sTier: " + name + ", Gattung:" + gattung + "%s", ConsoleColors.PURPLE, ConsoleColors.RESET);
        return formatiert;
    }
}

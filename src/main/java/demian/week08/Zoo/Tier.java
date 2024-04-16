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

    // ====== toString ======

    @Override
    public String toString() {
        String formatiert = String.format("%sTier: " + name + ", Gattung:" + gattung + "%s", ConsoleColors.PURPLE, ConsoleColors.RESET);
        return formatiert;
    }
}
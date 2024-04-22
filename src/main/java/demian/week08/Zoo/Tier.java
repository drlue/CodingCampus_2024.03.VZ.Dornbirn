package demian.week08.Zoo;

import ardijanla.ConsoleColors;

public class Tier {
    private String name;
    private String gattung;
    private int maxHealth;
    private int currentHealth;
    private int biteStrength;




    // ===== KONSTRUKTOR ======
    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        maxHealth = 10;
        currentHealth = maxHealth;
        biteStrength = 2;
    }

    // ====== GETTER / SETTER =======

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public int getBiteStrength() {
        return biteStrength;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }


    public void setCurrentHealth(int biteDamage) {
        this.currentHealth = (this.currentHealth-biteDamage);
    }

    // ====== toString ======

    @Override
    public String toString() {
        String formatiert = String.format("%sTier: " + name + ", Gattung:" + gattung + "%s", ConsoleColors.PURPLE, ConsoleColors.RESET);
        return formatiert;
    }
}

package christian.week06.tiergartenRemastered;

import ardijanla.ConsoleColors;

import java.util.Map;

public class Tier {
    private String name;
    private String gattung;
    private Futter futter;
    private float futterMenge;
    private boolean gefuettert;

    private enum Status {
        LEBENDIG,
        TOT
    }

    private Status status;
    private int maxHP;
    private int hp;
    private int biss;


    public Tier(String name, String gattung, Futter futter, float futterMenge, int maxHP, int biss) {
        this.name = name;
        this.gattung = gattung;
        this.futter = futter;
        this.status = Status.LEBENDIG;
        this.futterMenge = futterMenge;
        this.gefuettert = false;
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.biss = biss;
    }

    public void printStructure() {

        System.out.println("|       |---" + name + "," + gattung);
    }

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public void getFutterBedarf(Map<Futter, Float> futterBedarf) {
        if (futterBedarf.containsKey(futter)) {
            futterBedarf.put(futter, futterBedarf.get(futter) + futterMenge);
        } else {
            futterBedarf.put(futter, futterMenge);
        }
    }

    public void fuettern(Pfleger pfleger) {
        if (this.status == Status.LEBENDIG) {
            gefuettert = true;
            System.out.printf("|---%s,%s wurde von %s gefuettert\n", name, gattung, pfleger.getName());
        } else {
            System.out.printf("%s ist tot und braucht nichts mehr zu essen!\n", this.name);
        }

    }

    public void resetGefuettert() {
        gefuettert = false;
    }

    public void sterben() {
        if (status == Status.LEBENDIG && this.hp <= 0) {
            status = Status.TOT;
        }
    }

    public boolean lebendig() {
        if (status == Status.LEBENDIG) {
            return true;
        } else {
            return false;
        }
    }

    public int getHp() {
        if (status == Status.LEBENDIG) {
            return hp;
        } else {
            return 0;
        }
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void beissen(Tier nachbar) {
        if (nachbar.status == Status.LEBENDIG && this.status == Status.LEBENDIG) {
            System.out.printf("%s beisst %s\n", this.name, nachbar.getName());
            nachbar.hpAenderung((this.biss * -1));
        }
    }

    public void hpAenderung(int hpModifier) {
        this.hp = hp + hpModifier;
        if (this.hp <= 0) {
            this.sterben();
            System.out.println();
            System.out.printf(ConsoleColors.RED + "%s ist gestorben!\n"+ ConsoleColors.RESET, this.name);
            System.out.println();
        }
    }
}

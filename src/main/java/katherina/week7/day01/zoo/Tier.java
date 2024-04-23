package katherina.week7.day01.zoo;


import java.util.Random;

public class Tier {
    public Random random = new Random();

    private String name;
    private String gattung;
    private Gehege gehege;
    private int gesundheit;
    private int maxGesundheit;
    private int biss;


    private Status status;

    private enum Status {
        LEBENDIG,
        TOT
    }

    public Tier(String name, String gattung, int gesundheit, int maxGesundheit, int biss) {
        this.name = name;
        this.gattung = gattung;
        this.gesundheit = gesundheit;
        this.maxGesundheit = maxGesundheit;
        this.biss = biss;
        this.status = Status.LEBENDIG;
    }

    public boolean lebendig() {
        if (status == Status.LEBENDIG) {
            return true;
        } else {
            return false;
        }
    }

    public void sterben() {
        if (status == Status.LEBENDIG && this.gesundheit <= 0) {
            status = Status.TOT;
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getGattung() {
        return this.gattung;
    }

    public Gehege getGehege() {
        return gehege;
    }

    void setGehegeIntern(Gehege gehege) {
        this.gehege = gehege;
    }

    public void setGehege(Gehege gehege) {
        if (gehege != null) {
            gehege.addTier(this);
        } else if (gehege == null && this.gehege != null) {
            this.gehege.removeTier(null);
        }
    }


    public void printStructure() {
        System.out.printf("│        ├── %s, %s %n", name, gattung);
    }


    public void bissBerechnung(Tier beisser, Tier opfer) {
        System.out.printf("%s beißt %s mit einer Stärke von %d. ", beisser.getName(), opfer.getName(), beisser.biss);
        opfer.gesundheit = opfer.gesundheit - beisser.biss;
        if (opfer.gesundheit > 0) {
            System.out.printf("%s hat noch %d Lebenspunkte übrig.%n", opfer.getName(), opfer.gesundheit);
        } else{
            opfer.sterben();
            System.out.printf("%s ist an den Verletzungen gestorben!%n", opfer.name);
        }
    }

    public float aktuelleGesundheit(){
        return gesundheit / (float)maxGesundheit;
    }

    public void geheilt(Tierarzt tierarzt) {
        float healfactor = Zoo.random.nextFloat(1.3f, 2.0f);
        int geboosteteGesundheit = Math.min(maxGesundheit, (int) (gesundheit * healfactor));
        if (gesundheit != geboosteteGesundheit) {
            System.out.printf("%s heilt %s (von %d Lebenspunkten auf %d Lebenspunkte).%n",
                    tierarzt.getName(),
                    name,
                    gesundheit, geboosteteGesundheit
            );
        } else {
            System.out.printf("%s hat nichts zu tun und geht wieder.%n",
                    tierarzt.getName()
            );
        }
        gesundheit = geboosteteGesundheit;
    }

}


package katherina.week7.day01.zoo;


public class Tier {
    private String name;
    private String gattung;
    private Gehege gehege;
    private int gesundheit;
    private final int maxGesundheit;
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
    }

    public void sterben() {
        if (status == Status.LEBENDIG && this.gesundheit <= 0) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getGattung() {
        return this.gattung;
    }

    public int getGesundheit() {
        if (status == Status.LEBENDIG) {
            return gesundheit;
        } else {
            return 0;
        }
    }

    public int getMaxGesundheit() {
        return this.maxGesundheit;
    }

    public int getBiss(Tier sameGehege) {
        if (sameGehege.status == Status.LEBENDIG && this.status == Status.LEBENDIG) {
            System.out.printf("%s beisst %s\n", this.name, sameGehege.getName());
            sameGehege.bissBerechnung((this.biss * -1));
        }
        return this.biss;
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


    public void bissBerechnung(int berechnung) {
        this.gesundheit = gesundheit - biss;
        if (this.gesundheit <= 0) {
            this.sterben();
            System.out.println();
            System.out.printf("%s ist gestorben!\n", this.name);
            System.out.println();
        } else if (this.gesundheit >= this.maxGesundheit) {
            gesundheit = maxGesundheit;
        }
    }


}
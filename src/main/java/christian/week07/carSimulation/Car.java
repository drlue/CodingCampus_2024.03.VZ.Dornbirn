package christian.week07.carSimulation;

public class Car {
    private String hersteller;
    private String modell;
    private double kW;
    private double gewicht;
    private double tankInhalt;

    enum Antriebsart {BENZIN, DIESEL, GAS, STROM}

    private Antriebsart antriebsart;

    public Car(String hersteller,String modell,double kW,double gewicht,double tankInhalt,Antriebsart antriebsart){
        this.hersteller = hersteller;
        this.modell = modell;
        this.kW = kW;
        this.gewicht = gewicht;
        this.tankInhalt = tankInhalt;
        this.antriebsart = antriebsart;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public void tanken(double kraftstoffmenge){
        tankInhalt+=kraftstoffmenge;
    }

    public int drive(int kilometer) {
        int strecke = 0;
        while (tankInhalt > 0 && kilometer > 0) {

            switch (antriebsart) {
                case GAS -> tankInhalt -= ((gewicht / kW) / 1.1)/100;
                case BENZIN -> tankInhalt -= ((gewicht / kW) / 1.2)/100;
                case DIESEL -> tankInhalt -= ((gewicht / kW) / 1.3)/100;
                case STROM -> tankInhalt -= ((gewicht / kW) / 1.6)/100;
            }
            kilometer--;
            strecke++;
        }
        if(tankInhalt==0){
            System.out.printf("Tank ist nach %d km leer!%n",strecke);
        }else{
            System.out.printf("Wir sind nach %d km angekommen!%nIm Tank sind noch %f Liter Kraftstoff!%n",strecke, tankInhalt);
        }
        return strecke;
    }
}

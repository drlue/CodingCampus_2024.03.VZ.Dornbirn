package katherina.week08.Car;

public class Car {
    private String hersteller;
    private String modell;
    private int kiloWatt;
    private int tankinhalt;
    private int gewicht;

    private Antriebsart antriebsart;

    private enum Antriebsart {
        BENZIN,
        DIESEL,
        GAS,
        STROM
    }

    public Car(String hersteller,String modell,int kiloWatt,int tankinhalt,int gewicht, Antriebsart antriebsart){
        this.hersteller=hersteller;
        this.modell=modell;
        this.kiloWatt=kiloWatt;
        this.tankinhalt=tankinhalt;
        this.gewicht=gewicht;
        this.antriebsart=antriebsart;
    }
}

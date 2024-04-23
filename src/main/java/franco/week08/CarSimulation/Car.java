package franco.week08.CarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private int horsePower;

    private double weight;
    private double tankContent;
     enum MotorPowered{PETROL,DIESEL,GAS,ELECTRICITY};
     private MotorPowered motorPowered;

     public Car(String manufacturer,String model,int horsePower,MotorPowered motorPowered){
         this.manufacturer=manufacturer;
         this.model=model;
         this.horsePower=horsePower;
         this.motorPowered=motorPowered;

     }













}

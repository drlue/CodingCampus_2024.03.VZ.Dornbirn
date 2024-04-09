package katherina.week06.day01.ZweitesBeispielNachGyula.example2;

public class Car {
    private String model;

    private Motor motor;

    public Car(String model){
        this.model = model;
        this.motor = null;

        //Hier ist es das Feld: public Field (hier "Car"). Geholt wird es aber woanders.
    }
//Wenn ich es richtig verstanden habe, dann heißt das "Sofern die Variable namens 'motor' nicht mit einem Wert belegt wurde,
    //enthält sie keinen Wert und daher wird an dieser Stelle "motor=null" ausgegeben, wenn keiner "eingebaut" wird.
    //Es legt außerdem fest, dass ein Automodell nie leer sein darf.
    public String getModel() {
        return model;
    }
    //Die Benennung mit "getMethode" is nicht optional! Es ist wichtig, die Benennungen genau so zu halten, damit alles funktioniert.
    //Abstrakte Bezeichnung: getDeclaredMethod. Wenn ich also eine Methode "Motor" deklariere, muss ich den Namen exakt gleich schreiben.
    //Es gibt auch getField. Das scheint mir hier auch eventuell zuzutreffen, aber hier sollte ich auch fragen.

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        if (motor != null) {
            if (motor.getCar() != null) {
                motor.getCar().motor = null;
            }
            motor.setCarIntern(this);
        }
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }
}

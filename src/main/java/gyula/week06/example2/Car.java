package gyula.week06.example2;

public class Car {
    private String model;

    private Motor motor;

    public Car(String model){
        this.model = model;
        this.motor = null;
    }

    public String getModel() {
        return model;
    }

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

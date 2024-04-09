package gyula.week06.example2;

public class Motor {
    private int power;

    private Car car;

    public Motor(int power){
        this.power = power;
        this.car = null;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if ((car != null) && (car.getMotor() == null)){
            car.setMotor(this);
        } else if (car == null && this.car != null){
            this.car.setMotor(null);
        }
    }

    void setCarIntern(Car car){
        this.car = car;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "power=" + power +
                " car=" + (car!=null?car.getModel():"on shelf") + "}";
    }
}

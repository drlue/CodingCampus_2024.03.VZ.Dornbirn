package katherina.week06.day01.ZweitesBeispielNachGyula.example2;

public class Motor {
    private int power;
    //Die purpurnen Dinger sind Felder!
    //A Field provides information about, and dynamic access to, a single field of a class or an interface.
    // The reflected field may be a class (static) field or an instance field.
    //A Field permits widening conversions to occur during a get or set access operation, but throws an
    // IllegalArgumentException if a narrowing conversion would occur.
    //Angewendet auf "Power": Enthält Informationen und ermöglicht über die Klasse "Motor" hinaus Zugang zum Motor-Wumms.

    private Car car;

    public Motor(int power){
        this.power = power;
        this.car = null;
    }

    public Car getCar() {
        return car;
    }
    //Hier wird das Auto "geholt".

    public void setCar(Car car) {
        if ((car != null) && (car.getMotor() == null))
        //Sofern ein Auto festgelegt wurde und kein Motor verbaut wurde ...
            {
            car.setMotor(this);
            //setze die Variable "car" rekursiv.
        } else if (car == null && this.car != null){
            //Sofern zwar kein Auto festgelegt wurde, aber die Instanz nicht grundsätzlich leer ist ...
            this.car.setMotor(null);
            //ist die Motor-Instanz aller irgendwie definierten Autos erstmal leer.
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
        //Sofern ein Auto definiert wurde und ein Motor verbaut wurde, soll neben der Arbeitskraft des Motors das
        //Model des Autos mit ausgegeben werden.
    }


}

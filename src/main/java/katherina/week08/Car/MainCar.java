package katherina.week08.Car;

public class MainCar {
    public static void main(String[] args) {

        Car audiA2 = new Car("Audi","A2",45,42,855, Car.Antriebsart.DIESEL);
        Car changLi = new Car("Chang Li","Freeman",1.2, 85,323,Car.Antriebsart.STROM);
        Car nissan = new Car("Nissan","X-Trailer",130,80,1665,Car.Antriebsart.DIESEL);
        Car drivetestAuto = new Car("Crashtest-Dummy","A2",45,5,855, Car.Antriebsart.DIESEL);

        System.out.print("Audi: \n");
        audiA2.drive(300);
        System.out.print("Chang Li Freeman: \n");
        changLi.drive(300);
        System.out.print("Nissan: \n");
        nissan.drive(300);
    }
//Laut Google hat der Chang Li Freeman eine Reichweite von 400 bis 100km je nach Gelände. Ich habe durch Herumprobieren mit den Werten
    //geguckt, mit welcher "Tankfüllung" das Auto ca. 50km hat und die dann als Wert festgelegt.
}

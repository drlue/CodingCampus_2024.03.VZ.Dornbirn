package christian.week07.carSimulation;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","CivicSport",100,1000,0, Car.Antriebsart.BENZIN);
        Car car2 = new Car("Honda","CivicSport",50,700,0, Car.Antriebsart.DIESEL);

        car1.tanken(20);
        car2.tanken(20);
        car1.drive(200);
        car2.drive(200);

        System.out.println(car1.getTankInhalt());
        System.out.println(car2.getTankInhalt());
    }

}

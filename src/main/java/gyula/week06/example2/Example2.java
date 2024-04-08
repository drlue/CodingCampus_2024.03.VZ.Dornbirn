package gyula.week06.example2;

public class Example2 {
    public static void main(String[] args) {
        Motor m = new Motor(100);
        Car car1 = new Car("Audi M100");
        Car car2 = new Car("Honda Hix");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 1 ==");
        car1.setMotor(m);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 2 ==");
        car2.setMotor(m);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 3 ==");
        car2.setMotor(null);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 4 ==");
        car1.setMotor(m);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 5 ==");
        m.setCar(car2);
        System.out.println(car1);
        System.out.println(car2);
    }
}

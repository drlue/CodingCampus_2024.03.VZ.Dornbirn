package irem.week08.Hospital;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital("Meri Bulo Clinic", "06:00", 500);
        Emergency emergency= new Emergency("Emergency", "05:00",100);
        Emergency emergency1 = new Emergency("Living","05:20",110);

        hospital.addDeparment(emergency);
        hospital.addDeparment(emergency1);
        hospital.printStructure();

    }
}

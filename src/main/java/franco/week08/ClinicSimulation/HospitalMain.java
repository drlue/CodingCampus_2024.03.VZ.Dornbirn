package franco.week08.ClinicSimulation;

public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital1 =new Hospital("St Maria Central Clinic","06:00 am",500);
        Department depart= new Emergency("Emergency Room","08:00",50);
        depart.addPatient(new Patient("Renata"));
        hospital1.printStructure();

    }

}

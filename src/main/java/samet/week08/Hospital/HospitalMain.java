package samet.week08.Hospital;

public class HospitalMain {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Sacred Heart Hospital");
        System.out.println(hospital);

        Ambulance ambulance = new Ambulance("Ambulance "," 06:00 - 23:00 ",10);
        Stationary stationary = new Stationary("Statuionary",10);

        Patient hans = new Patient("Hans");
        Patient josef = new Patient("Josef");
        Patient ali = new Patient("Ali");
        Patient heike = new Patient("Heike");


        ambulance.addPatient(hans);
        ambulance.addPatient(josef);

        stationary.addPatient(ali);
        stationary.addPatient(heike);


        josef.setDischarged(true);

        hans.setDischarged(true);






    }
}

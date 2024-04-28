package samet.week08.Hospital;

public class HospitalMain {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Sacred Heart Hospital");
        System.out.println(hospital);

        Ambulance ambulance = new Ambulance("Ambulance "," 06:00 - 23:00 ",10);
        Stationary stationary = new Stationary("Statuionary",10);

        Patient hans = new Patient("Hans",27,"Grippe", Patient.PatientStatus.Mild);
        Patient josef = new Patient("Josef", 56,"Herzinfarkt", Patient.PatientStatus.Serious);
        Patient ali = new Patient("Ali", 21,"Armbruch", Patient.PatientStatus.Moderate);
        Patient heike = new Patient("Heike", 33,"Schusswunde", Patient.PatientStatus.Serious);
        ambulance.addPatient(hans);
        ambulance.addPatient(josef);
        ambulance.addPatient(ali);
        ambulance.addPatient(heike);

        ambulance.checkPatient();



    }
}

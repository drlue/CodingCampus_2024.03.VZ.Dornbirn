package ardijanla.week08.SchwarzawlKlinik;

public class SchwarzWaldKlinik {
    public static void main(String[] args) {

        Hospital schwarzwald = new Hospital("Schwarzwald");

        Department department = new Department("HNO");

        Ambulance ambulance = new Ambulance("HNO",243,21,12);

        Ward ward = new Ward("ward");

        Patient Ardijan = new Patient("Ardijan","12", Patient.Illness.PANIC);
        Patient asd = new Patient("jürgen","12", Patient.Illness.MEDIUM);


        ambulance.processPatient(Ardijan);
        ambulance.processPatient(asd);

        ward.showPatients();
    }
}

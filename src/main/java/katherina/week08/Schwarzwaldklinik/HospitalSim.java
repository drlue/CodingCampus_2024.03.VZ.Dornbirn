package katherina.week08.Schwarzwaldklinik;

//Manche Abteilungen sind Ambulanzen anderen sind Stationen.
// Ambulanzen haben eine Öffnungszeit sowie einen Warteraum mit einer definierten Anzahl von Plätzen.
// Stationen beinhalten Zimmer in denen sich Betten befinden.
// Wenn ein Patient ins Krankenhaus kommt, besucht dieser entsprechend seiner Erkrankung eine Ambulanz.
// Falls der Fall schwerwiegender ist, muss er in einer Station aufgenommen werden.
// Patienten werden untersucht, behandelt und eventuell gepflegt.
// Aus der Ambulanzen dürfen die Patienten nach kurzer Zeit wieder nach Hause gehen.
// Patienten die in Stationen behandelt werden, müssen solange da bleiben, bis sie vollständig geheilt sind.


import static katherina.week08.Schwarzwaldklinik.Patient.fetchHealth;
import static katherina.week08.Schwarzwaldklinik.Patient.generatePatient;

public class HospitalSim {


    public static void main(String[] args) {

        Krankenhaus schwarzwald = new Krankenhaus("Schwarzwaldklinik", "Montag bis Sonntag, 5:00 bis 22:00", 50);

        Abteilung neuro = new Abteilung("Neurologie");
        Abteilung herz = new Abteilung("Herzzentrum");

        System.out.println(generatePatient());
        System.out.println();
    }

}

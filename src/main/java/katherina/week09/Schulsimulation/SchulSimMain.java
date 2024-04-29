package katherina.week09.Schulsimulation;

public class SchulSimMain {
    public static void main(String[] args) {

        Schule borgandelsbuch =new Schule("BORG Andelsbuch","Andelsbuch",2024);

        Raum klassenzimmer1 = new Klassenzimmer("Raum 0-1",30);
        Raum klassenzimmer2 = new Klassenzimmer("Raum 0-2",30);
        Raum edv = new Klassenzimmer("EDV-Raum 0-3",30);

    }
}

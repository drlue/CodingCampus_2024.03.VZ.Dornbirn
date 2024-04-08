package katherina.week06.day01.BeispielNachGyula;

public class Beispiel1 {
    //Bei diesem Beispiel besteht das Programm aus drei Klassen. Beispiel1, Participant und Workshop.
    //Ich nutze "Beispiel 1" für die finale Ausgabe des gewünschten Outputs.
    //Ich nutze die anderen Klassen, um Parameter zu hinterlegen.
    public static void main(String[] args) {
        Workshop software = new Workshop("Software Developer V2", 500, 8250);
        Workshop toepfer = new Workshop("Pottery", 10, 100);
        //Ein Objekt wird durch Aufruf eines Konstrukors mit new gebildet:
        // "Ein neues Objekt der Gruppe Workshop wird erstellt. Mit Hilfe der Variable "software" wird dessen Output variiert.
        //Die Ursache dafür liegt darin, dass er zwingend mit dem Namen der Klasse identisch sein muss, in der er deklariert wurde
        // und deren Objekte er bildet (also aufpassen beim Benennen!).
        // Ein Konstruktor wird außerhalb einer Klasse nie direkt, sondern ausschließlich mit vorangestelltem new aufgerufen.
        // Innerhalb der eigenen Klasse kann ein Konstruktor mit dem Schlüsselwort this angesprochen werden, aber NUR dort. Hier nicht.
        //siehe unten.
        toepfer.setName("       ");
        software.setName("Software Developer BB");

        System.out.println(software.getName());
        System.out.println(software);


        Participant lukas = new Participant("Lukas");
        //Erstellt eine Variable namens "lukas", die mit dem String "Lukas" gefüllt ist. In der Klasse "Participant"
        // wurde zuvor festgelegt, dass dieser String in eine Ausgabe eingefügt werden soll, die zurückgibt, in welchem
        // Kurs eine Person ist.
        Participant christian = new Participant("Christian");

        lukas.setWorkshop(software);
        christian.setWorkshop(software);

        System.out.println(lukas);
        System.out.println(christian);

        software.setName("Kochkurs für Anfänger");
//setName überschreibt den Wert von "software" mit "Kochkurs für Anfänger".
        //wie in "Participant" erwähnt, ist das ein Setter. Er setzt einen Wert.
        System.out.println(lukas);
        System.out.println(christian);

        software.setName("dem Mitgliedstreffen der Gummibärenbande");
        System.out.println(lukas);
        System.out.println(christian);
        //Tatsächlich. Der Output lautet dann:
        //Die Person Lukas nimmt an dem Mitgliedstreffen der Gummibärenbande teil.

    }
}

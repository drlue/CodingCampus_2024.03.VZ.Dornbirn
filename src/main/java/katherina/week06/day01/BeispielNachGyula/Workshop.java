package katherina.week06.day01.BeispielNachGyula;

public class Workshop {

    public String name;
    private int countHours;
    private int price;
    //Hier habe ich die Variablen benannt.

    public Workshop(String name, int countHours, int price) {
        this.name = name;
        this.countHours = countHours;
        this.price = price;
    }
    //this = "In dieser Klasse festgelegte Dinge", inklusive deren Werte.
    //Das ist ein Konstruktor.
    //Die kann ich nun auf diese Weise "drüben" aufrufen.

    public String getName() {
        return name;
    }
    //Diese Methode nennt sich auch "Getter", sie wird verwendet, um etwas auszulesen.

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("\"" + name + "\" ist kein gültiger Name.");
        }
    }
    //Hier ist die Funktion, die etwaige Fehler abfangen soll. In diesem Fall: "Führe setName nur aus, wenn ein Name eingegeben wurde."
//Über diese Methode werden außerdem Dinge festgelegt, das ist der Setter. Siehe die Ausführung in "Beispiel1".

    @Override
    public String toString() {
        return "Workshop: " + name;
        //Heute habe ich in der Bootsfahrschule gelernt, dass ... ich Returnstatements stylen darf.
    }
    //Diese Klasse kann nicht "abgespielt" werden, da sie ausschließlich dazu da ist, für die "Beispiel1"-Klasse Dinge aufzubewahren
}

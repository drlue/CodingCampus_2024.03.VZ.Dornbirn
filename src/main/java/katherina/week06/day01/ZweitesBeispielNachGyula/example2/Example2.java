package katherina.week06.day01.ZweitesBeispielNachGyula.example2;

//Kopiert und eingefügt, damit ich es zu Lernzwecken kommentieren und daran herumtesten kann.
//Dies ist die Hauptdatei. Sie enthält als einzige eine Main-Methode.
public class Example2 {
    public static void main(String[] args) {
        Motor m = new Motor(100);
        //Ich erstelle ein Objekt namens m vom Dateityp Motor mit der Eigenschaft "Wumms = 100".
        //Diese Eigenschaft wurde in der Klasse "Motor" als Parameter festgelegt.
        Motor n = new Motor(240);
        Car car1 = new Car("Audi M100");
        Car car2 = new Car("Honda Hix");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 1 ==");
        //Druckt ausschließlich die Autos ohne Motor aus, da der Motor noch nicht "eingebaut" wurde.
        car1.setMotor(m);
        //Dieser Befehl baut in Auto Nummer 1 einen Motor ein.
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 2 ==");
        //Ausgabe: Auto 1 inklusive Motor, Auto 2 dagegen ohne Motor. Denn in Auto 2 wurde keiner eingebaut.
        car2.setMotor(m);
        //JETZT wurde bei Auto 2 ein Motor eingebaut.
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 3 ==");
        //In der Ausgabe hat jetzt NUR Auto 2 einen Motor! (Dass in dem Codeblock davor in Auto 1 einer verbaut wurde,
        // ist für diese Ausgabe irrelevant.)
        car2.setMotor(null);
        //Jetzt "nullt" der Code aktiv Auto 2 den Motor, vulgo: Der Motor wird ausgebaut.
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 4 ==");
        //Somit hat jetzt wieder keins der Autos einen Motor.
        car1.setMotor(m);
        car2.setMotor(n);
        //Und jetzt wieder Auto Nummer 1. Und zuwar NUR Auto Nummer 1.
        //Ich habe außerdem zu Testzwecken ein Objekt in geschaffen und baue den anderen Motor mal in Auto 2 ein.
        //Theoretischer Output: Auto 1 hat Motor 1, Auto 2 hat Motor 2. Und zwar nur in diesem Block.
        //Tatsächlicher Output: Car{model='Honda Hix', motor=Motor{power=240 car=Honda Hix}}
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("== 5 ==");
        //m.setCar(car2);
        //n.setCar(car2);

        //Achtung! Hier wird der Output durch meinen Motor-Einbau verändert! Kommentiere ich // car2.setMotor(n); aus,
        //ist der Output wie erwartet:
        //Car{model='Audi M100', motor=null}
        //Car{model='Honda Hix', motor=Motor{power=100 car=Honda Hix}}
        //Kommentiere ich es nicht aus, dann ist der Output:
        //Car{model='Audi M100', motor=Motor{power=100 car=Audi M100}}
        //Car{model='Honda Hix', motor=Motor{power=240 car=Honda Hix}}
        //Auto 1 bekommt Motor m, Auto 2 bekommt Motor n.
        //Der Output wird nicht verändert, wenn ich stattdessen n.setCar(car2); schreibe.
        System.out.println(car1);
        System.out.println(car2);


        //Erkenntnis: Ich drucke hier immer exakt den Zustand aus, den ich unmittelbar davor festgelegt habe. Zustands-
        //Änderungen werden jedoch nicht über Instanzen hinweg übertragen. Sie werden von oben nach unten durchgeführt.
        //Reihenfolge ist hier also sehr wichtig.
    }
}

package katherina.week06.day02.Fotoapparat;

//Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
//Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
//Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.

public class Fotoapparat {

    public static void main(String[] args) {
        Kamera kamera1 = new Kamera("Retinette", "Kodak", 17);
        Kamera kamera2 = new Kamera("i737", "Polaroid", 7.5f);
        Kamera kamera3 = new Kamera("Weitwinkelmonster", "Weitwinkelspezi", 37);
        Objektiv standardzoomobjektiv = new Objektiv(35, 80);
        Objektiv starresObjektiv = new Objektiv(35, 35);
        Objektiv weitwinkel = new Objektiv(8, 20);
        Speicherkarte microSD = new Speicherkarte(3000);
        Speicherkarte macroSD = new Speicherkarte(300000000);



        System.out.println("Hallo! Lass uns doch ein Foto machen! Und zwar mit diesem Schätzchen: ");
        kamera1.setSpeicherkarte(microSD);
        kamera1.setObjektiv(weitwinkel);
        kamera1.takePhoto();
//        System.out.println(kamera1);
//        kamera1.setObjektiv(starresObjektiv);
//        System.out.println(kamera1);
//        System.out.println("========================");
//        kamera1.takePhoto();

    }
//Notiz: Erstelle Methoden um zu erfragen wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
// Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
//Meine Vermutung: Ich muss adieren und eventuell in einen File schreiben, wie oft addiert wurde.
//Index = 0

}

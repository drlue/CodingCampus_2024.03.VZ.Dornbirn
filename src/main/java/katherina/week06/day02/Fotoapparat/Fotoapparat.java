package katherina.week06.day02.Fotoapparat;

//Erstelle eine Fotoapparat Klasse.
//
//Erstelle für die Attribute getter und setter
//Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
//Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
//Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.

public class Fotoapparat {
    public static void main(String[] args) {
        Kamera kamera1 = new Kamera(4, 280, "Retinette", "Kodak", 17);
        Kamera kamera2 = new Kamera(14, 100, "i737", "Polaroid", 75E-1F);

        System.out.println(kamera1);
        System.out.println();
        System.out.println(kamera2);
    }
}

package katherina.RandomPersonenGenerator;


import java.util.Arrays;
import java.util.Random;

public class RandomLehrperson {


        private static final Random random = new Random();
        private static final String[] nachname = new String[]{"Schmidt", "Grabher", "Cecil", "Kraus", "Kofler", "Pirker", "Wagner", "Gruber", "Winkler", "Weber", "Huber","Bauer","Wimmer","Müller","Wallner","Wolf","Steiner","Pichler","Moser","Mayer","Hofer","Leitner","Berger"+
                "Fuchs","Eder","Fischer","Schmid","Weiss","Wieser","Schwarz","Maier","Schneider","Reiter","Winter","Mayr","Egger","Baumgartner","Lang","Brunner","Auer","Lechner","Binder","Aigner","Weiß","Ebner","Koller","Zimmermann","Wiesinger","Lehner","Thaler","Haas","Zauner", "Schuster"+
                "Walter","Holzer"    };
        private static final String[] fach = new String[]{"Lehrperson.Fach.DEUTSCH", "Lehrperson.Fach.INFORMATIK", "Lehrperson.Fach.TURNEN","Lehrperson.Fach.LATEIN","Lehrperson.Fach.MATHE"};

        public static String generateLehrperson() {
            return "Person lehrperson = new Lehrperson(\"Professor " + (nachname[random.nextInt(nachname.length)]) + "\","
                     + fach[random.nextInt(fach.length)] + ");";
        }
    }
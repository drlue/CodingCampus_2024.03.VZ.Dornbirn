package aki.week07.foto;

public class InfoUeberFotoapparat {
    public static void main(String[] args) {
        Fotoapparat kamera = new Fotoapparat("Phillip FF20120", "Akraman", 20.5, "Schwarz");
        Fotoapparat kamera2 = new Fotoapparat("Opfer LT211", "Ardijan", 40, "Gelb");

        System.out.println("=====================================");
        System.out.println("Erste Kamera: \n" + kamera);
        System.out.println("=====================================");
        System.out.println("Zweite Kamera: \n" + kamera2);
        System.out.println("=====================================");

        kamera.takeFoto();
        kamera2.takeFoto();
    }
}
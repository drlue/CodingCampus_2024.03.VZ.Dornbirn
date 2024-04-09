package christian.week06.fotoapparatPackage;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fotoapparat epson = new Fotoapparat("Megacam", "Fuchsmannenteprise", 1200, 600, sc);
        Objektiv linse = new Objektiv(120, 220);
        Speicherkarte sp = new Speicherkarte(800);
        Objektiv megalinse = new Objektiv(200, 400);


        epson.setObjektiv(linse);
        epson.setSpeicherkarte(sp);
        epson.takePhoto();
        System.out.println(epson.showPhotos());


    }
}
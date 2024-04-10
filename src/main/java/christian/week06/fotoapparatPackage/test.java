package christian.week06.fotoapparatPackage;

import java.util.Scanner;

public class test {
    public static int photoCounter=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fotoapparat epson = new Fotoapparat("Megacam", "Fuchsmannenteprise", 1200, 600);
        Objektiv linse = new Objektiv(120, 220);
        Speicherkarte sp = new Speicherkarte(800,"Speicherkarte1");
        Objektiv megalinse = new Objektiv(200, 400);


        epson.setSpeicherkarte(sp);
        epson.setObjektiv(linse);
        epson.takePhoto();
        System.out.println(epson.showPhotos());

        System.out.println(epson.showPhotoCount());


    }
}
package lukas.week06.Example4;

import java.sql.SQLOutput;

public class Example4 {

    public static void main(String[] args) {
        //Define Cameras
        Camera camera1 = new Camera("Nikon", "D850", 42f, 1.0f);
        Camera camera2 = new Camera("Canon", "EOS-1DX", 20.2f, 0.5f);
        Camera camera3 = new Camera("Olympus", "OM-D-EM1", 25f, 0.6f);

        //Define MemoryCards
        MemoryCard sd1 = new MemoryCard("Samsung", 128);
        MemoryCard sd2 = new MemoryCard("Sandisk", 512);
        MemoryCard sd3 = new MemoryCard("Samsung", 1028);

        //Define Lenses
        Lens teleLens = new Lens("Nikon", "Tele", 28, 300);
        Lens portraitLens = new Lens("Sigma", "Portrait", 40,80);
        Lens wideAngleLens = new Lens("Tokina", "Wide", 10, 18);

        //add lens and memory card to camera
        camera1.setLens(teleLens);
        camera1.setMemoryCard(sd1);
        System.out.println(camera1);
        //
        camera2.setLens(portraitLens);
        System.out.println();

        boolean canTakePhoto = true;
        for (int i = 0; i < 40; i++) {
            canTakePhoto = camera1.takePhoto();
        }
        System.out.println(camera1);
        System.out.println(sd1.getListOfImages());

        //put sd1 in camera2
        camera1.setMemoryCard(null);
        camera2.setMemoryCard(sd1);

        while(canTakePhoto) {
            canTakePhoto = camera2.takePhoto();
        }
        System.out.println(camera2);
        System.out.println(sd1.getListOfImages());



    }



}

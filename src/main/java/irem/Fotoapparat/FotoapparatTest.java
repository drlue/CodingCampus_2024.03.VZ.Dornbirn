package irem.Fotoapparat;

public class FotoapparatTest {

    public static void main(String[] args) {
        Fotoapparat nikon = new Fotoapparat(24, 70, "D850", "Nikon", 45);
        Fotoapparat canon = new Fotoapparat(18, 55, "EOS Rebel T7", "Canon", 24);

        System.out.println(nikon);
        nikon.takePhoto();

        System.out.println(canon);
        canon.takePhoto();
    }
}

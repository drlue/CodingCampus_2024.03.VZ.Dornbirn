package irem.Fotoapparat;

public class FotoapparatTest {

    public static void main(String[] args) {
        Objektiv obj = new Objektiv("Sony FE 15-45",15,45);
        Speicherkarte karte = new Speicherkarte(100);
        Fotoapparat nikon = new Fotoapparat("Nikon","D850",24,obj,karte);
        Fotoapparat canon = new Fotoapparat("Canon","D640",57,obj,karte);

        System.out.println(nikon);
        nikon.takePhoto();

        System.out.println(canon);
        for (int i = 0; i <10 ; i++) {
            canon.takePhoto();
        }
    }
}

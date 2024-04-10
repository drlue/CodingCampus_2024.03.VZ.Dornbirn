package ardijanla.week06.AufgabeFotoapparat;

public class main {
    public static void main(String[] args) {
        Fotoapparat fa = new Fotoapparat(25,60,"X6534Gh3","Canon",20);
        fa.takePhoto();
        System.out.println(fa.toString());
    }
}

package demian.week07.day02.Fotoapparat;

public class Testclass {
    public static void main(String[] args) {

        Objektiv nikonAPX3214 = new Objektiv(3.2f);
        Fotoapparat NikonP1000 = new Fotoapparat("P1000","NIKON",10,nikonAPX3214);
        Fotoapparat PentaxK30 = new Fotoapparat("K30","Pentax",10,nikonAPX3214);
        Speicherkarte GB100 = new Speicherkarte(1000);



        GB100.setFreierSpeicher(10);
        System.out.println(GB100.getFreierSpeicher());
        System.out.println(GB100.getPhotostaken());

        NikonP1000.takePhotoOfShep();


    }
}

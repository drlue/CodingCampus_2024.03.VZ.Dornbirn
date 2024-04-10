package ardijanla.week06.FotoApparatExtended;


public class main {
    public static void main(String[] args) {

        System.out.println(FotoLabor.getInstance());

        Objektiv objektiv = new Objektiv(20,50);
        Speicherkarte speicherkarte = new Speicherkarte(30);
        Fotoapparat fa = new Fotoapparat("xsadsadsad","canon",40);
        Fotoapparat fa2 = new Fotoapparat(">>>>>>>>>>","Philipps",50);
        fa.setObjektiv(objektiv);
        fa.changeStorage(speicherkarte);
        fa2.changeStorage(speicherkarte);
        System.out.println(fa.getObjektiv());
        System.out.println(fa2.getObjektiv());

        fa2.setObjektiv(objektiv);
        System.out.println(objektiv.getFotoapparat());
        fa.setObjektiv(objektiv);
        System.out.println(objektiv.getFotoapparat());
        System.out.println(fa);
        System.out.println(fa2);

        objektiv.setFotoapparat(null);

    }
}

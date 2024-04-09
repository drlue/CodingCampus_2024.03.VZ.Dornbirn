package samet.week06.FotoApparat;

public class Picture {
    public static void main(String[] args) {


        Memory mc = new Memory("Kingston", "4GB", 14);
        Objektiv obj = new Objektiv("Sony", "RLE-100", 18, 100);
        Camera sony = new Camera("Sony", "A-300", 12);
        sony.setObjektiv(obj);
        sony.setSpeicherkarte(mc);
        System.out.println(sony);

        System.out.println(sony);
        for (int i = 0; i < 20; i++) {
            sony.takePicture();
        }

        sony.setObjektiv(null);
        sony.takePicture();

    }
}

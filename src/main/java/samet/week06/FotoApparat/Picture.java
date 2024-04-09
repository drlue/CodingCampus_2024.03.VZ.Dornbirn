package samet.week06.FotoApparat;

public class Picture {
    public static void main(String[] args) {

        Camera camera = new Camera("L5690","Sony",18.5,799,55,40);

        System.out.println(camera.getModell());
        System.out.println(camera.getHersteller());
        System.out.println(camera.getMegapixel());
        System.out.println(camera.getPreis());
        System.out.println(camera.getBrennWeiteMax());
        System.out.println(camera.getBrennWeiteMin());

    }
}

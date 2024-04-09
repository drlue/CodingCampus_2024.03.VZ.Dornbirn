package gyula.week06.photo;

public class PhotoApp {
    public static void main(String[] args) {
        Objective obj = new Objective("Sony", "RLE-100", 18, 100);
        Camera sony = new Camera("Sony", "A-300", 12);
        sony.setObjective(obj);
        System.out.println(sony);
        sony.takePhoto();

        sony.setObjective(null);
        System.out.println(sony);
        sony.takePhoto();
    }
}

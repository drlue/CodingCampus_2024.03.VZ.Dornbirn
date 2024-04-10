package franco.week06.CameraApp;

public class Test {
    public static void main(String[] args) {
        Camera camera1 = new Camera("Hdxv-100D", "Sony", 24, 600);
        Lens newLens = new Lens(150, 250);
        MemoryCard edin = new MemoryCard("edin", 3000);

        camera1.setMemoryCard(edin);

    }
}

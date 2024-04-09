package gyula.week06.photo;

public class PhotoApp {
    public static void main(String[] args) {
        MemoryCard mc = new MemoryCard("Kingston", "4GB", 14);
        Objective obj = new Objective("Sony", "RLE-100", 18, 100);
        Camera sony = new Camera("Sony", "A-300", 12);
        sony.setObjective(obj);
        sony.setMemory(mc);
        System.out.println(sony);

        System.out.println(sony);
        for (int i = 0; i < 20; i++) {
            sony.takePhoto();
        }

        sony.setObjective(null);
        sony.takePhoto();
    }
}

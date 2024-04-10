package gyula.week06.photo;

public class MemoryCard {
    private String manufacture;
    private String model;
    private double freeSpace;

    public MemoryCard(String manufacture, String model, double freeSpace){
        this.manufacture = manufacture;
        this.model = model;
        this.freeSpace = freeSpace;
    }

    public boolean savePHotos(int megapixel){
        if (0.30 * megapixel > freeSpace){
            System.out.println("Memory Card is full");
            return false;
        } else {
            freeSpace -= (0.3 * megapixel);
            System.out.println("Success");
            return true;
        }
    }
}

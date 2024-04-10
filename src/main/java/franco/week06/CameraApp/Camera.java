package franco.week06.CameraApp;

public class Camera {
    private String model;
    private String brand;
    private int megaPixel;
    private double batteryCapacity;
    private Lens lens;
    private MemoryCard memoryCard;

    public Camera(String model, String brand, int megaPixel,double batteryCapacity) {
        this.model = model;
        this.brand = brand;
        this.megaPixel = megaPixel;
        this.batteryCapacity=batteryCapacity;
        lens = null;
        memoryCard = null;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Enter a valid model...");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Enter a valid model please....");
        }
    }

    public Lens getLens() {
        return lens;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public void setMemoryCard(MemoryCard NewMemoryCard) {
        if (memoryCard == null) {
            memoryCard = NewMemoryCard;
        } else {
            System.out.println("A memorycard is already in!");
        }
    }
    public void setMegaPixel(int megaPixel) {
        this.megaPixel = megaPixel;
    }

}

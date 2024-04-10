package lukas.week06.Example4;

public class Camera {

    private String manufacturer;
    private String model;
    private float megapixel;
    private Lens lens;
    private MemoryCard memoryCard;
    private int shutterCount;
    private float fileSize;


    //-----------------CONSTRUCTOR-------------------------
    public Camera(String manufacturer, String model, float megapixel, float fileSize) {
        this.manufacturer = manufacturer;
        this.model = model;
        if (megapixel > 0) {
            this.megapixel = megapixel;
        } else {
            this.megapixel = 8;
            System.out.println("Megapixel must be bigger than 0! Wert wird auf 8 gesetzt!");
        }
        this.shutterCount = 0;
        this.lens = null;
        this.memoryCard = null;
        if (fileSize > 0) {
            this.fileSize = fileSize;
        } else {
            this.fileSize = 0.3f;
            System.out.println("Filesize must be bigger than 0! Wert wird auf 0.3 gesetzt!");
        }

    }


    //-----------------GETTER / SETTER-------------------------
    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    //-----------------METHODS-------------------------
    public boolean takePhoto() {
        ImageLZ image = new ImageLZ((this.model + "_" + this.shutterCount), this.fileSize, this.lens);
        boolean isOk = false;
        if (this.lens == null) {
            System.out.println("Cannot take picture without lens!");
        } else if (this.memoryCard == null) {
            System.out.println("Cannot take picture without memory card!");
        } else if (!this.memoryCard.canSave(fileSize)) {
            System.out.println("Cannot take picture, not enough disk space on memory card!");
        } else {
            this.memoryCard.saveFile(image);
            this.shutterCount++;
            System.out.printf("Image %s with %s %s\n", image, this.manufacturer, this.model);
            isOk = true;
        }
        return isOk;
    }


    @Override
    public String toString() {
        return "Camera{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", megapixel=" + megapixel +
                ", shutterCount=" + shutterCount +
                ", lens=" + lens +
                ", memoryCard=" + memoryCard +
                '}';
    }
}

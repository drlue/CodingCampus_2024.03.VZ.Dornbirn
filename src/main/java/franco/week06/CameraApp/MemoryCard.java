package franco.week06.CameraApp;


public class MemoryCard {
    private String name;
    private final int memorySize;
    private float memoryUsed;
    private float memoryLeft;
    String photos;


    public MemoryCard(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
        memoryUsed = 0;
        memoryLeft = memorySize - memoryUsed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
       if(!name.isEmpty()){
           this.name=name;
       }else{
           System.out.println("Please enter a valid name...");
       }
    }
    public boolean safePhotoPossible(int megapixel) {
        if ((this.memoryUsed + 0.3 * megapixel) < this.memorySize) {
            return true;
        } else {
            System.out.println("Memory card is full...");
            return false;
        }
    }
    public void safePhoto(int megapixel, String photo) {
        if ((this.memoryUsed + 0.3 * megapixel) < this.memorySize) {
            this.memoryUsed += (float) (0.3 * megapixel);
            this.photos += photo + ", ";
        }
    }
    public String showPhotos() {
        System.out.println("Photo :  ");
        return this.photos;
    }

}

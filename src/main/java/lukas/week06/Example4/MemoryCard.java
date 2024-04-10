package lukas.week06.Example4;

import java.util.ArrayList;
import java.util.List;

public class MemoryCard {

    private String manufacturer;
    private float memory;
    private float freeDiskSpace;
    private boolean isFull;
    private List<ImageLZ> images;

    public MemoryCard(String manufacturer, float memory) {
        this.manufacturer = manufacturer;
        if (memory > 0) {
            this.memory = memory;
        } else {
            System.out.println("Memory muss größer null sein");
        }
        this.freeDiskSpace = memory;
        this.isFull = false;
        this.images = new ArrayList<>();

    }

    //-----------------GETTER / SETTER ----------------------



    //----------------------------METHODS--------------------------------
    public boolean canSave(float fileSize) {
        if (freeDiskSpace - fileSize >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void saveFile(ImageLZ image) {
        if (canSave(image.getFileSize())) {
            images.add(image);
            this.freeDiskSpace = this.freeDiskSpace - image.getFileSize();
        } else {
            System.out.println("Not enough disk space to save File!");
        }
    }

    public String getListOfImages(){
        StringBuilder sb = new StringBuilder();
        for (ImageLZ i : images) {
            sb.append(i.getFilename());
            sb.append(System.lineSeparator());
        }
        return  sb.toString();
    }

    @Override
    public String toString() {
        return "MemoryCard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memory=" + memory +
                ", freeDiskSpace=" + freeDiskSpace +
                ", fileCount=" + images.size() +
                '}';
    }
}






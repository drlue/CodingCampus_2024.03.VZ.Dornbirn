package lukas.week06.Example4_Camera;

import java.util.Date;

public class ImageLZ {


    private String filename;
    private Date captureDate;
    private float fileSize;
    private Lens lens;

    public ImageLZ(String filename, float fileSize, Lens lens) {
        this.filename = filename;
        this.captureDate = new Date();
        this.fileSize = fileSize;
        this.lens = lens;
    }

    public String getFilename() {
        return filename;
    }

    public float getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "{Image.filename='" + filename + "'}";
    }
}

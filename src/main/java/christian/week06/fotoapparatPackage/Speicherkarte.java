package christian.week06.fotoapparatPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

public class Speicherkarte {
    private String name;
    private int size;
    private float safedMB;
    private String photos;
    private int photoCount;
    private File cloud;

    public Speicherkarte(int Size,String name) {
        this.size = Size;
        this.safedMB = 0;
        this.photoCount = 0;
        this.photos = "";
        this.cloud = null;
        this.name = name;

    }

    public int getSize() {
        return this.size;
    }

    public boolean safePhotoPossible(int megapixel) {
        if ((this.safedMB + 0.3 * megapixel) < this.size) {
            return true;
        } else {
            System.out.println("Speicherkarte ist voll!");
            return false;
        }
    }

    public void safePhoto(int megapixel, String photo) {
        if ((this.safedMB + 0.3 * megapixel) < this.size) {
            this.safedMB += (float)(0.3 * megapixel);
            this.photoCount++;

            this.photos += photo + ", ";
        }
        try {
            cloud = new File ("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian\\week06\\fotoapparatPackage\\"+ this.name + "Photo"+(test.photoCounter+1)+".txt");
            FileOutputStream fos = new FileOutputStream(cloud, true);
            PrintStream ps = new PrintStream(fos);
            ps.println("Image taken at" + LocalDateTime.now() + ":");
            ps.println(photo);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden oder Zugriffsrechte fehlen!");
        }
        test.photoCounter +=1;
    }

    public void deletePhotos() {

        this.safedMB = 0;
        this.photos = "";
    }

    public int showPhotoCount() {
        if (this.photoCount != 0) {
            System.out.println("Anzahl der Fotos: ");
            return photoCount;
        } else {
            System.out.println("Es sind keine Fotos gespeichert!");
            return 0;
        }
    }

    public String showPhotos() {
        System.out.println("Fotos: ");
        return this.photos;
    }
}

package christian.week06.fotoapparatPackage;

public class Speicherkarte {
    private int size;
    private float safedMB;
    private String photos;
    private int photoCount;

    public Speicherkarte(int Size) {
        this.size = Size;
        this.safedMB = 0;
        this.photoCount = 0;
        this.photos = "";

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
            this.safedMB += 0.3 * megapixel;
            this.photoCount++;
            this.photos += ", " + photo;
        }
    }

    public void deletePhotos() {
        this.safedMB = 0;
        this.photoCount = 0;
        this.photos = "";
    }

    public int showPhotoCount() {
        if (this.photoCount != 0) {
            return photoCount;
        } else {
            System.out.println("Es sind keine Fotos gespeichert!");
            return 0;
        }
    }

    public String showPhotos() {
        return this.photos;
    }
}

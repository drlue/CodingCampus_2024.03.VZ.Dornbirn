package christian.week06.fotoapparatPackage;

public class Speicherkarte {
    private int size;
    private float safedMB;

    public Speicherkarte(int Size) {
        this.size = Size;
    }

    public int getSize() {
        return this.size;
    }

    public  boolean safePhoto(int megapixel) {
        if ((this.safedMB + 0.3 * megapixel) < this.size) {
            this.safedMB += 0.3 * megapixel;
            return true;
        } else {
            System.out.println("Speicherkarte ist voll!");
            return false;
        }
    }
}

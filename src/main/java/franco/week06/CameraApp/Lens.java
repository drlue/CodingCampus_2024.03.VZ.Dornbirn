package franco.week06.CameraApp;

public class Lens {
    private int focalLengthMin;
    private int focalLengthMax;

    public Lens(int focalLengthMin, int focalLengthMax) {
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        if (focalLengthMin > 0) {
            this.focalLengthMin = focalLengthMin;
        }
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    public void setFocalLengthMax(int focalLengthMax) {
        if (focalLengthMax > 150) {
            this.focalLengthMax = focalLengthMax;
        } else {
            System.out.println("Lens too weak for the task...");
        }
    }
}

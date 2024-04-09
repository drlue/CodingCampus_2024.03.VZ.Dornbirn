package samet.week06.FotoApparat;

public class Memory {

    private String hersteller;
    private String model;

    private double usedMb;

    public Memory(String hersteller, String model, double usedMb) {
        this.hersteller = hersteller;
        this.model = model;
        this.usedMb = usedMb;
    }

    public boolean savePhoto(int megaPixel) {
        if (0.30 * megaPixel > usedMb) {
            System.out.println("Memory is full!!");
            return false;
        } else {
            usedMb -= (0.3 * megaPixel);
            System.out.println("Success");
            return true;
        }
    }


    }



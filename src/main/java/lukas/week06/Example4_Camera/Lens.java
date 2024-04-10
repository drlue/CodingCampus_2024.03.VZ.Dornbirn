package lukas.week06.Example4_Camera;

public class Lens {
    private String manufacturer;
    private String model;
    private int minFocalLength;
    private int maxFocalLength;

    public Lens(String manufacturer, String model, int minFocalLength, int maxFocalLength) {
        this.manufacturer = manufacturer;
        this.model = model;
        if (minFocalLength > 0){
            this.minFocalLength = minFocalLength;
        }else {
            System.out.println("minFocalLength must be bigger than 0!");
        }
        if(maxFocalLength > 0) {
            this.maxFocalLength = maxFocalLength;
        }else{
            System.out.println("maxFocalLength must be bigger than 0!");
        }
    }


    @Override
    public String toString() {
        return "Lens{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}

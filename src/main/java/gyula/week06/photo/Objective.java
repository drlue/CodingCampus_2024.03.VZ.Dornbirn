package gyula.week06.photo;

public class Objective {
    private String manufacture;
    private String model;
    private int focusMin;
    private int focusMax;

    public Objective(String manufacture, String model, int focusMin, int focusMax){
        this.manufacture = manufacture;
        this.model = model;
        this.focusMin = focusMin;
        this.focusMax = focusMax;
    }

    @Override
    public String toString() {
        return manufacture + " " + model;
    }
}

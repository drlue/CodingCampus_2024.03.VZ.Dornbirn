package gyula.week06.photo;

public class Camera {
    private String manufacture;
    private String model;
    private Objective objective;
    private int megapixel;

    public Camera(String manufacture, String model, int megapixel){
        this.manufacture = manufacture;
        this.model = model;
        this.objective = null;
        this.megapixel = megapixel;
    }

    public void takePhoto(){
        if (objective == null) {
            System.out.println("Photo without objective is not possible");
        } else {
            System.out.println("Click!!!");
        }
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return manufacture + " " + model + (objective != null?" with " + objective + " objective":" without objective");
    }

}

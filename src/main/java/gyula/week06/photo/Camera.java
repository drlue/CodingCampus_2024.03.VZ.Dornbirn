package gyula.week06.photo;

public class Camera {
    private String manufacture;
    private String model;
    private Objective objective;
    private MemoryCard memory;
    private int megapixel;

    public Camera(String manufacture, String model, int megapixel){
        this.manufacture = manufacture;
        this.model = model;
        this.objective = null;
        this.memory = null;
        this.megapixel = megapixel;
    }

    public void takePhoto(){
        if (objective == null) {
            System.out.println("Photo without objective is not possible");
        } else if (memory == null) {
            System.out.println("Photo without memorid card is not possible");
        } else {
            boolean saved = memory.savePHotos(megapixel);
            if (saved){
                System.out.println("Click!!!");
            }
        }
    }



    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public void setMemory(MemoryCard memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return manufacture + " " + model + (objective != null?" with " + objective + " objective":" without objective");
    }

}

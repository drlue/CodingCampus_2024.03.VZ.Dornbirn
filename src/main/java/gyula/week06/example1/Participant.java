package gyula.week06.example1;

public class Participant {
    private String name;
    private Workshop workshop;

    public Participant(String name){
        this.name = name;
        this.workshop = null;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    @Override
    public String toString() {
        return "Participant " + name + " visits " + workshop.getName();
    }
}

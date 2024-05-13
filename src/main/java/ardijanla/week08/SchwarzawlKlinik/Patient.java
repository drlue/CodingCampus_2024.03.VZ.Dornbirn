package ardijanla.week08.SchwarzawlKlinik;

public class Patient {

    private String name;
    private String id;

    public Illness status;
    enum Illness {
        LOW,
        MEDIUM,
        STRONG,
        PANIC;
    }

    public Illness getStatus() {
        return status;
    }

    public void setStatus(Illness status) {
        this.status = status;
    }

    public Patient(String name, String id, Illness status) {
        this.name = name;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }
}

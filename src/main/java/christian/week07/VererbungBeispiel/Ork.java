package christian.week07.VererbungBeispiel;

public class Ork implements ILebewesen{
    private String clan;
    private int hp;

    public Ork(String clan){
        this.clan = clan;

    }
    @Override
    public void atmen() {
        System.out.println("Ork atmet!");
    }

    @Override
    public void bewegen() {
        System.out.println("Ork bewegt sich!");
    }
}

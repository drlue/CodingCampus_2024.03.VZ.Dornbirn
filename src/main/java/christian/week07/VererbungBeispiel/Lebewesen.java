package christian.week07.VererbungBeispiel;

public class Lebewesen {
    private String name;
    private int hp;

    public Lebewesen(int hp,String name){
        this.hp = hp;
        this.name = name;
    }
    public void bewegen(){
        System.out.println("lebewesen bewegt sich!");
    }
}

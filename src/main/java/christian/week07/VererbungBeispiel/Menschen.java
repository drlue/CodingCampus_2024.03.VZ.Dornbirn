package christian.week07.VererbungBeispiel;

public class Menschen extends Lebewesen{
    public int age;

    public Menschen(int hp,String name,int age){
        super(hp,name);
        this.age = age;
    }

    @Override
    public void bewegen() {
        System.out.println("Mensch bewegt sich!");
    }
}

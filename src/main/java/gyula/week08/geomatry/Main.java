package gyula.week08.geomatry;


import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Geometry> vec = new Vector<>();
        vec.add(new Square(9.99));
        vec.add(new Circle(10));
        //vec.add(new Geometry());
        vec.add(new Rectangle(3.0,4.0));

        IGeometry ig = vec.get(0);
        System.out.println(ig);

        for (Geometry g : vec){
            System.out.println(g);
        }
    }
}

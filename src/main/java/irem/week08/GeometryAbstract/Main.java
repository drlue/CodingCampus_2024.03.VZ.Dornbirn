package irem.week08.GeometryAbstract;

import gyula.week08.geomatry.Circle;
import gyula.week08.geomatry.Geometry;
import gyula.week08.geomatry.IGeometry;
import gyula.week08.geomatry.Rectangle;
import gyula.week08.geomatry.Square;

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


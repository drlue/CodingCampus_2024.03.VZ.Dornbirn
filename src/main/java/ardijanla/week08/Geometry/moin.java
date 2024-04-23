package ardijanla.week08.Geometry;

import java.util.ArrayList;
import java.util.List;

public class moin {
    public static void main(String[] args) {

        Circle kreis = new Circle(4);
        Rectangle vierreck = new Rectangle(10, 15);
        Square quadrat = new Square(15);
        Triangle dreieck = new Triangle(10, 5, 10);
        HouseOfNicolaus houseOfNicolaus = new HouseOfNicolaus(vierreck,dreieck);
        HouseOfNicolaus houseOfNicolausOverload = new HouseOfNicolaus(20,50,15,17,20);


        List<Geometry> geos = new ArrayList<>();
        geos.add(kreis);
        geos.add(vierreck);
        geos.add(dreieck);
        geos.add(quadrat);
        geos.add(houseOfNicolaus);
        geos.add(houseOfNicolausOverload);


        for (Geometry x : geos) {
            System.out.println(x);
        }

    }
}

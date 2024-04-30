package demian.week09.geometry;

import demian.week09.Geometry.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestingCircle {

    // ========== TESTING CIRCLE CLASS ==================
    @Test
    public void testCircleGetCircumference() {
        //Prepare
        int radius = 5;
        Circle objekt = new Circle(radius);
        //Test
        double test = objekt.getCircumference();
        //Restore (Optional)
        //Evaluate
        Assertions.assertEquals(2 * radius * Math.PI, test);
    }

    // === Wenn der Unit-Test irgendwann zufällig auf einen Fehlerfall stößt,
    // muss diese Zahl hergenommen werden und ein separater Unit-Test erstellt werden und
    // selbstverständlich im Code abgesichert werden:
    @Test
    public void testCircleAreaWithRANDOM(){
        //Prepare
        double radius = new Random().nextDouble();
        System.out.println("Testzahl: " + radius);
        Circle circle1 = new Circle(radius);
        //Test
        double test = circle1.getArea();
        //Restore
        //Evaluate
        Assertions.assertEquals((Math.pow(radius,2))*Math.PI,test);
    }


}

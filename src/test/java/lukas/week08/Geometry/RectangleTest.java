package lukas.week08.Geometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {


    @Test
    public void testRectConstrZero1() {
        //test
        double a = 0;
        double b = 7;
        RuntimeException rte = assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(a,b));
        //evaluate
        assertTrue(rte.getMessage().contains("width and height must be greater than 0"));
    }

    @Test
    public void testRectConstrZero2() {
        //test
        double a = 3;
        double b = 0;
        RuntimeException rte = assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(a,b));
        //evaluate
        assertTrue(rte.getMessage().contains("width and height must be greater than 0"));
    }

    @Test
    public void testRectConstrNeagtive1() {
        //test
        double a = -3;
        double b = 7;
        RuntimeException rte = assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(a,b));
        //evaluate
        assertTrue(rte.getMessage().contains("width and height must be greater than 0"));
    }

    @Test
    public void testRectConstrNeagtive2() {
        //test
        double a = 3;
        double b = -7;
        RuntimeException rte = assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(a,b));
        //evaluate
        assertTrue(rte.getMessage().contains("width and height must be greater than 0"));
    }



    @Test
    public void testRectCircumference() {
        //test
        double a = 3;
        double b = 7;
        Rectangle r = new Rectangle(a, b);
        double circum = r.getCircumference();
        //evaluate
        assertEquals(20, circum);
    }

    @Test
    public void testRectArea() {
        //test
        double a = 3;
        double b = 7;
        Rectangle r = new Rectangle(a, b);
        double area = r.getArea();
        //evaluate
        assertEquals(21, area);
    }

    @Test
    public void testDoubleSize() {
        //test
        double a = 3;
        double b = 7;
        Rectangle r = new Rectangle(a, b);
        double area = r.getArea();
        double circum = r.getCircumference();
        r.doubleSize();
        double area2 = r.getArea();
        double circum2 = r.getCircumference();
        //evaluate
        assertEquals(2*circum, circum2);
        assertEquals(4*area, area2);
    }

    @Test
    public void testRectDimString() {
        //test
        double a = 3;
        double b = 7;
        Rectangle r = new Rectangle(a, b);
        String dimString = r.getDimensionString();
        //evaluate
        assertEquals("a x b = 3.0 x 7.0", dimString);
    }







}

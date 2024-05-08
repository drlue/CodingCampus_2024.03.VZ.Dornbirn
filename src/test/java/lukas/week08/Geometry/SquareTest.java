package lukas.week08.Geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquareTest {

    @Test
    public void testRectConstrZero() {
        //test
        double a = 0;
        RuntimeException rte = assertThrows(IllegalArgumentException.class,
                () -> new Square(a));
        //evaluate
        assertTrue(rte.getMessage().contains("width and height must be greater than 0"));
    }

    @Test
    public void testRectConstrNegative() {
        //test
        double a = -1;
        RuntimeException rte = assertThrows(IllegalArgumentException.class,
                () -> new Square(a));
        //evaluate
        assertTrue(rte.getMessage().contains("width and height must be greater than 0"));
    }
}

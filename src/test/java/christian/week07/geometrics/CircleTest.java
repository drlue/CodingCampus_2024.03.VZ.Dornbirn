package christian.week07.geometrics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void getCircumferenceTest() {
        Circle circle = new Circle(3);
        double solution = circle.getCircumference();
        assertEquals(2 * 3 * Math.PI, solution);
    }

    @Test
    public void getArea() {
        Circle circle = new Circle(3);
        double solution = circle.getArea();
        assertEquals(Math.pow(3, 2) * Math.PI, solution);
    }
}

package ardijanla.VectorTesting;

import ardijanla.week06.VectorErstellen.CreateVector;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static ardijanla.week06.VectorErstellen.CreateVector.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {

    @Test
    public void TestGetEvenNumbersMixedNumbers() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        assertEquals(2, CreateVector.getEvenNumbers(vector));
    }

    @Test
    public void testGetEvenNumEmptyVector() {
        Vector<Integer> vector = new Vector<>();
        assertEquals(0, CreateVector.getEvenNumbers(vector));
    }

    @Test
    public void testGetEvenNumAllEven() {
        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(4);
        vector.add(10);
        vector.add(12);
        vector.add(16);
        assertEquals(5, CreateVector.getEvenNumbers(vector));
    }

    @Test
    public void testGetEvenNumAllOdd() {
        Vector<Integer> vector = new Vector<>();
        vector.add(9);
        vector.add(7);
        vector.add(3);
        vector.add(5);
        vector.add(1);
        vector.add(13);
        assertEquals(0, CreateVector.getEvenNumbers(vector));
    }

    @Test
    public void testGetEvenNumNull() {
        assertEquals(-1, CreateVector.getEvenNumbers(null));
    }

    @Test
    public void testSortByAscEmptyVector(){
        Vector<Integer> vector = new Vector<>();

        assertEquals(,sortByAsc(vector));


    }
}

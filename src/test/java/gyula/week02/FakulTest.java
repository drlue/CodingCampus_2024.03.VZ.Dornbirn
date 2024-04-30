package gyula.week02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FakulTest {

    @Test
    public void testFakulCalc(){
        // Prepare
        // Test
        long l = Fakul.fakul(7);
        // Restore (opt)
        // Evaluate
        assertEquals(5040, l);
    }

    @Test
    public void testFakulCalcNegativ(){
        // Prepare
        // Test
        RuntimeException rte = assertThrows(RuntimeException.class,
                () -> Fakul.fakul(-1));
        // Restore (opt)
        // Evaluate
        assertTrue(rte.getMessage().contains("Hello Wolrd!"));

    }

    @Test
    public void testFakulCalcZero(){
        // Prepare
        // Test
        long l = Fakul.fakul(0);
        // Restore (opt)
        // Evaluate
        assertEquals(1, l);
    }

    @Test
    public void testFakulCalcTwenty(){
        // Prepare
        // Test
        long l = Fakul.fakul(20);
        // Restore (opt)
        // Evaluate
        assertEquals(2.43290200817664e18, l);
    }

    @Test
    public void testFakulCalcTwentyOne(){
        // Prepare
        // Test
        long l = Fakul.fakul(21);
        // Restore (opt)
        // Evaluate
        assertEquals(-1, l);
    }
}

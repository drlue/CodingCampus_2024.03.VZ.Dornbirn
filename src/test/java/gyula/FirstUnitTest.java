package gyula;

import java.util.Arrays;
import gyula.week08.sort.BubbleSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUnitTest {

    private static String[] names = {
            "Aki",
            "Christian",
            "Lukas",
            "Katherina",
            "Irem",
            "Gyula",
            "Demian"
    };

    @Test
    public void sortTestAsc(){
        // Prepare
        String[] namesToSort = Arrays.copyOf(names, names.length);

        // Test
        BubbleSort.sort(namesToSort, (a, b) -> a.length() - b.length());

        // Evaluate
        assertEquals(names.length, namesToSort.length);
        assertEquals("Aki", namesToSort[0]);
        assertEquals("Judith", namesToSort[1]);
        assertEquals("Christian", namesToSort[namesToSort.length - 1]);
    }

    @Test
    public void sortTestAscAlpha(){
        // Prepare
        String[] namesToSort = Arrays.copyOf(names, names.length);

        // Test
        BubbleSort.sort(namesToSort, (a, b) -> a.compareTo(b));

        // Evaluate
        assertEquals(names.length, namesToSort.length);
        assertEquals("Aki", namesToSort[0]);
        assertEquals("Lukas", namesToSort[namesToSort.length - 1]);
    }
}

package gyula.week01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void rombusTest(){
        // Prepare
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        // Test
        int size = 5;
        Triangle.rombus("A ", size);
        // Restore
        System.setOut(originalOut);

        // Evaluate
        assertEquals(2 * size - 1, countChar(baos.toString(), '\n'));
        assertEquals(4 * size - 4, countChar(baos.toString(), 'A'));
    }

    public int countChar(String s, char c){
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c){
                ++count;
            }
        }
        return count;
    }
}

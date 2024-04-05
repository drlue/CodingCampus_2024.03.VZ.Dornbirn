package luki.week06;

import java.io.BufferedReader;
import java.io.IOException;

public class RandomTest {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new RandomReader())) {
            for(int i=0; i<100;i++) {
                System.out.println(reader.readLine());
            }
        } catch(IOException exc) {
            //noop
        }
    }
}

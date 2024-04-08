package luki.week06;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class RandomReader extends Reader {
    private Random random = new Random();

    @Override
    public int read(@NotNull char[] cbuf, int off, int len) {
        for(int i=0; i<len; i++) {
            if(Math.random() > 0.99) {
                cbuf[i] = '\n';
            } else {
                cbuf[i] = (char) random.nextInt(0, 127);
            }
        }
        return len;
    }

    @Override
    public void close() throws IOException {
        //noop
    }
}

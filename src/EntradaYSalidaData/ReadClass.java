package EntradaYSalidaData;

import java.io.IOException;
import java.io.Reader;

public class ReadClass {
    public static void main(String[] args) {
        Reader reader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };
    }
}

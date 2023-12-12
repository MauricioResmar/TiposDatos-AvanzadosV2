package EntradaYSalidaData;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamClass {
    public static void main(String[] args) {
        //PrintStream para crear un archivo plano con el texto correspondiente:
        try {
            PrintStream info = new PrintStream("C://FicheroPrintStream.txt");
            info.println("Hola");
        }catch (Exception e){
            System.out.println("Excepción" + e);
        }
    }
}

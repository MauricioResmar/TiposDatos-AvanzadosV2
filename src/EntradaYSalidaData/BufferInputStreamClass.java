package EntradaYSalidaData;

import java.io.*;
import java.util.Scanner;

public class BufferInputStreamClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            InputStream fichero = new FileInputStream("C://FicheroPrueba.txt");
            System.out.println("Se encontro el archivo satisfactoriamente");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.println((char)dato);
                    dato = ficheroBuffer.read();
                }

            }catch (IOException e){
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error " + e.getMessage());
        }

    }
}


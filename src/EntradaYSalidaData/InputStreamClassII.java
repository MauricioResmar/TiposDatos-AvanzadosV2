package EntradaYSalidaData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamClassII {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("C://FicheroPrueba.txt");
            System.out.println("Se encontro el archivo satisfactoriamente");

            try {
                int dato = fichero.read();
                while (dato != -1){
                    System.out.println((char)dato);
                    dato = fichero.read();
                }


            }catch (IOException e){
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error " + e.getMessage());
        }

    }
}
